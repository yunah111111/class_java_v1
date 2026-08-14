package client_socket.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class WhileClient {

    public static void main(String[] args) {

        // 1. 소켓 준비 (서버 IP 주소, 포트 번호)
        // 2. 소켓과 연결된 입출력 스트림 필요
        // 3. 클라이언트 측 키보드 스트림 필요

        try (Socket socket = new Socket("localhost", 5000)) {

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));

            String line;
            while (true) { // 먼저 보낼 거라서 무한 루프 돌리기
                System.out.println("콘솔 로크 클라이언트 입력>>> ");
                String input = keyboardReader.readLine(); // 블로킹 sc.nextLine();
                writer.println(input); // 소켓과 연결된 출력스트림을 사용해서 서버측에 데이터 보냄
                if ("exit".equalsIgnoreCase(input)) {
                    break; // 즉 키보드 입력 스트림 종료
                }

                // 서버 측에서 보낸 메시지를 받아서 클라이언트 콘솔창에 출력
                String response = reader.readLine();
                if ("exit".equalsIgnoreCase(response)) {
                    break;
                }
                System.out.println("서버측 응답: " + response);
            }
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
