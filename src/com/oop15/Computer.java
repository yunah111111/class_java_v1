package com.oop15;

public class Computer {

    private String name;

    public Computer(String name) {
        this.name = name;
    }

    public void start() {
        System.out.println("컴퓨터가 부팅됩니다.");
    }

    public void stop() {
        System.out.println("컴퓨터가 종료됩니다.");
    }

}
