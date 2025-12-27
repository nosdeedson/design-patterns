package br.com.E3N.callback.remoteService;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class RemoteService {
    private static final String FAILURE = "REQUEST FAILED";
    private HttpClient client;

    public RemoteService() {
        try {
            this.client = HttpClient.newBuilder()
                    .connectTimeout(Duration.ofSeconds(1))
                    .build();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getTheTitle(final int id) throws IOException, InterruptedException {
        URI uri = URI.create("https://jsonplaceholder.typicode.com/todos/" + id);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .GET()
                .timeout(Duration.ofSeconds(1))
                .build();
        HttpResponse<String > response = client.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() != 200){
            return FAILURE;
        }
        final String body = response.body();;
        Gson gson = new Gson();
        JsonResponse response1 = gson.fromJson(body, JsonResponse.class);
        return response1.title();
    }
}
