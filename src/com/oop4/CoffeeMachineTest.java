package com.oop4;

public class CoffeeMachineTest {

    public static void main(String[] args) {
        CoffeeMachine machine1 = new CoffeeMachine(200, 50);
        CoffeeMachine machine2 = new CoffeeMachine(50, 10);

        String result1 = machine1.makeCoffee();
        System.out.println(result1);
        machine1.showInfo();
        machine1.makeCoffee(); // 완성됨
        machine1.makeCoffee(); // 현재 물 상태 값 0ml, 30g
        machine1.makeCoffee(); // x
        machine1.makeCoffee(); // x
        machine1.makeCoffee(); // x
        machine1.showCount();
        // 커피 두 잔











//        CoffeeMachine coffeeMachine2 = new CoffeeMachine();
//        coffeeMachine2.water = 100;
//        coffeeMachine2.coffee = 20;
//        coffeeMachine2.showInfo();
//
//        CoffeeMachine coffeeMachine = new CoffeeMachine(100, 20);
//        // 객체 생성
//
//        // 실행의 흐름 직접 만들어 보기
//        String result1 = coffeeMachine.makeCoffee();
//        System.out.println("커피 요청 결과: " + result1);
//
//        coffeeMachine.refillWater(200);
//        coffeeMachine.refillWater(100);
//        // coffeeMachine 객체 안에 물, 원두의 상태값이 변경되었다.
//        String result2 = coffeeMachine.makeCoffee();
//        System.out.println("두 번째 요청 결과: " + result2);
//        coffeeMachine.showInfo();


    }
}
