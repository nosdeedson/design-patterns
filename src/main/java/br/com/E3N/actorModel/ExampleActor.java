package br.com.E3N.actorModel;

public class ExampleActor extends Actor{


    public ExampleActor(String name) {
        super(name);
    }

    @Override
    protected void onReceive(Message message) {
        System.out.printf("[%s] received: %s (from %s)%n", this.getName(), message.getContent(),
                 message.getSender().getName());
        if ("ping".equalsIgnoreCase(message.getContent())){
            var sender = message.getSender();
            if (sender != null) this.sendTo(sender, "pong");

        }
        if ("pong".equalsIgnoreCase(message.getContent())){
            var sender = message.getSender();
            if (sender != null) this.sendTo(sender, "ping");
        }

        if ("stop".equalsIgnoreCase(message.getContent())){
            System.out.printf("[%s] request to stop received.%n", getName());
            stop();
        }
    }
}
