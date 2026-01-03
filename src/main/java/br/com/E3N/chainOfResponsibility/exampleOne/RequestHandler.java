package br.com.E3N.chainOfResponsibility.exampleOne;

public interface RequestHandler {
    boolean canHandleRequest(Request request);
    int getPriority();
    void handleRequest(Request request);
    String name();
}
