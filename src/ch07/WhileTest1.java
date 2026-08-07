package ch07;

public class WhileTest1 {

    public static void main(String[] args) {
        int i = 1;
        // 무한 루프 조심
        //     1 <= 10 --> T ... 11 <= 10
        while (i <= 10) {
            System.out.println("i 값: " + i);
            // 조건식의 처리가 없다면 무한히 반복
            i++;
        }
        System.out.println("-------------------");

        int num = 1;
        int sum = 0;
        // 1 + 2 + 3 + 4 ... 10
        while (num <= 10) { // 1에서 10까지 반복
            sum += num; // sum = sum + num => 0 + 1 // 1 + 2 ...
            num++; // 조건식에 대한 처리가 반드시 필요 // num 1씩 증가
        }
        System.out.println("sum 합계: " + sum);


    } // end of main

} // end of class
