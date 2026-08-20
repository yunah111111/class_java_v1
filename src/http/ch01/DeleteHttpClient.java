package http.ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class DeleteHttpClient {

    public static void main(String[] args) {
        String baseURL = "https://jsonplaceholder.typicode.com";
        String urlString = baseURL + "/posts/1";
        HttpURLConnection connection = null;


        try {
            URI uri = URI.create(urlString);
            URL url = uri.toURL();

            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("DELETE");
            connection.setRequestProperty("Accept", "application/json");

            int responseCode = connection.getResponseCode();
            System.out.println("응답 코드(HTTP 상태코드): " + responseCode);

            if (responseCode != 200) {
                System.out.println("요청 실패");
                return;
            }

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line).append("\n");
                }
                System.out.println("응답 내용: ");
                System.out.println(response);
            }



        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            if (connection != null) {
                connection.disconnect();
            }
        }

    }
}
