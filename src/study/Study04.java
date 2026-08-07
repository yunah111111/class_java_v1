package study;

import java.util.Scanner;

/**
 * 변수 하나를 이용해서 메모장 만들기
 * 메뉴
 * 1. 메모 작성 // 2. 메모 조회 // 3. 메모 삭제 // 0. 종료
 * 조건 1. 메모는 int memo 변수 하나만 사용
 * 조건 2. 메모가 없는데 조회하면 => 메모가 없습니다.
 * 조건 3. 메모가 없는데 삭제하면 => 삭제할 메모가 없습니다.
 * 조건 4. 메모가 있는데 다시 작성하려고 하면 => 이미 메모가 있습니다.
 */
public class Study04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int CREATE = 1;
        final int READ = 2;
        final int DELETE = 3;
        final int END = 0;
        String memo = "";
        boolean isHere = false;

        while (true) {
            System.out.println("1. 메모 작성 // 2. 메모 조회 // 3. 메모 삭제 // 0. 종료");
            System.out.print("메뉴를 입력하세요: ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == CREATE) {
                if (isHere) { // 맨처음 isHere = false => 만약 여기에 메모가 있다면
                    System.out.println("이미 메모가 있습니다."); // 이미 메모가 있습니다 출력
                } else {
                    System.out.println("메모 작성:"); // 아니라면 메모 작성 ㄱㄱ
                    memo = sc.nextLine(); // memo 변수에 스캐너 담기
                    isHere = true; // 메모 작성했으니까 이제 메모 있는 거 => is here = true
                }
            } else if (menu == READ) {
                if (isHere) { // 만약 여기 메모가 있다면
                    System.out.println("메모 조회: " + memo); // 메모를 조회하고 메모 띄워라
                } else {
                    System.out.println("메모가 없습니다."); // 아니라면 메모가 없음 출력
                }
            } else if (menu == DELETE) {
                if (isHere) { // 만약 여기 메모가 있다면
                    memo = ""; // 메모 삭제
                    System.out.println("메모를 삭제했습니다."); // 메모 삭제 출력
                    isHere = false; // 이제 메모 삭제 했으니까 메모 없는 거임 => isHere = false
                } else {
                    System.out.println("삭제할 메모가 없습니다."); // 아니라면 삭제할 메모 없음 출력
                }
            } else if (menu == END) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

        }
    }
}
