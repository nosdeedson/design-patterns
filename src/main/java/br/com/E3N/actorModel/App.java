package br.com.E3N.actorModel;

import java.io.File;

public class App {

    public void execute() throws InterruptedException {
        ActorSystem system = new ActorSystem(8);
        ExampleActor alice = new ExampleActor("Alice");
        ExampleActor bob = new ExampleActor("Bob");

        system.actorOf(alice);
        system.actorOf(bob);

        alice.sendTo(bob, "Hello Bob");
        bob.sendTo(alice, "ping");

        // needed the sleep bellow
        Thread.sleep(1_000);

        alice.sendTo(null, "Stop");

        Thread.sleep(1_000);

        system.shutdown();
        System.out.println("ActorSystem shutdown completely.");
    }

}
