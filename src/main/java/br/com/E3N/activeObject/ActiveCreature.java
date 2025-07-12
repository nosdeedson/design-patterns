package br.com.E3N.activeObject;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public abstract class ActiveCreature {

    private final BlockingQueue<Runnable> requests;
    private final String name;
    private Thread thread;

    public ActiveCreature(String name) {
        this.name = name;
        this.requests = new LinkedBlockingQueue<>();
        this.thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!Thread.currentThread().isInterrupted()) {
                    try {
                        requests.take().run();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        break;
                    }
                }
            }
        });
        thread.start();
    }

    public void eat() throws InterruptedException {
        requests.put(new Runnable() {
            @Override
            public void run() {
                System.out.println("is eating " + name());
                int count = 0;
                do {
                    count++;
                } while (count <= 1_000_000_000);
                System.out.println("has finished eating " + name());
            }
        });
    }

    public void roam() throws InterruptedException {
        requests.put(new Runnable() {
            @Override
            public void run() {
                System.out.println("has started to roam the wastelands " + name());
            }
        });
    }

    public void kill(int which){
        thread.interrupt();
        System.out.println("Thread " + which + " stoped");
    }

    public String name() {
        return this.name;
    }
}
