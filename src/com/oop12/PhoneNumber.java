package com.oop12;

public class PhoneNumber {

    private String name;
    private String phoneNumber;

    // 생성자
    public PhoneNumber (String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // getter
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //  info 메서드 만들기
    public void showInfo() {
        System.out.println(">>> 전화번호부 <<<");
        System.out.println("이름: " + name);
        System.out.println("전화번호: " + phoneNumber);
    }


}
