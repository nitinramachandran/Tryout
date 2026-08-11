package com.nix.tryout.httpfun;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class LongPollingDemo {

    // A shared queue to hold messages for clients
    private static final LinkedBlockingQueue<String> messageQueue = new LinkedBlockingQueue<>();

    public static void main(String[] args) throws IOException {
        // Create an HTTP server on port 8000
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

        // Handler for client polling
        server.createContext("/poll", new PollHandler());

        // Handler for simulating message push (e.g., from another system)
        server.createContext("/send", new SendHandler());

        // Use a thread pool executor
        server.setExecutor(Executors.newFixedThreadPool(10));
        server.start();

        System.out.println("Server started at http://localhost:8000");
        System.out.println("Use /poll to simulate long-polling and /send?msg=Hello to push a message.");
    }

    // This handler waits until a message is available and returns it to the client
    static class PollHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            System.out.println("Client connected for long-polling...");

            // Simulate long-polling: wait until a message is available
            try {
                String message = messageQueue.take(); // blocking wait
                byte[] response = message.getBytes();

                exchange.sendResponseHeaders(200, response.length);
                try (OutputStream os = exchange.getResponseBody()) {
                    os.write(response);
                }
            } catch (InterruptedException e) {
                exchange.sendResponseHeaders(500, 0);
            }
        }
    }

    // This handler allows a message to be added to the queue via a URL param
    static class SendHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String query = exchange.getRequestURI().getQuery();
            String message = "No message";

            if (query != null && query.startsWith("msg=")) {
                message = query.substring(4);
                messageQueue.offer(message); // add to queue
                System.out.println("Message sent to waiting clients: " + message);
            }

            byte[] response = "Message queued.".getBytes();
            exchange.sendResponseHeaders(200, response.length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response);
            }
        }
    }
}
