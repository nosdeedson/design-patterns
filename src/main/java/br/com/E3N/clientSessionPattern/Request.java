package br.com.E3N.clientSessionPattern;

public class Request {
    private final String data;
    private final Session session;

    public Request(Session session, String data) {
        this.session = session;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Request{" +
                "data='" + data + '\'' +
                ", session=" + session +
                '}';
    }
}
