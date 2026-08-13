package socket.ch02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFile2 {

    // ip주소: 198.168.5.9
    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("서버측 프로그램 시작 - 포트 번호: 5000에서 대기 중...");
            // 클라이언트가 내 IP 주소와, 포트 번호를 사용해서 연결할 때까지 이 줄에서 멈추고 있음 (블로킹 - 들어올 때까지 대기)
            Socket socket = serverSocket.accept();

            // 읽기 스트림(문자기반), 클라이언트 --> 서버
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // 쓰기 스트림(문자기반), 서버 --> 클라이언트
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            // 클라이언트가 보낸 데이터 한 줄 읽기
            String message = reader.readLine();
            System.out.println("클라이언트 메시지: " + message);

            // 서버가 클라이언트로 응답 메세지 보내기
            writer.println("안녕 나는 서버야5555");

            // 서버측에서 클라이언트가 온 메시지를 파일에 저장하는 기능을 만들기
            FileOutputStream fos = new FileOutputStream("assets/message.txt", true);
            BufferedReader bos = new BufferedReader(new FileReader(fos.toString()));
            message = bos.readLine();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
