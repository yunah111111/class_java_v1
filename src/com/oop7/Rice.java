package com.oop7;

public class Rice {

    // 필드 생성
    String menu;
    int amount;

    // 생성자 생성
    public Rice(String m, int a) {
        menu = m;
        amount = a;
    }

    // 메소드 생성
    // 밥의 메뉴와 밥의 총 양
//    void riceMenu(String mn) {
//        System.out.println("오늘의 메뉴는 " + mn + "입니다.");
//    }
    // 이거 왜 안 해도 되는 거지

    // 메소드 생성 2
    boolean reduce(int am) {
        // 밥의 총 양이 3000인데 한번 먹을 때 -100으로 설정해보면
//        int spoon = 100;

        if (amount >= am) {   // 근데 am이 뭐지..? 총 양인가
            amount -= am; // amount = amount - am /.....???????????
            return true;
        } else {
            return false;
        }
    }
}
