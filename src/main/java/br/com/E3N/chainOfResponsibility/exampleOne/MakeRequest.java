package br.com.E3N.chainOfResponsibility.exampleOne;

public class MakeRequest {
    private final CanMakeRequest canMakeRequest;

    public MakeRequest(CanMakeRequest canMakeRequest) {
        this.canMakeRequest = canMakeRequest;
    }

    public void makeRequest(final Request request){
        canMakeRequest.makeRequest(request);
    }
}
