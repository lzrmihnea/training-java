package ro.training.java.c12;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class RestApiJava {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8013),0);

        // We define the /api/salut endpoint
        server.createContext("/api/salut", (exchange -> {

            String responseText = "<h1 style=color:green> Salut lume! </h1> \n <h4>Bun venit pe serverul nostru local!</h4>\n Sfarsit";
            int responseCode = 202;

            exchange.sendResponseHeaders(responseCode, responseText.getBytes().length);
            OutputStream outputStream = exchange.getResponseBody();
            outputStream.write(responseText.getBytes());
            outputStream.flush();
            outputStream.close();
        }));
        server.start();
    }
}
