package br.com.E3N.circuitBreaker.exampleTwo;

import br.com.E3N.shared.RemoteService;
import br.com.E3N.shared.RemoteServiceInterface;

public class FakeRemoteService {

    public String fetchData(final int idToRequestFromAPI, final int timeout, final boolean hasToThrow) {
        final RemoteServiceInterface remoteService = RemoteService.getInstance();
        return remoteService.getTheTitle(idToRequestFromAPI, timeout, hasToThrow);
    }
}
