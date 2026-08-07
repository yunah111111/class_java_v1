package com.oop15;

public class CPU {

    // cpu 모델명 입력받고 컴퓨터가 실행되면 cpu도 실행

    private String name;
    private Computer computer;

    public CPU(String name) {
        this.name = name;
        this.computer = new Computer("mac");
    }

    public void start() {
        computer.start();
        System.out.println(name + "이 작동을 시작합니다.");
    }

    public void stop() {
        computer.stop();
        System.out.println(name + "이 동작을 종료합니다.");
    }

}
