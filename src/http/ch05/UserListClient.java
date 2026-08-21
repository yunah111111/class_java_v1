package http.ch05;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class UserListClient {

    public static void main(String[] args) {

        String urlString = "https://jsonplaceholder.typicode.com/users";
        HttpURLConnection conn = null;

        try {
            URL url = new URL(urlString);
            conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");

            int responseCode = conn.getResponseCode();
            System.out.println("응답 코드 확인: " + responseCode);

            if (responseCode != 200) {
                System.out.println("요청 실패");
                return;
            }

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {

                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    sb.append(line);
                }
                // 여기까지 코드 같음

                Gson gson = new Gson();
                TypeToken<List<User>> typeToken = new TypeToken<List<User>>() {};
                // 여기서 이번에 JSON이 배열임 그래서 User user가 아니라 List<User> UserList
                // TypeToken => 이번에는 User 한명이 아니고 list라고 타입 정보를 알려줌
                List<User> userList = gson.fromJson(sb.toString(), typeToken.getType());


                // 그래서 이제 리스트가 생김
                System.out.println("전체 개수: " + userList.size());
                System.out.println("-------------------------------------");

                for (int i = 0; i < userList.size(); i++) {
                    System.out.println(userList.get(i));
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally { // 통신이 끝남 - 연결 끊기
            if (conn != null) {
                conn.disconnect();
            }
        }


    }
}
