package ch08;

public class BreakTest1 {

    public static void main(String[] args) {

        // 중간에 멈추는 break 구문
        // 만약 i값이 7이라면 중간에 멈추기
        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
            if (i == 7) {
                break;
            }
        }

        System.out.println("---------------------");
        // 문제 1. 100 ~ 200까지 화면에 출력하는 코드를 작성
        //     2. 단 151에 도달 했다면 반복문을 멈추는 코드를 작성
        //     3. 단 while 구문을 사용해서 코드를 작성

        int num = 99;
        while (num <= 200) {
            num++;
            System.out.println(num);
            if (num == 151) {
                break;
            }
        }

    } // end of main

} // end of class
