package study.july30;

import com.oop14.C;

import java.util.Scanner;

public class Bank {

    public String[] customer;
    public String saveCustomer;

    static int arrayNum = 0;

    // 고객 정보
    public static void save(Scanner sc, Customer[] numList) {
        if (arrayNum >= numList.length) {
            System.out.println("저장공간이 부족합니다.");
            return;
        }
        System.out.println("신규 고객 등록");
        System.out.print("이름: ");
        String name = sc.nextLine();
        System.out.print("계좌번호: ");
        String accountNum = sc.nextLine();

        Customer customer = new Customer(name, accountNum);
        numList[arrayNum] = customer; // arrayNum이 0이면 numList[0]에 고객 정보 할당
        arrayNum++;
    }

    // 전체 조회
    public static void show(Customer[] numList) {
        if (arrayNum == 0) {
            System.out.println("조회할 고객이 없습니다.");
            return;
        }
        System.out.println(">>>>> 전체 조회 <<<<<");
        for (int i = 0; i < numList.length; i++) {
            if (numList[i] != null) {
                System.out.println("이름: " + numList[i].getName() + " || 계좌 번호: " + numList[i].getAccountNum());
            }
        }
    }


    // 입금






}
