package br.com.E3N.ambassador;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class RemoteService implements RemoteServiceInterface {
    private static final int FAILURE = -1;
    private static RemoteService service = null;
    private HttpClient client;

    private RemoteService() {
        try {
            this.client = HttpClient.newBuilder()
                    .connectTimeout(Duration.ofSeconds(1)) // trying to force fail
                    .build();
        } catch (Exception e) {
            System.out.printf("Creating client HTTP failed: %s", e.getMessage());
        }
    }

    static synchronized RemoteService getRemoteService() {
        if (service == null) {
            service = new RemoteService();
        }
        return service;
    }

//    @Override
//    public long doRemoteFunction(int value) throws Exception {
//        long waitTime = (long) Math.floor(Math.random() * 1000);
//        try {
//            /*
//            the intent of sleep is to simulate a call for a remote server
//             */
//            sleep(waitTime);
//        } catch (InterruptedException e) {
//            System.out.println("Thread sleep interrupted " + e.getMessage());
//        }
//        /*
//            the intent is to represent a failure if has to wait more than 200 milliseconds
//         */
//        return  waitTime >= 200 ? (value * 10L) : -1;
//    }


    @Override
    public long doRemoteFunction(final int value) throws Exception {
        try {

            URI uri = URI.create("https://jsonplaceholder.typicode.com/todos/" + value);
            System.out.println(uri.toString());
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(uri)
                    .GET()
                    .timeout(Duration.ofSeconds(1)) // 0.5 seconds
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() != 200) {
                System.out.printf("Remote service failed : [%d] body (%s)%n", response.statusCode(), response.body());
                return FAILURE;
            }

            final String body = response.body();
            Gson gson = new Gson();
            JsonResponse jsonResponse = gson.fromJson(body, JsonResponse.class);
            System.out.printf("Response of the server: [%s]%n%n", jsonResponse.toString());
            return 10L * jsonResponse.userId;
        } catch (Exception e) {
            System.out.printf("Remote service failed: [%s%n]", e.getMessage());
            return FAILURE;
        }
    }
}
