package br.com.E3N.actorModel;

public class Message {

    private String content;
    private Actor sender;

    public Message() {   }

    public Message(String content, Actor sender) {
        this.content = content;
        this.sender = sender;
    }

    @Override
    public String toString() {
        return "Message{" + "content'" + content + '\'' + ", sender: " + (sender != null ? sender.getName() : "system") + '}';
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Actor getSender() {
        return sender;
    }

    public void setSender(Actor sender) {
        this.sender = sender;
    }
}
