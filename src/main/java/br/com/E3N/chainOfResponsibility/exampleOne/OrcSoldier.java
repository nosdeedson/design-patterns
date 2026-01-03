package br.com.E3N.chainOfResponsibility.exampleOne;

public class OrcSoldier implements RequestHandler{
    @Override
    public boolean canHandleRequest(Request request) {
        return request.getRequestType() == RequestType.COLLECT_TAX;
    }

    @Override
    public int getPriority() {
        return 3;
    }

    @Override
    public void handleRequest(Request request) {
        request.markHandled();
        System.out.printf("%s is handling the request => %s \n", name(), request.getRequestDescription());
    }

    @Override
    public String name() {
        return "Orc Soldier";
    }
}
