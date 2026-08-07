package com.oop9;

public class Dog {

    private String name;
    private int age;
    private double weight;

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int age) {
        this(name);
        this.age = age;
    }

    public Dog(String name, int age, double weight) {
        this(name, age);
        this.weight = weight;
    }

    // 1. get 메서드 만들기
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    // 2. set 메서드 만들기

    public void setName (String name) {
        this.name = name;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public void setWeight() {
        this.weight = weight;
    }

}
