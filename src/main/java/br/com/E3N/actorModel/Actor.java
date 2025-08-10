package br.com.E3N.actorModel;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public abstract class Actor {

    private final BlockingQueue<Message> mailbox = new LinkedBlockingQueue<>();
    private final String name;
    private volatile boolean active = true;

    protected Actor(String name) {
        this.name = name;
    }

    public void sendTo(Actor recipient, String message) {
        var msg = new Message(message, this); // this represents the sender
        if (recipient != null) recipient.enqueue(msg);
    }

    private void enqueue(Message message) {
        if (active) {
            mailbox.offer(message);
        }
    }

    public void stop() {
        this.active = false;
    }

    public boolean isActive() {
        return this.active;
    }

    public String getName() {
        return this.name;
    }

    public void run() {
        try {
            while (isActive()) {
                Message message = mailbox.take();
                try {
                    onReceive(message);
                } catch (Exception e) {
                    System.err.printf("[%s] error while processing message %s: %s%n", name, message, e.getMessage());
                    e.printStackTrace();
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.printf("[%s] ending.%n", name);
        }
    }

    protected abstract void onReceive(Message message);

}
