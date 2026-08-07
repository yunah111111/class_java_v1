package study;

import java.util.Scanner;

/**
 * 학생 한 명의 정보를 저장하는 프로그램 만들기
 * 메뉴 = 1. 등록 // 2. 조회 // 3. 수정 // 4. 삭제 // 0. 종료
 * 등록할 때 이름과 나이 입력받기
 * 삭제하면 둘 다 초기화
 */

public class Study05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int CREATE = 1;
        final int READ = 2;
        final int UPDATE = 3;
        final int DELETE = 4;
        final int END = 0;
        String name = "";
        int age = 0;
        boolean isRegistered = false;


        while (true) {
            System.out.println("1. 등록 // 2. 조회 // 3. 수정 // 4. 삭제 // 0. 종료");
            System.out.print("메뉴 선택: ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == CREATE) {
                if (isRegistered) {
                    System.out.println("이미 등록된 데이터가 있습니다.");
                } else {
                    System.out.print("이름: ");
                    name = sc.nextLine();
                    System.out.print("나이: ");
                    age = sc.nextInt();
                    isRegistered = true;
                }
            } else if (menu == READ) {
                if (isRegistered) {
                    System.out.println("이름: " + name);
                    System.out.println("나이: " + age);
                } else {
                    System.out.println("등록된 데이터가 없습니다.");
                }
            } else if (menu == UPDATE) {
                if (isRegistered) {
                    System.out.println("1. 이름 수정 // 2. 나이 수정");
                    System.out.print("번호 입력: ");
                    int update = sc.nextInt();
                    sc.nextLine();
                    if (update == 1) {
                        System.out.print("수정할 이름: ");
                        name = sc.nextLine();
                        System.out.println("수정이 완료되었습니다.");
                    } else if (update == 2) {
                        System.out.print("수정할 나이: ");
                        age = sc.nextInt();
                        System.out.println("수정이 완료되었습니다.");
                    } else {
                        System.out.println("입력한 번호가 없습니다.");
                    }
                } else {
                    System.out.println("등록된 데이터가 없습니다.");
                }
            } else if (menu == DELETE) {
                if (isRegistered) {
                    name = "";
                    age = 0;
                    isRegistered = false;
                } else {
                    System.out.println("등록된 데이터가 없습니다.");
                }
            } else if (menu == END) {
                System.out.println("프로그램을 종료합니다.");
            } else {
                System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
            }

        }

    }
}
