package br.com.E3N.ambassador;

import br.com.E3N.shared.RemoteService;
import br.com.E3N.shared.RemoteServiceInterface;

public class FakeRemoteService {

    public long fetchData(final int id) throws Exception {
        final RemoteServiceInterface remoteService = RemoteService.getInstance();
        final int timeOutTime = 1000;
        return remoteService.doRemoteFunction(id, timeOutTime);
    }
}
