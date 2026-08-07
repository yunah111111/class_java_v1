package com.oop8;

public class Person {

    // this에 3가지 사용방법이 존재함
    // 1. 자기 자신의 주소를 가리킨다.
    // 2. 생성자에서 다른 생성자를 호출할 수 있음
    // 3. 자기 자신의 주소값을 return 값으로 반환 시킬 수 있음

    private String name;
    private int age;
    private String phone;
    private String gender; // F, M

    // 생성자 - 1. this 사용방법 첫 번재
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 생성자 - 2 this 사용방법 두 번째
    public Person(String name, int age, String phone) {
//        this.name = name;
//        this.age = age;
        // 생성자가 만들어져있어야 this 호출 가능
        this(name, age);
        this.phone = phone;
    }

    // 생성자 - 3 this 사용방법 두 번째 복습
    public Person(String name, int age, String phone, String gender) {
        this(name,age, phone);
        this.gender = gender;
    }

    // 메서드 - this 사용방법 세 번째
    // 메서드를 통해서 자기 자신의 주소값 반환 시켜야 하는 경우 this를 사용할 수 있음
    public Person getPerson() {
        return this;
    }


} // end of class
