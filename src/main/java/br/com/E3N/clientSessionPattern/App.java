package br.com.E3N.clientSessionPattern;

public class App {

    public static void execute(){
        var server = new Server("localhost", 8080);
        var session1 = server.getSession("session1", "first client");
        var session2 = server.getSession("session2", "second client");

        var request1 = new Request(session1, "data1");
        var request2 = new Request(session2, "data2");
        server.process(request1);
        server.process(request2);
    }
}
