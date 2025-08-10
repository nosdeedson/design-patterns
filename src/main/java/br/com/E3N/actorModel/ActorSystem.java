package br.com.E3N.actorModel;

import java.util.Map;
import java.util.concurrent.*;

public class ActorSystem {

    private final ExecutorService executorService;
    private final ConcurrentMap<String, Actor> actors = new ConcurrentHashMap<>();

    public ActorSystem(int threads) {
        this.executorService = Executors.newFixedThreadPool(Math.max(1, threads));
    }

    public Actor actorOf(Actor actor){
        if (actors.putIfAbsent(actor.getName(), actor) != null){
            throw new IllegalArgumentException("Actor with this name already exists: " + actor.getName());
        }
        executorService.submit(actor::run);
        return actor;
    }

    public Actor getActor(final String name){
        return actors.get(name);
    }

    public void stopActor(final String name){
        var a = actors.get(name);
        if (a != null) a.stop();
    }

    public void shutdown(){
        for (Map.Entry<String, Actor> e: actors.entrySet()){
            e.getValue().stop();
        }
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(5, TimeUnit.SECONDS)){
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }


}
