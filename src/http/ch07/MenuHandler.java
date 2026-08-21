package http.ch07;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MenuHandler implements HttpHandler {

    private static final List<Menu> menuList = new ArrayList<>();
    private static int nextId = 1;

    static {
        addMenu(new Menu("치킨", 31000));
        addMenu(new Menu("피자", 17000));
    }

    private static synchronized int addMenu(Menu menu) {
        menu.setNumber(nextId);
        nextId++;
        menuList.add(menu);
        return menu.getNumber();
    }



    @Override
    public void handle(HttpExchange exchange) throws IOException {
        try {

            String method = exchange.getRequestMethod();

            if (method.equals("GET")) {
                handleGet(exchange);
            } else if(method.equals("POST")) {
                handlePost(exchange);
            } else {
                // 405를 보낼 때는 어떤 메서드가 되는지 Allow 헤더로 알려주는 것이 규칙이다.
                exchange.getResponseHeaders().set("Allow", "GET, POST");
                SimpleHttpServer.sendResponse(exchange, 405, SimpleHttpServer.TYPE_TEXT, "지원하지 않는 메서드 입니다.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            exchange.close();
        }
    }

    private ArrayList<Menu> copyMenuList() {
        return new ArrayList<>(menuList);
    }

    private void handleGet(HttpExchange exchange) throws IOException {
        SimpleHttpServer.sendJson(exchange, 200, copyMenuList());
    }

    private void handlePost(HttpExchange exchange) throws IOException {
        String requestBody = SimpleHttpServer.readRequestBody(exchange);
        System.out.println(requestBody);


        Menu menu;
        try {
            menu = new Gson().fromJson(requestBody, Menu.class);
        } catch (JsonSyntaxException e) {
            SimpleHttpServer.sendResponse(exchange, 400, SimpleHttpServer.TYPE_TEXT, "형식이 올바르지 않습니다.");
            return;
        }

        SimpleHttpServer.sendJson(exchange, 201, menu);
    }
}
