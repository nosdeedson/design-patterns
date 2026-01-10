package br.com.E3N.shared;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class RemoteService implements RemoteServiceInterface {
    private static final String FAILURE_STRING = "REQUEST FAILED";
    private static final long FAILURE_LONG = -1;
    private static RemoteServiceInterface remoteService = null;
    private HttpClient client;

    private RemoteService() {
        try {
            this.client = HttpClient.newBuilder()
                    .connectTimeout(Duration.ofSeconds(1))
                    .build();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static RemoteServiceInterface getInstance() {
        if (remoteService == null) {
            remoteService = new RemoteService();
            return remoteService;
        }
        return remoteService;
    }

    private JsonResponse fetchJson(final int id, final int timeout) throws IOException, InterruptedException {
        URI uri = URI.create("https://jsonplaceholder.typicode.com/todos/" + id);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .GET()
                .timeout(Duration.ofMillis(timeout))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        final String body = response.body();
        Gson gson = new Gson();
        return gson.fromJson(body, JsonResponse.class);
    }

    public String getTheTitle(final int id, final int timeout) {
        try {
            JsonResponse response = this.fetchJson(id, timeout);
            return response.title();
        } catch ( Exception e) {
            System.out.printf("Remote service failed: [%s] %n", e.getMessage());
            return FAILURE_STRING;
        }
    }

    public String getTheTitle(final int id, final int timeout, final boolean hasToThrow) {
        try {
            JsonResponse response = this.fetchJson(id, timeout);
            return response.title();
        } catch ( Exception e) {
                throw  new RuntimeException("Failed to make the request");
        }
    }


    @Override
    public long doRemoteFunction(final int value, final int timeout) {
        try {
            JsonResponse jsonResponse = this.fetchJson(value, timeout);
            return 10L * jsonResponse.userId();
        } catch (Exception e) {
            System.out.printf("Remote service failed: [%s%n] ", e.getMessage());
            return FAILURE_LONG;
        }
    }

}
