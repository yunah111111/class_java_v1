package study;

import java.util.Scanner;

/**
 * 숫자 하나를 입력받아 짝수인지 홀수인지 출력하기
 * 조건 1. Scanner 사용
 * 조건 2. if문 사용
 */
public class Study01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수 입니다.");
        }
    }
}
