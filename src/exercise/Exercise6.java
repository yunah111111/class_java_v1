package exercise;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int maxNumber = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= maxNumber; i++) {
            sum += i;
        }

        System.out.println("짝수의 합: " + sum);
        scanner.close();
    }
}
//sum = sum + i
//sum = 0;
//i = 1 -> sum = 0 + 1
//i = 2 -> sum = 1 + 2
//i = 3 -> sum = 3 + 3
