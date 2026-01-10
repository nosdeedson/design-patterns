package br.com.E3N.circuitBreaker.exampleOne;

import br.com.E3N.shared.RemoteService;
import br.com.E3N.shared.RemoteServiceInterface;

public class FakeRemoteService {

    public String fetchData(int timeout) {
        final RemoteServiceInterface remoteService = RemoteService.getInstance();
        final int idToRequestFromAPI = 1;
        return remoteService.getTheTitle(idToRequestFromAPI, timeout);
    }
}
