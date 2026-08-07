package com.oop5;

public class GoingToSchool2 {

    public static void main(String[] args) { // 프로그램 실행 시작점
        // 객체를 다양하게 생성해서 동작 시켜보고 상호 작용하는지 확인 하기
        Rice rice1 = new Rice("김치볶음밥", 500);
        /**
         * Rice 객체를 하나 만듦
         * rice1이라는 변수에 새로 만든 Rice 객체를 저장함
         */
        Student studentHan = new Student("장영실", 20000);
        /**
         * Student 객체를 하나 만듦
         * studentHan이라는 변수에 저장함
         */

        studentHan.eatRice(rice1);
        /**
         * 장영실 학생이 rice1(김치볶음밥)을 먹는다.
         * eatRice 메서드 실행
         * rice1 객체를 매개변수로 넘겨줌
         */
        studentHan.showInfo();
        // 학생 정보 출력 (이름, 남은 돈 등을 보여줌)
        rice1.showInfo();
        // 음식 이름, 남은 밥 양을 보여줌

    } // end of main

} // end of class
