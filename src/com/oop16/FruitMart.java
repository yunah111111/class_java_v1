package com.oop16;

public class FruitMart {

    public static void main(String[] args) {

        // 다형성의 활용 - 하나의 배열에 여러 타입 담기

        Banana[] banana = new Banana[10];
        banana[0] = new Banana(); // 0번째 칸에 Banana 객체를 생성하여 저장
        banana[1] = new Banana();

        Peach[] peaches = new Peach[3];
        peaches[0] = new Peach();
        peaches[1] = new Peach();
        peaches[2] = new Peach();

        // 결론: 다형성이 없다면 타입별로 배열을 다로 만들어야 한다.
        System.out.println("-----------------------");

        // 즉, 다형성을 쓰면 부모 타입 배열 하나에 자식들을 모두 담을 수 있음
        Fruit[] fruits = new Fruit[4];
        fruits[0] = new Banana();
        fruits[1] = new Peach();
        fruits[2] = new Banana();
        fruits[3] = new Apple();

        // 만약 사과라면 할인 금액으로 호출하라
        for (int i = 0; i < fruits.length; i++) {  // 배열의 처음부터 마지막까지 반복한다.
            fruits[i].showInfo(); // 현재 과일의 정보를 출력
            // 문제 - 타입이 사과일 때만 할인 메서드를 호출 하시오
            if (fruits[i] instanceof Apple) {  // 만약 현재 배열의 과일이 Apple 객체라면
                ((Apple) fruits[i]).saleApple(); // 현재 과일을 Apple 타입으로 다운캐스팅한 후 saleApple()메서드를 호출한다.
            }
        }


        for (int i = 0; i < fruits.length; i++) {
            fruits[i].showInfo();
            // 문제 - 타입이 바나나일 때만 할인 메서드를 호출 하시오
            if (fruits[i] instanceof Banana) {
                ((Banana) fruits[i]).saleBanana();
            }
        }

    } // end of main

} // end of class
