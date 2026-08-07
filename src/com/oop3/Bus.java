package com.oop3;

// 버스 클래스 설계
// 속성과 행위를 설계
// BusMainTest1 (객체를 2개 이상 생성하고 결과 출력 해보기)
public class Bus {
    int busNum;
    String startingPoint;
    String lastStop;

    void openDoor() {
        System.out.println("문이 열립니다.");
    }

    void closeDoor() {
        System.out.println("문이 닫힙니다.");
    }

    void busInfo() {
        System.out.println("-------버스 정보-------");
        System.out.println("버스 번호: " + busNum);
        System.out.println("출발지점: " + startingPoint);
        System.out.println("종점: " + lastStop);
    }

    public static void main(String[] args) {
        Bus b1 = new Bus();

        b1.busNum = 127;
        b1.startingPoint = "꽃바위";
        b1.lastStop = "노포";

        b1.openDoor();
        b1.closeDoor();
        b1.busInfo();
    }
}
