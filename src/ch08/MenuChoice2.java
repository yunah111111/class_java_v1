package ch08;

import java.util.Scanner;

public class MenuChoice2 {

    public static void main(String[] args) {
        // 프로그램 종료시 사용자가 메뉴를 누른 횟수를 출력할 수 있게 코드 수정
        // 예시) 메뉴를 xx번 선택
        Scanner scanner = new Scanner(System.in);
        final int CREATE = 1;
        final int READ = 2;
        final int UPDATE = 3;
        final int DELETE = 4;
        final int END = 0;
        int count = 0;

        while (true) {
            System.out.println("1. 등록 2. 조회 3. 수정 4. 삭제 0. 종료");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            count++;

            if (choice == CREATE) {
                System.out.println("등록을 선택했습니다.");
            } else if (choice == READ) {
                System.out.println("조회를 선택했습니다.");
            } else if (choice == UPDATE) {
                System.out.println("수정을 선택했습니다.");
            } else if (choice == DELETE) {
                System.out.println("삭제를 선택했습니다.");
            } else if (choice == END) {
                System.out.println("프로그램을 종료합니다.");
                count--;
                System.out.println("메뉴를 " + count + "번 선택했습니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                count--;
            }
        }

    } // end of main

} // end of class
