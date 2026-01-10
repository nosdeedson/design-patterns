package br.com.E3N.callback.remoteService;

import br.com.E3N.shared.RemoteService;
import br.com.E3N.shared.RemoteServiceInterface;

import java.io.IOException;

public class FakeRemoteService {

    public String fetchData(){
        final RemoteServiceInterface remoteService = RemoteService.getInstance();
        final int idToRequestFromAPI = 1;
        final int timeoutTime = 1000;
        return remoteService.getTheTitle(idToRequestFromAPI, timeoutTime);
    }
}
