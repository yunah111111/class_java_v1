package ch03;

public class ConstantTest1 {

    // 코드 실행의 시작점
    public static void main(String[] args) {
        int num = 10;
        num = 101;

        // 상수 사용해보기
        // final 키워드 사용하고 변수명에 이름을 작성할 때 대문자 _(언더바) 를 사용하는게 권장사항이다.
        final int MAX_NUM = 100; // 한번 값이 정해지면 다시 변경할 수 없다.(상수)
        // MAX_NUM = 1;

        // 원주율을 상수로 선언해보기
        final double PI = 3.14159;
        final int RADIUS = 5;

        // 1. 원 둘레 계산 10*3.14159
        double a = 2 * PI * RADIUS;
        // 2. 원 면적 계산 25*3.14159
        double b = RADIUS * RADIUS * PI;
        System.out.println("원의 둘레: " + a);
        System.out.println("원의 면적: " + b);

    } // end of main

} // end of class
