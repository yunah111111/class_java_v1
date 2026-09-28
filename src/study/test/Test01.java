package study.test;

import java.util.Scanner;

public class Test01 {

    public int coffee;
    public Test01(int coffee) {
        this.coffee = coffee;
    }

    public static void main(String[] args) {
        int coffee = 2500;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("커피 몇 잔을 주문하시겠습니까(숫자만 입력) >> ");
            int num = sc.nextInt();

            if (num >= 3) {
                System.out.println("총 결제 금액: " + (coffee * num) + "원");
                System.out.println("3잔 이상 구매 서비스 스탬프 발급: ");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            } else if (num == 2 || num == 1) {
                System.out.println("총 결제 금액: " + (coffee * num) + "원");
            } else if (num == 0 || num < 0) {
                System.out.println("1잔 이상 주문해야 합니다.");
            }
        }

    }

}
