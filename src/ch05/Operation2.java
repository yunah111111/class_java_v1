package ch05;

public class Operation2 {

    // 메인 함수
    public static void main(String[] args) {
        System.out.println(5 + 3);
        System.out.println(5 - 3);
        System.out.println(5 * 3);
        System.out.println(5 / 3); // 결과 1이 나온 이유 -> int / int => int로 떨어져 소수점 버려짐
        System.out.println(5 / (double)3); // 강제 형변환 (1.6666..7)
        System.out.println(5 % 3);

        // 문제
        // 1. (12 + 3) / 3을 화면에 출력하기 // 단, 결과값을 변수에 담아서 출력
        double n1 = (12 + 3) / 3;
        System.out.println("(12 + 3) / 3 = " + n1);

        // 2. (25 % 2) 값을 화면에 출력하기
        int n2 = 25 % 2;
        System.out.println("25 % 2 = " + n2);
        // 나머지 연산자는 해당하는 값이 홀수인지 짝수인지 판별할 때 유용하다.
        // 어떤 수를 2로 나누었을 때 나머지가 0이면 짝수라고 판별되고, 1이면 홀수라고 판별 가능

        // 3. 7896456 값이 홀수인지 짝수인지 화면에 1 또는 0으로 표시하는 코드를 출력
        System.out.println(7896456 % 2); // 0이면 짝수로 판단할 수 있다.
        int result1 = 7896456 % 2;


    } // end of main

} // end of class
