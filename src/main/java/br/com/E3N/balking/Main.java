package br.com.E3N.balking;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
//        anonymous class to turn off the machine
        DelayProvider delayProvider = (interval, timeUnit, task) -> {
            try {
                Thread.sleep(timeUnit.toMillis(interval));
                task.run();
            } catch (InterruptedException e) {
                System.out.println();
                Thread.currentThread().interrupt();
            }
        };

        final var machine = new WashingMachine(delayProvider);

        final var factory = CreateThread.createThreadFactory("Worker-");
        var executor = Executors.newFixedThreadPool(3, factory);
        for (int i = 0; i < 3; i++) {
            executor.execute(machine::wash);
        }
        executor.shutdownNow();
        try {
            if(executor.awaitTermination(10, TimeUnit.SECONDS)){
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            System.out.println("Waiting to stop");
            Thread.currentThread().interrupt();
        }
    }
}
