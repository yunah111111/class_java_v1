package com.oop7;

public class Bus {

    // 필드 생성
    int busNum;
    int busMoney;

    // 생성자 생성
    public Bus(int bn, int bm){
//        busNum = bn; // 얘는 안 해도 되나...?
        busMoney = bm;
    }

    // 메소드 생성 - 객체에 대한 행동
    // 1. 돈 받고, 버스 정보...?
    void busTake(int pay) {
        busMoney += pay;
    }

}
