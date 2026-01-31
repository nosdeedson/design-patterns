package br.com.E3N.clientSessionPattern;

public class Server {
    private String host;
    private int port;

    public Server(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public Session getSession(String name, String clientName){
        return new Session(name, clientName);
    }

    public void  process(Request request){
        System.out.println(request);
    }
}
