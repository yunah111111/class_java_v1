package com.oop5;

// 객체를 사용하고 실행해보는 테스트 측 코드
public class GoingToSchool {

    public static void main(String[] args) {

        Bus bus133 = new Bus(133);
        Bus bus57 = new Bus(57);
        Student studentKim = new Student("홍길동", 10000);
        Student studentLee = new Student("이순신", 5000);

        Subway subway1 = new Subway(1);
        Subway subway2 = new Subway(2);

        studentKim.takeBus(bus133);
        studentLee.takeBus(bus133);

        studentKim.takeSubway(subway1);
        studentKim.takeSubway(subway2);

        studentKim.showInfo(); // Kim 현재 소지금 확인
        studentLee.showInfo(); // Lee 현재 소지금 확인
        System.out.println("----------------------");
        bus133.showInfo();
        subway1.showInfo();




    } // end of main

} // end of class
