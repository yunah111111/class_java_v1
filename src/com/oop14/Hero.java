package com.oop14;

public class Hero {

    String name;
    int hp;

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    void attack() {
        System.out.println("공격을 합니다.");
    }

}
