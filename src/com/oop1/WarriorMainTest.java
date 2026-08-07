package com.oop1;

public class WarriorMainTest {

    // 코드 실행의 진입점(메인 함수) - JVM - Stack(메모리)
    public static void main(String[] args) {
        // new - 키워드, Wariior() <- 생성자 호출
        Warrior w1 = new Warrior();
        // Warrior w1;  // Warrior 변수 선언

        w1.name = "티모";
        w1.height = 10.5;
        w1.health= 100;
        w1.attackPower = 70;
        w1.defensePower = 30;

        // w1 참조 변수에 접근해서 값을 할당해 보자
        // 객체의 접근은 .연산자를 통해서 할 수 있다.
        System.out.println("w1 주소 값: " + w1);
        System.out.println("w1. 이름: " + w1.name);
        System.out.println("w1. 키: " + w1.height);
        System.out.println("w1. 체력: " + w1.health);
        System.out.println("w1. 공격력: " + w1.attackPower);
        System.out.println("w1. 방어력: " + w1.defensePower);

        System.out.println("---------------------------------");

        // Warrior 타입에 객체를 생성해서 해당 하는 상태 값을 입력하고 화면에 출력
        Warrior w2 = new Warrior();

        w2.rank = 'S';
        w2.weapon = "hammer";
        w2.itemCount = 5;

        System.out.println("w2. 등급: " + w2.rank);
        System.out.println("w2. 무기: " + w2.weapon);
        System.out.println("w2. 아이템 수: " + w2.itemCount);


    } // end of main

} // end of class
