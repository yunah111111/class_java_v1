package ch08;

public class ContinueTest3 {

    public static void main(String[] args) {
        // 369 게임 - 1부터 30까지 세되,
        // 3, 6, 9 들어간 숫자는 "짝!" 이라고 외침
        // 13, 16, 19
        // 23, 26, 29
        for (int i = 1; i <= 30; i++) {
            int last = (i % 10);
            int first = (i / 10);
            if (last == 3 || last == 7 || last == 9 || first == 3) {
                System.out.println("짝");
                continue;
            }
            System.out.println(i);
        }

        System.out.println("-------------------------------");

        // 샘플 테스트 코드
        // 나머지 연산자와 10이라는 숫자를 활용하면 끝 자리를 추출할 수 있음
        System.out.println(23 % 10); // 23 / 10 = 2 --> 3
        System.out.println(47 % 10); // 47 / 10 = 4 --> 7
        System.out.println(39 % 10); // 39 / 10 = 3 --> 9
        System.out.println(338 % 10); // 338 / 10 = 33 --> 8


    } // end of main

} // end of class
