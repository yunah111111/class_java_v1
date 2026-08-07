package study;

import java.util.Scanner;

/**
 * 사용자로부터 이름을 입력받기
 * 예시)
 * 입력한 이름이 "admin"이면
 * => 관리자입니다.
 * 그 외에는
 * => 일반 사용자입니다.
 * 를 출력하기
 */
public class Study02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();

        if (name.equals("admin")) {
            // if ("admin".equals(name)으로 사용하기
            // 만약 name = null;이라면 NullPointerException이 발생
            System.out.println("관리자입니다.");
        } else {
            System.out.println("일반 사용자입니다.");
        }
    }
}
