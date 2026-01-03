package br.com.E3N.chainOfResponsibility.exampleOne;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OrcKing implements CanMakeRequest {
    private List<RequestHandler> handlers;

    public OrcKing() {
        buildChain();
    }

    private void buildChain(){
        handlers = Arrays.asList(new OrcCommander(), new OrcOfficer(), new OrcSoldier());
    }

    @Override
    public void makeRequest(Request request){
        handlers.stream()
                .sorted(Comparator.comparing(RequestHandler::getPriority))
                .filter(handler -> handler.canHandleRequest(request))
                .findFirst()
                .ifPresent(handler -> handler.handleRequest(request));
    }
}
