package com.oop7;

public class Subway {

    // 필드 생성
    int subNum;
    int subMoney;

    // 생성자 생성
    public Subway(int sn, int sm) {
        subNum = sn;
        subMoney = sm;
    }

    // 메소드 생성
    void subTake(int mn) {
        subMoney += mn;
    }

}
