package ch08;

import java.util.Scanner;

public class MenuChoice5_1 {
    // CRUD
    // 변수를 name 을 사용해서 CRUD 구현을 해보자.
    public static void main(String[] args) {
        // 준비물
        Scanner scanner = new Scanner(System.in);
        final int CREATE = 1;
        final int READ = 2;
        final int UPDATE = 3;
        final int DELETE = 4;
        final int END = 0;
        String name = "";
        boolean isRegistered = false;

        while (true) {
            System.out.println("\n메뉴선택");
            System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료");
            System.out.print("선택 : ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 소비

            if (choice == CREATE) {
                if(isRegistered) {
                    System.out.println("이미 등록된 데이터가 있습니다: " + name);
                } else {
                    System.out.println("등록을 선택했습니다");
                    System.out.print("이름을 입력하세요: ");
                    name = scanner.nextLine();
                    isRegistered = true;
                }
            } else if(choice == READ) {
                if (isRegistered) {
                    System.out.println("조회 결과 : " + name);
                } else {
                    System.out.println("등록된 데이터가 없습니다");
                }
            } else if(choice == UPDATE) {
                if (isRegistered) {
                    System.out.print("수정할 이름을 입력하세요: ");
                    name = scanner.nextLine();
                    System.out.println("수정 완료 : " + name);
                } else {
                    System.out.println("등록된 데이터가 없습니다. 수정할 수 없음.");
                }
            } else if(choice == DELETE) {
                if (isRegistered) {
                    System.out.println(name + " 삭제 완료");
                    name = "";
                    isRegistered = false;
                } else {
                    System.out.println("등록된 데이터가 없습니다. 삭제할 수 없음.");
                }
            } else if (choice == END) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요");
            }
        }
    } // end of main
} // end of class
