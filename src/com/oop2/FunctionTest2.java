package com.oop2;

public class FunctionTest2 {

    // 두 수를 입력받아 뺄셈하는 함수를 설계하고 그 값을 반환하는 함수를 만들어 보자
    //            (매게변수 = 파라미터)
    static int sub(int a, int b, int c) {
        int result = a - b - c;
        return result; // 값 반환 왜 하는지 알아보기 (실행의 제어권을 반납한다.)
    }

    // 리턴 키워드가 없는 함수를 만들어 보자
    // void <- 텅 빈, 값이 없는
    static void sayHello(String greeting) { // void는 앞에 데이터 타입 안 쓰나
        System.out.println("[[[" + greeting + "]]] ~~~ 😊🎶😗‍🌫");
    }

    // 매개변수가 없는 함수를 설계해 보자
    // 지역변수 = 함수 안에 선언한 수
    static int calcSum() { // 얘는 왜 괄호 안이 비어있는지
        int sum = 0; // 왜 0 넣는지
        int i;

        for (i = 1; i <= 100; i++) {
            sum = sum + i; // sum += i;
        }
        return sum; // 왜 return 하는지
    }

    // 코드의 시작점 (메인함수) JVM - Stack에 할당 됨
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        // sub(int a, int b, int c)
        // 함수 호출 시 들어가는 값을 인수라고 함
        int result1 = sub(num1, num2, 10); // num1, num2 = 리터럴 값
        sayHello("안녕 함수야 반가워");
        sayHello("안녕 ~ 홍길동");
        int result2 = calcSum(); // 리턴값을 int로 받아서... 음

        System.out.println("---------------------------");
        System.out.println(result1);
        System.out.println(result2);

    }
}
