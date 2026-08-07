package com.oop5;

public class Bus {

    int busNumber;
    int count; // 0으로 초기화 됨
    int money;

    public Bus(int number) {
        // 멤버 변수를 생성자를 통해서 초기화 하지 않는다면 자동으로 기본 값을 가지게 됨
        busNumber = number;
    }

    // 사람을 태우다.
    void take(int pay) {
        money += pay;
        count++;
    }

    // 현재 버스의 상태를 보여주는 메서드
    void showInfo() {
        System.out.println("버스 번호: " + busNumber);
        System.out.println("현재 승객 수: " + count);
        System.out.println("현재 수익 금액: " + money);
    }
}
