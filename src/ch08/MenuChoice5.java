package ch08;

import java.util.Scanner;

public class MenuChoice5 {
    // CRUD
    // 변수 name을 사용해서 CRUD 구현하기

    public static void main(String[] args) {
        // 준비물
        Scanner scanner = new Scanner(System.in);
        final int CREATE = 1;
        final int READ = 2;
        final int UPDATE = 3;
        final int DELETE = 4;
        final int END = 0;
        String name = "";


        while (true) {
            System.out.println("1. 등록 2. 조회 3. 수정 4. 삭제 0. 종료");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == CREATE) {
                // 만약 name에 등록된 값이 있다면 이미 등록되어 있습니다. (등록x)
                // name 변수에 스캐너를 사용해서 이름을 등록하는 기능을 구현
                System.out.println("등록을 선택했습니다.");
                if (name ==  "") {
                    System.out.print("등록 : ");
                    name = scanner.nextLine();
                } else {
                    System.out.println("이미 등록되어 있습니다.");
                }
            } else if (choice == READ) {
                // 만약 이름이 등록된 적이 없다면 조회할 이름이 없습니다.
                // name 안에 담겨진 값을 출력하는 기능 구현

                if (name == "") {
                    System.out.println("조회할 이름이 없습니다.");
                } else {
                    System.out.println("조회를 선택했습니다.");
                    System.out.println("name: " + name);
                }
            } else if (choice == UPDATE) {
                // 수정해야할 값이 없습니다. 등록부터 해주세요
                // name 수정하는 기능 구현

                if (name == "") {
                    System.out.println("수정해야할 값이 없습니다. 등록부터 해주세요.");
                } else {
                    System.out.println("수정을 선택했습니다.");
                    name = scanner.nextLine();
                }
            } else if (choice == DELETE) {
                // name 삭제하는 기능 구현
                System.out.println("삭제를 선택했습니다.");
                name = "";
            } else if (choice == END) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }

    } // end of main

} // end of class
