package exercise;

public class Exercise7 {

    // 함수 만들기 1
    static void greet(String name) {
        System.out.println("안녕하세요 [" + name + "] 님!");
    }

    // 함수 만들기 2
    static int square(int a) {
        return a * a;
//        int result = a * a;
//        return result; // 제곱 반환
    }

    // 함수 만들기 3
    static String signOfNumber(int number) {
        if (number == 0) {
            return "ZERO";
        } else if (number == 1) {
            return "postive";
        } else {
            return "negative";
        }
    }

    // 함수 만들기 4
    static boolean checkAdult(int age) {
        return age >= 18;
    }

    // 함수 만들기 5
    static int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // 코드의 시작점 (메인 함수)
    public static void main(String[] args) {
        greet("홍길동");

        System.out.println("square(5) = " + square(5));
        System.out.println("square(-3) = " + square(-3));

        System.out.println("signOfNumber(1) = " + signOfNumber(1));
        System.out.println("signOfNumber(-1) = " + signOfNumber(-1));
        System.out.println("signOfNumber(0) = " + signOfNumber(0));

        System.out.println("checkAdult(20) = " + checkAdult(20));
        System.out.println("checkAdult(18) = " + checkAdult(18));
        System.out.println("checkAdult(17) = " + checkAdult(17));

        System.out.println("findMax(3, 7) = " + findMax(3, 7));
        System.out.println("findMax(10, 2) = " + findMax(10, 2));
        System.out.println("findMax(5, 5) = " + findMax(5, 5));
        System.out.println("findMax(-3, -8) = " + findMax(-3, -8));

    } // end of main

} // end of class
