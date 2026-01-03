package br.com.E3N.chainOfResponsibility.exampleOne;

public class OrcCommander implements   RequestHandler {

    @Override
    public boolean canHandleRequest(Request request) {
        return request.getRequestType() == RequestType.DEFEND_CASTLE;
    }

    @Override
    public int getPriority() {
        return 1;
    }

    @Override
    public void handleRequest(Request request) {
        request.markHandled();
        System.out.printf("%s is handling the request => %s\n", name(), request.getRequestDescription());
    }

    @Override
    public String name() {
        return "Orc Commander";
    }
}
