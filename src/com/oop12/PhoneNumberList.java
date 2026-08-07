package com.oop12;

import java.util.Scanner;

public class PhoneNumberList {

    static int lastIndexNumber = 0;


    // 저장 메소드 만들기
    public static void save(Scanner sc, PhoneNumber[] numList) {
        // 만약 연락처가 다 찼다면
        if (lastIndexNumber >= numList.length) {
            System.out.println("저장공간이 부족합니다.");
            return; // void와 같이 쓰이는 return은 메서드 종료
        }
        System.out.println("새 연락처 추가");
        System.out.println("이름을 입력해주세요: ");
        String name = sc.nextLine();
        System.out.println("전화번호를 입력해주세요: ");
        String num = sc.nextLine();

        // 다시 객체 생성
        PhoneNumber phoneNumber = new PhoneNumber(name, num);
        numList[lastIndexNumber] = phoneNumber;
        lastIndexNumber++;
    }

    // 전체 조회 메소드
    public static void viewAllList(PhoneNumber[] numList) {
        if (lastIndexNumber == 0) {
            System.out.println("조회할 연락처가 없습니다.");
            return;
        }
        for (int i = 0; i < numList.length; i++) {
            if (numList[i] != null) {
                System.out.println(numList[i].getName() + ", " + numList[i].getPhoneNumber());
            }
        }
    }


    // 선택 조회 메소드
    public static void viewSomeList(Scanner sc, PhoneNumber[] numList) {
        // 만약 연락처가 하나도 없다면
        if (lastIndexNumber == 0) {
            System.out.println("조회할 연락처가 없습니다.");
            return;
        }
        for (int i = 0; i < numList.length; i++) {
            if (numList[i] != null) {
                System.out.println("조회할 연락처의 이름을 입력하세요: ");
                String name = sc.nextLine();
                if (numList[i].getName().equals(name)) {
                    numList[i].showInfo();
                    break;
                } else {
                    System.out.println("이름을 잘못 입력했습니다.");
                    break;
                }
            }

        }
    }

    // 수정 메서드
    public static void update(Scanner sc, PhoneNumber[] numList) {
        System.out.println("변경하고 싶은 연락처의 이름을 입력하세요: ");
        String name = sc.nextLine();

        for (int i = 0; i < numList.length; i++) {
            if (name.equals(numList[i].getName())) {
                System.out.println("해당 연락처의 새로운 전화번호를 입력하세요: ");
                String newNum = sc.nextLine();
                numList[i] = new PhoneNumber(numList[i].getName(), newNum);
                break;
            } else {
                System.out.println("해당 연락처를 찾을 수 없습니다.");
                break;
            }
        }
    }

    // 전체 삭제 메서드
    public static void delete(PhoneNumber[] numList) {
        for (int i = 0; i < numList.length; i++) {
            numList[i] = null;
        }
        System.out.println("전체 연락처를 삭제했습니다.");
        lastIndexNumber = 0;
    }

    // 선택 삭제 메서드
    public static void deleteSomeList(Scanner sc, PhoneNumber[] numList) {
        if (lastIndexNumber == 0) {
            System.out.println("삭제할 연락처가 없습니다.");
            return;
        }

        System.out.println("삭제하고 싶은 연락처의 이름을 입력하세요: ");
        String name = sc.nextLine();

        for (int i = 0; i < numList.length; i++) {
            if (numList[i] != null) {
                if (numList[i].getName().equals(name)) {
                    numList[i] = null;
                    System.out.println("연락처를 삭제했습니다.");
                    break;
                } else {
                    System.out.println("이름을 잘못 입력했습니다.");
                    break;
                }
            }
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhoneNumber[] numList = new PhoneNumber[100];

        // 샘플 데이터 만들기
        numList[0] = new PhoneNumber("홍길동", "010-0000-0000");
        numList[1] = new PhoneNumber("이순신", "010-1111-1111");
        numList[2] = new PhoneNumber("유관순", "010-2222-2222");
        numList[3] = new PhoneNumber("장영실", "010-3333-3333");
        numList[4] = new PhoneNumber("윤동주", "010-4444-4444");
        numList[5] = new PhoneNumber("방정환", "010-5555-5555");

        lastIndexNumber = 6;

        final String SAVE = "1";
        final String SHOW_ALL_LIST = "2";
        final String UPDATE = "3";
        final String DELETE = "4";
        final String SHOW_CHOICE_LIST = "5";
        final String DELETE_CHOICE_LIST = "6";
        final String END = "0";


        while (true) {

            System.out.println("------------ 메뉴를 선택해주세요. ------------");
            System.out.println("1. 저장 2. 전체조회 3. 수정 4. 전체삭제 5. 선택조회 6. 선택삭제 0. 프로그램 종료");
            String menu = sc.nextLine();

            if (menu.equals(SAVE)) {
                save(sc, numList);
            } else if (menu.equals(SHOW_ALL_LIST)) {
                viewAllList(numList);
            } else if (menu.equals(UPDATE)) {
                update(sc, numList);
            } else if (menu.equals(DELETE)) {
                delete(numList);
            } else if (menu.equals(SHOW_CHOICE_LIST)) {
                viewSomeList(sc, numList);
            } else if (menu.equals(DELETE_CHOICE_LIST)) {
                deleteSomeList(sc, numList);
            } else if (menu.equals(END)) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }


        }


    } // end of main
} // end of class
