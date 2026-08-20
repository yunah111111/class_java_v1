package http.ch04;

import com.google.gson.Gson;
import com.oop14.B;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class UserClient {

    public static void main(String[] args) {
        // https://jsonplaceholder.typicode.com/users/1

        String urlString = "https://jsonplaceholder.typicode.com/users/1";
        HttpURLConnection conn = null;

        try {
            URL url = new URL(urlString);
            conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");

            int responseCode = conn.getResponseCode();
            System.out.println("응답 코드 확인: " + responseCode);

            if (responseCode != 200 ) {
                System.out.println("요청 실패");
                 return;
            }

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {

                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    sb.append(line);
                }

                Gson gson = new Gson();
                User user = gson.fromJson(sb.toString(), User.class);
                System.out.println("파싱 결과");
                System.out.println(user);
//                System.out.println(user.getId());
//                System.out.println(user.getName());
//                System.out.println(user.getUsername());
//                System.out.println(user.getEmail());
//                System.out.println(user.getAddress());
//                System.out.println(user.getPhone());
//                System.out.println(user.getWebsite());
//                System.out.println(user.getCompany());

            }





        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
