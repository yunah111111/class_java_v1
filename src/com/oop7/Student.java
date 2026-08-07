package com.oop7;

public class Student {

    // 이름과 현재 가지고 있는 돈
    private String name;
    private int money;

    // 생성자 생성
    public Student(String n, int m) {
        name = n;
        money = m;
    }

    // 메소드 생성 - 메소드는 객체에 대한 행동
    // - 밥을 먹고 버스를 타고 지하철을 타고
    // 1. 학생이 밥을 먹는 행동 - 밥의 메뉴를 정하고 밥을 먹었나 or 안 먹었나...?
    void eatRice(Rice rice) {   // Rice 클래스에서 가져오기..?
        if(rice.reduce(100)) { // 왜 riceAmount.eat(100)을 하는지
            System.out.println(name + "님이 " + rice.menu + "을(를) 먹었습니다.");
        } else {
            System.out.println("밥을 다 먹었거나, 양이 부족해서 먹지 못했습니다.");
        }
    }

    // 메소드 생성
    // 2. 버스를 타는 행동
    void takeBus(Bus bus)  {
        bus.busTake(1000);
        money -= 1000;
    }

    void takeSub(Subway sub)  {
        sub.subTake(1400);
        money -= 1400;
    }

    void showInfo(){
        System.out.println("-----정보-----");
        System.out.println("이름: " + name);
        System.out.println("현재 잔액: " + money);
    }

}
