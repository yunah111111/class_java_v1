package com.oop4;

public class CoffeeMachine {

    // 커피머신의 상태(필드): 물의 양(ml), 커피 원두 양(g)
    int water;
    int coffee;
    int count;
    // -> 클래스 바로 밑에 선언된 것 => 멤버 변수

    // 생성자 1
    public CoffeeMachine() {}

    // 생성자 2
    // 생성자 직접 설계해서 테스트 코드 작성해보기
    public CoffeeMachine(int w, int c) {
        water = w;
        coffee = c;
    }

    // 메서드 1. 물 채우기
    void refillWater(int amount) {
        // water = water + amount; // 원래 1l가 있다 가정하면 덮어쓰기가 되기 때문
        if (amount > 0) {
            water += amount;
            System.out.println(amount + "ml 물을 채웠습니다.");
        } else {
            System.out.println("0보다 큰 양의 물을 채워주세요.");
        }
    }

    // 메서드 2. 원두 채우기
    void refillCoffee(int amount) {
        // 방어적 코드 작성
        if (amount > 0) {
            coffee += amount;
            System.out.println(amount + "g의 커피 원두를 채웠습니다.");
        } else {
            System.out.println("0보다 큰 양의 원두를 채워주세요.");
        }
    }

    // 메서드 3. 커피 만들기
    String makeCoffee() {
        // 방어적 코드
        // 커피 한 잔에 물 100ml, 원두 10g 필요
        if (water >= 100 && coffee >= 10) {
            water -= 100;
            coffee -= 10;
            count++; // 만든 잔 수 1 증가
            return "맛있는 커피 한 잔 완성";
        } else {
            return "재료가 부족합니다. 물이나 원두를 채워주세요.";
        }
    }

    // 메서드 4. 해당하는 객체의 현재 상태값을 보여주는 기능 추가
    // 단, 여기서 콘솔창에 출력하는 기능(return 타입 필요 없음)
    // showInfo
    void showInfo() {    // ()괄호 안 매개변수도 삽입 안 해도 됨 왜...?
        System.out.println("--상태창--");
        System.out.println("water: " + water + "ml");
        System.out.println("coffee: " + coffee + "g");
    }

    // 현재 해당하는 커피 머신이 몇 잔의 커피를 만들었는지 출력하는 기능을 만들기
    void showCount() {
        System.out.println("지금까지 만든 커피 " + count + "잔");
    }
}
