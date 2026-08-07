package study;

import java.util.Scanner;

/**
 * 계속 메뉴를 출력하는 프로그램을 작성하기
 * 1. 인사하기 0. 종료
 * 1을 입력하면 =>  안녕하세요!
 * 0을 입력하면 => 프로그램을 종료합니다.
 * 그 외 숫자는 => 잘못된 입력입니다.
 * 를 출력하고 다시 메뉴를 보여주기
 * 조건) while문으로 작성
 */
public class Study03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 0;

        while (true) {
            System.out.println("1. 인사하기 0. 종료");
            System.out.print("메뉴를 입력하세요: ");
            menu = sc.nextInt(); // 이미 만든 변수에 값을 넣는 것

            if (menu == 1) {
                System.out.println("안녕하세요!");
            } else if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
