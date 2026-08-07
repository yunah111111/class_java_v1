package com.oop15;

public class ComputerMainTest {

    public static void main(String[] args) {

        CPU cpu = new CPU("amd64");
        cpu.start();
        cpu.stop();

    }

}
