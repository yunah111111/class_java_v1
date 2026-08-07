package com.oop5;

public class Subway {
    int lineNumber; // 1, 2호선
    int count; // 승객 수
    int money;

    // 1. 생성자
    public Subway (int n) {
        lineNumber = n;
    }

    // 2. 승객을 태운다.
    void take(int pay) {
        money += pay;
        count++;
    }

    // 3. 정보 보기
    void showInfo() {
        System.out.println("-----정보 보기-----");
        System.out.println("지하철 호선: " + lineNumber);
        System.out.println("승객 수: " + count);
        System.out.println("현재 수익 금액: " + money);
    }
}
