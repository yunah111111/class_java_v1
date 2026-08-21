package http.ch05;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class UserClient {

    public static void main(String[] args) {
        // https://jsonplaceholder.typicode.com/users/1

        String urlString = "https://jsonplaceholder.typicode.com/users/1";
        // 어디에 요청할지 적어놓은 것
        HttpURLConnection conn = null;
        // 연결변수: 아직 서버와 연결하지 않았으니까 null;

        try {
            // 네트워크 통신은 오류가 발생할 수 있음 ex) 인터넷 안 됨, 주소 잘못됨, 서버 응답 안 옴 등 (try - catch)
            URL url = new URL(urlString); // 여기서 문자열이었던 주소를 URL객체로 바꿈
            conn = (HttpURLConnection) url.openConnection();
            // url을 이용해서 서버와 통신할 연결 객체를 만드는 것

            conn.setRequestMethod("GET");
            // 서버한테 GET요청 (데이터 조회)

            int responseCode = conn.getResponseCode(); // 응답 코드 받기
            System.out.println("응답 코드 확인: " + responseCode);

            if (responseCode != 200 ) {
                System.out.println("요청 실패");
                 return;
            }

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {

                StringBuilder sb = new StringBuilder();
                // 서버가 보내주는 JSON을 계속 붙일 거임
                String line; // 서버에서 읽은 한 줄을 임시로 저장할 변수
                while ((line = reader.readLine()) != null) {
                    sb.append(line); // 읽은 한 줄을 StringBuilder에 붙임
                    // sb.toString() 하면 서버에서 받은 JSON 전체가 문자열로 나옴
                }

                Gson gson = new Gson(); // JSON을 Java 객체로 바꿀 준비
                User user = gson.fromJson(sb.toString(), User.class);
                // User.class => JSON 데이터를 User 객체로 만들어달라는 뜻
                // User라는 클래스의 정보를 Gson에게 전달하는 것
                System.out.println("파싱 결과");
                System.out.println(user);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
