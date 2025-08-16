package com.learn.javacore._24AsynchronousCompletableFuture;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class APIExample {

    public static void main(String[] args) {
        // Asynchronous task to call JSONPlaceholder API
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                HttpClient client = HttpClient.newHttpClient();

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                        .GET()
                        .build();

                System.out.println("Worker Task: Calling API...");

                // Send request synchronously here (inside supplyAsync thread)
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                return response.body();

            } catch (Exception e) {
                throw new RuntimeException("API call failed", e);
            }
        });
//        .thenApply(x->x)

        // Block and get the result (for demo)
        try {
            String responseBody = completableFuture.get();
            System.out.println("API Response:");
            System.out.println(responseBody);
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

