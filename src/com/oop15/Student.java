package com.oop15;

public class Student {
    // 학교가 사라지더라도 학생은 다른 학교로 가거나 존재함

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void search() {
        System.out.println("학생 이름: " + name);
    }

}
