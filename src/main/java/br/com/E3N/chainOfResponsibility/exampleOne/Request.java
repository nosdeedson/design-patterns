package br.com.E3N.chainOfResponsibility.exampleOne;

public class Request {
    private final RequestType requestType;
    private final String requestDescription;
    private boolean handled;

    public Request(RequestType requestType, String requestDescription ) {
        this.requestType = requestType;
        this.requestDescription = requestDescription;
    }

    public void markHandled(){
        this.handled = true;
    }

    @Override
    public String toString() {
        return getRequestDescription();
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public String getRequestDescription() {
        return requestDescription;
    }

    public boolean isHandled() {
        return handled;
    }
}
