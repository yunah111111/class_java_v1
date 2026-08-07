package ch03;

/**
 * 형변환이란
 * 데이터의 타입을 다른 타입으로 변경 하는 것
 * - 자동 형변환, 강제 형변환
 */
public class TypeConversion1 {

    // 코드의 시작점
    public static void main(String[] args) {
        int intDataBox = 100;
        double doubleDataBox;

        // 1. 자동 형변환 예시
        // 8바이트 상자 = 4바이트 상자
        doubleDataBox = intDataBox; // 자동 형변환 진행 함
        System.out.println("doubleDataBox: " + doubleDataBox); // 100.0
        System.out.println("intDataBox: " + intDataBox); // 100

        // 2. 강제 형변환 예시
        final double PI = 3.14159;
        // 컴파일러한테 강제로 집어넣으라는 명령 --> 자료형
        int intBox = (int)PI;
        System.out.println(intBox); // 3
        System.out.println(PI); // 3.14159

        // 연습
        double interestRate;
        int discount;

        interestRate = 15.5;
        // 문제 1. 아래 오류나는 문법을 해결하고 결과를 출력
        discount = (int)interestRate;
        System.out.println("discount: " + discount); // 15

        float floatBox = 10.5f;
        float floatBox2 = (float)20.2;

    } // end of main

} // end of class
