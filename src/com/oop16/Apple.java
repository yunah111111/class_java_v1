package com.oop16;

public class Apple extends Fruit {

    public Apple() {
        name = "사과";
        price = 3000;
    }

    // 정률 할인 - 10%를 깍는다.
    public void saleApple() {
        int discount = price / 10;
        System.out.println("사과 10% 할인. 현재 가격: " + price);
    }

}
