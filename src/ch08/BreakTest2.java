package ch08;

public class BreakTest2 {

    public static void main(String[] args) {

        // 문제 1. 1부터 100까지 화면에 출력
        //     2. 3의 배수만 화면에 출력
        //     3. 50이상이면 반복문을 종료
        //     4. for문으로 코드 작성

        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            if (i >= 50) {
                break;
            }
        }

    } // end of main

} // end of class
