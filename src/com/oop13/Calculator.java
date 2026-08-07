package com.oop13;

// 메서드 오버로딩: 같은 이름의 메서드를 여러 개 정의하는 것
public class Calculator {

    // 정수형 덧셈 메서드
    public int add(int a, int b){
        return a + b;
    }

    // 실수형 덧셈 메서드
    public double add(double a, double b){
        return a + b;
    }

    // 세 정수의 덧셈 메서드
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // plintln 메서드 오버로딩 기법임
        System.out.println(1);
        System.out.println(1.0);
        System.out.println(true);
        System.out.println("String");

        // 메서드 오버로딩 기법이 없다면 작성했어야 하는 코드
//        printlnInt()
//        printlnDouble()
//        prinlBoolean()
//        printlnString()



    } // end of main

} // end of class
