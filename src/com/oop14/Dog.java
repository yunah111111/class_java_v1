package com.oop14;

public class Dog extends Animal {

    @Override
    void eat() {
        super.eat(); // 부모 코드도 출력
        System.out.println("강아지가 밥을 먹다.");
    }
}
