package com.nix.tryout.httpfun;

import jakarta.websocket.*;
import jakarta.websocket.server.ServerEndpoint;
import org.glassfish.tyrus.server.Server;

import java.net.URI;
import java.util.Collections;

/* WebSocket Server Endpoint
* Sample program to test WebSockets working
**/
@ServerEndpoint("/echo")
public class EchoServerEndpoint {

    // Called when a new connection is opened
    @OnOpen
    public void onOpen(Session session) {
        System.out.println("Server: Client connected");
    }

    // Called when a message is received
    @OnMessage
    public String onMessage(String message) {
        System.out.println("Server received: " + message);
        return "Echo: " + message; // Echoing back to client
    }

    // Called when the connection is closed
    @OnClose
    public void onClose(Session session) {
        System.out.println("Server: Connection closed");
    }

    // Called on error
    @OnError
    public void onError(Throwable error) {
        error.printStackTrace();
    }

    // Main method to start server
    public static void main(String[] args) throws Exception {
        Server server = new Server("localhost", 8025, "/ws", null, Collections.singleton(EchoServerEndpoint.class));
        server.start();
        System.out.println("WebSocket server started at ws://localhost:8025/ws");

        // Start client in another thread
        new Thread(() -> {
            try {
                WebSocketClient.startClient();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        // Keep the server running for 30 seconds for demo
        Thread.sleep(30000);
        server.stop();
    }
}

// WebSocket Client
@ClientEndpoint
class WebSocketClient {

    @OnOpen
    public void onOpen(Session session) throws Exception {
        System.out.println("Client: Connected to server");
        session.getBasicRemote().sendText("Hello WebSocket!");
    }

    @OnMessage
    public void onMessage(String message) {
        System.out.println("Client received: " + message);
    }

    @OnClose
    public void onClose(Session session) {
        System.out.println("Client: Connection closed");
    }

    public static void startClient() throws Exception {
        WebSocketContainer container = ContainerProvider.getWebSocketContainer();
        URI uri = new URI("ws://localhost:8025/ws/echo");
        container.connectToServer(WebSocketClient.class, uri);
    }
}
