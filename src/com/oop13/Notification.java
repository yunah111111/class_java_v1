package com.oop13;

public class Notification {

    String message;
    int count = 0;
    String receiver;

    public void send(String message) {
        System.out.println("일반 알림: [" + message + "]");
    }

    public void send(String message, int count) {
        System.out.println("반복 알림 전송 ...");
        for (int i = 0; i < count; i++) {
            send(message);
        }
    }

    public void send(String receiver, String message) {
        System.out.println("[" + receiver + "]" + "님에게 메시지: " + "[" + message + "]");
    }


    // 메인 함수 (테스트 코드 작성해보기)
    public static void main(String[] args) {

        Notification notification = new Notification();
        System.out.println("--------1번 호출--------");
        notification.send("내용");
        System.out.println("--------2번 호출--------");
        notification.send("내용", 5);
        System.out.println("--------3번 호출--------");
        notification.send("홍길동", "안녕");

    } // end of main

} // end of class
