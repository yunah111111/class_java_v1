package study.july30;

import java.util.Scanner;
import java.util.concurrent.CompletionService;
import java.util.concurrent.CountDownLatch;

public class BankMain {

//    // 고객 등록
//    static int arrayNum = 0;
//
//    public static void save(Scanner sc, Customer[] numList) {
//        if (arrayNum >= numList.length) {
//            System.out.println("저장공간이 부족합니다.");
//            return;
//        }
//        System.out.println("신규 고객 등록");
//        System.out.print("이름: ");
//        String name = sc.nextLine();
//        System.out.print("계좌번호: ");
//        String accountNum = sc.nextLine();
//
//        Customer customer = new Customer(name, accountNum);
//        numList[arrayNum] = customer; // arrayNum이 0이면 numList[0]에 고객 정보 할당
//        arrayNum++;
//    }




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Customer[] numList = new Customer[100];



        numList[0] = new Customer("윤정한", "000-0000-000000");
        numList[1] = new Customer("김민규", "111-1111-111111");
        numList[2] = new Customer("홍지수", "222-2222-222222");
        numList[3] = new Customer("최승철", "333-3333-333333");
        numList[4] = new Customer("나재민", "444-4444-444444");

        Bank.arrayNum = 5;

        final String SAVE = "1";
        final String SHOW_ALL = "2";
        final String PUT = "3";
        final String OUT = "4";
        final String ACCOUNT_CHECK = "5";
        final String END = "0";

        while(true) {
            System.out.println("===== 은행 프로그램 =====");
            System.out.println("1. 고객 등록");
            System.out.println("2. 전체 조회");
            System.out.println("3. 입금");
            System.out.println("4. 출금");
            System.out.println("5. 계좌 조회");
            System.out.println("0. 프로그램 종료");
            System.out.println("=======================");
            System.out.print("메뉴를 선택하세요 >> ");
            String menu = sc.nextLine();

            if (menu.equals(SAVE)) {
                Bank.save(sc, numList);
            } else if (menu.equals(SHOW_ALL)) {
                Bank.show(numList);
            } else if (menu.equals(PUT)) {

            } else if (menu.equals(OUT)) {

            } else if (menu.equals(ACCOUNT_CHECK)) {

            } else if (menu.equals(END)) {

            } else {
                System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
            }





        }



    } // end of main

} // end of class
