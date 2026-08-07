package com.oop4;

public class CalculatorMain {

    // 두 숫자를 더하는 함수
    static int add(int a, int b) {
        int result;
        result = a + b;
        return result;
    }

    // 두 숫자를 빼는 함수
    static int sub(int c, int d) {
        int result;
        result = c - d;
        return result;
    }

    // 두 숫자를 곱하는 함수
    static int mul(int a, int b) {
        int result = a * b;
        return result;
    }

    // 두 숫자를 나누는 함수
    static double div(int a, int b) {
//        int result = g * h;
//        return result;

        // 방어적 코드
        if(b == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
        // 정수 / 정수 ---> 정수 (소수점 버려짐)
        // (double) 둘 중 하나라도 실수 데이터 타입이어야 소수점을 반환한다.
        return (double)a / b;
    }

    // 짝수인지 판별 함수
    static boolean odd(int a) {
        return a % 2 == 0;
    }

    // 홀수인지 판별 함수
    static boolean even(int a) {
        return a % 2 != 0;
    }


    // 메인 함수
    public static void main(String[] args) {
        // 위 함수를 설계하고 테스트 코드 작성
        // 테스트용 숫자
        int num1 = 10;
        int num2 = 5;
        int testNumber = 7;


        System.out.println(add(num1, num2));
        System.out.println(sub(num1, num2));
        System.out.println(mul(num1, num2));
        System.out.println(div(num1, num2));

        System.out.println(odd(num1));
        System.out.println(even(num1));

        System.out.println(odd(testNumber));
        System.out.println(even(testNumber));
    }
}



