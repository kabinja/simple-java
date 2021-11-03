package org.example;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.stream.Collectors;

public class NetworkUtils {
    private NetworkUtils() {}

    public static String listenForMessage(int port, int milliseconds) throws IOException {
        String message;

        try(ServerSocket serverSocket = new ServerSocket(port)) {
            serverSocket.setSoTimeout(milliseconds);
            final Socket socket = serverSocket.accept();
            message = processMessage(socket.getInputStream());
        }
        catch (SocketTimeoutException e){
            message = "";
        }

        return message;
    }

    private static String processMessage(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream)).lines()
                .parallel().collect(Collectors.joining("\n"));
    }

    public static void sendDelayedMessage(String message, int port, int delay){
        new Thread(() ->{
            try (Socket socket = new Socket("localhost", port)) {
                Thread.sleep(delay);
                final PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                out.println(message);
            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }).start();
    }
}
