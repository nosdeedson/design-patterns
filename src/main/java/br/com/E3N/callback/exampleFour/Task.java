package br.com.E3N.callback.exampleFour;

import br.com.E3N.callback.remoteService.RemoteService;

import java.io.IOException;
import java.util.function.Function;

public class Task {

    public String executeWith(Function<String, String> callBack) throws IOException, InterruptedException {
//        This is just an example of how to use
        var remoteCall = new RemoteService();
        String result = remoteCall.getTheTitle(1);
        return callBack.apply(result);
    }
}
