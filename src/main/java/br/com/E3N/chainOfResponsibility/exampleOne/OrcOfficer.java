package br.com.E3N.chainOfResponsibility.exampleOne;

public class OrcOfficer implements RequestHandler{
    @Override
    public boolean canHandleRequest(Request request) {
        return request.getRequestType() == RequestType.TORTURE_PRISONER;
    }

    @Override
    public int getPriority() {
        return 2;
    }

    @Override
    public void handleRequest(Request request) {
        request.markHandled();
        System.out.printf("%s is handling the request => %s \n", name(), request.getRequestDescription());
    }

    @Override
    public String name() {
        return "Orc Officer";
    }
}
