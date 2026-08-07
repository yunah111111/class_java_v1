package ch07;

public class ForTest3 {

    public static void main(String[] args) {

        // 1부터 100까지 수 중 총합 구하기
        // 홀수만 덧셈해서 구하는 총합 담기
        // 1 + 2 + 3 + 4 ... + 100;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            // sum = sum + i
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("sum: " + sum);

        // 반복문에 증감식을 2씩 증가 시키기
        for (int i = 0; i < 10; i += 2) {
            System.out.println("2씩 증가 + " + i);
        }

        System.out.println("---------------------");

        // 문제 - 화면에 10 9 8 7 6 5 4 3 2 1을 출력하는 코드를 작성
        // for문 활용
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n" + "---------------------");

        for (int i = 0; i < 3; i++) {       // i = 0부터 시작, 0 < 3 => true => 안쪽 for문 실행
            for (int j = 0; j < 3; j++) {       // j = 0, 0 < 3 => true => System.out.print(j) 실행
                System.out.print(j);        // j가 0이니까 0 출력 => 또 안쪽 for문 돌기 => j++ => j = 1,  1 < 3 => true => 1출력
            } // 012
            System.out.println();       // 012가 그대로 내려오고 줄바꿈 후 다시 바깥쪽 for문 => i = 1부터 시작, 1 < 3 => true => 안쪽 for문 실행
        }


        for (int i = 0; i < 5; i++) {        // 1. i = 0부터 시작, 0 < 5 => true => 안쪽 for문 ㄱㄱ
                                            // 2. i = 1, 1 < 5 => true => 안쪽 for문 ㄱㄱ
                                            // 3. i = 2, 2 < 5 => true => 안쪽 for문 ㄱㄱ
            for (int j = 0; j < i; j++) {       // 1. j = 0부터 시작, 0 < i (i = 0) => 0 < 0 => false
                                                // 2. j = 0, 0 < 1 => true // j = 1, 1 < 1 => false
                                                // 3. j= 0, 0 < 2 => true // j = 1, 1 < 2 => true // j = 2, 2 < 2 => false
                System.out.print("*");      // 1. => * 0개 // 2. => * (1개 끝) // 3. **
            }
            System.out.println();
            // 1. 걍 줄바꿈만 실행
            // 2. *
            // 3. *
            //    **
            // 4.
        }

        System.out.println("---------------------");

        for (int i = 4; i > 0; i--) {       // 1. i = 4, 4 > 0 => true => 안쪽 for문 ㄱㄱ
            for (int j = 0; j < i; j++) {       // 1. j = 0, 0 < 4 => true => j = 1, 1 < 4 => true ... 3까지 true (4개)
                System.out.print("*");      // 1. ****
            }
            System.out.println();
            // 1. ****
        }


    } // end of main

} // end of class
