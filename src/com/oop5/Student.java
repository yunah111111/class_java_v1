package com.oop5;

public class Student { // 클래스 만들기
    String name; // 필드 생성
    int money;

// 생성자 - 객체 생성 시 값 초기화
    public Student (String n, int m) {
        name = n;
        money = m;
    }
// 메서드 - 객체의 행위를 담당할 때
    // 메서드 1. 학생이 버스를 탄다.
    void takeBus(Bus bus) {
        // 자기의 일을 직접 스스로 해결한다.
        bus.take(1000);
        money -= 1000;
    }

    // 메서드 2. 학생이 지하철을 탄다.
    void takeSubway(Subway subway) {
        subway.take(500);
        money -= 500;
    }

    // 메서드 3. 학생이 밥을 먹는다. (남은 양이 없으면 밥 못먹었습니다.)
    void eatRice(Rice rice) {
       // rice.eat(100); // --> true or false
        if(rice.eat(100)) {
            System.out.println(name + "님이 " + rice.menu + "을(를) 먹었습니다.");
        } else {
            System.out.println("밥을 다 먹었거나, 양이 부족해서 먹지 못했습니다.");
        }
    }


    // 메서드 4. 정보창 보여주는 기능
    void showInfo(){
        System.out.println(name + "님은 현재 남은 금액: " + money);
    }
}
