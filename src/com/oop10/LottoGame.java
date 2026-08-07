package com.oop10;

public class LottoGame {

    // static main 메소드 선언(코드의 진입점)
    public static void main(String[] args) {
        int game1 = LottoNumberMaker.makeNumber();
        int game2 = LottoNumberMaker.makeNumber();
        int game3 = LottoNumberMaker.makeNumber();
        int game4 = LottoNumberMaker.makeNumber();
        int game5 = LottoNumberMaker.makeNumber();
        int game6 = LottoNumberMaker.makeNumber();

        System.out.println(game1  + ", " + game2 + ", " + game3 + ", " + game4 + ", " + game5 + ", " + game6);

        // LottoNumberMaker 객체를 단 하나로 만든 적이 없지만 실행이 된다.
        // 이유: static이기 때문

    } // end of main

} // end of class
