package com.oop6;

public class Bank {

    // 접근 제어 지시자 (public, default, private)
//    public String name;
//    public int balance;
//    public String accountNumber;


// 아무것도 쓰지 않음 -- default 접근 제어 지시자임
// 같은 패키지(폴더) 안에서 접근 가능함
//    String name;
//    int balance;
//    String accountNumber;
    // 이렇게 되면 BankTest에 있는 bank1.name에 오류 생김


    // 해당 클래스 파일 내부에서만 접근 가능
    private String name;
    private int balance;
    private String accountNumber;


}
