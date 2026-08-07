package com.oop4;

public class UserInfo {

    String userId;
    String userPassword;
    String userName;
    String userAddress;
    String phoneNumber;

    // tip - 객체 생성될 때 가장 먼저 실행되는 부분은 생성자이다.

    public UserInfo(String id) {
        userId = id;
    }

    public UserInfo(String u, String password) {
        userId = u;
        userPassword = password;
    }

    public UserInfo(String i, String pw, String name) {
        userId = i;
        userPassword = pw;
        userName = name;
    }

    public UserInfo(String d, String p, String n, String address) {
        userId = d;
        userPassword = p;
        userName = n;
        userAddress = address;
    }

    public UserInfo(String ID, String PW, String NAME, String ADDRESS, String NUM) {
        userId = ID;
        userPassword = PW;
        userName = NAME;
        userAddress = ADDRESS;
        phoneNumber = NUM;
    }
}
