package br.com.E3N.callback.exampleFour;

import br.com.E3N.shared.RemoteService;

import java.io.IOException;
import java.util.function.Function;

public class Task {

    public String executeWith(Function<String, String> callBack) throws IOException, InterruptedException {
       // This is just an example of how to use
        // makes a call to a API just as an example
        var remoteCall = RemoteService.getInstance();
        final int timeoutTime = 1000;
        final int idToRequestFromAPI = 1;
        String result = remoteCall.getTheTitle(idToRequestFromAPI, timeoutTime);
        return callBack.apply(result);
    }
}
