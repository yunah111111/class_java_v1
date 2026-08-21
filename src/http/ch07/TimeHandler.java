package http.ch07;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class TimeHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {

        try {
            LocalDateTime now = LocalDateTime.now();

            DateTimeFormatter formatter =
                    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            String nowText = now.format(formatter);

            Gson gson = new Gson();
            // 문자열 변환
            String response = gson.toJson(nowText);
            System.out.println(response.toString());
            SimpleHttpServer.sendResponse(exchange, 200, SimpleHttpServer.TYPE_JSON, response);

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            exchange.close();
        }
    }
}
