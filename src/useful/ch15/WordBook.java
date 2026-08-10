package useful.ch15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordBook {

    public static void main(String[] args) {
        // apple, -> 사과
        Map<String, String> words = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        words.put("apple", "사과");
        words.put("banana", "바나나");
        words.put("cherry", "체리");

        while (true) {
            System.out.println("\n===영한 단어장===");
            System.out.println("1. 단어 추가 2. 단어 검색 3. 전체 출력 4. 종료");
            System.out.print("선택: ");
            String choice = sc.nextLine();

            // 아래 기능을 구현해주세요
            if (choice.equals("1")) {
                System.out.println("추가할 영어 단어를 입력해주세요 >> ");
                String addEng = sc.nextLine();
                System.out.println("영어 단어의 뜻을 입력해주세요 >> ");
                String addKor = sc.nextLine();
                words.put(addEng, addKor);
            } else if (choice.equals("2")) {
                System.out.println("검색할 단어를 입력해주세요 >> ");
                String search = sc.nextLine();
                if (words.containsKey(search)) {
                    System.out.println(words.get(search));
                } else if (words.containsValue(search)) {
                    System.out.println(search);
                } else {
                    System.out.println("해당 단어는 없는 단어입니다.");
                }
            } else if (choice.equals("3")) {
                System.out.println("===전체 출력===");
                System.out.println(words);
            } else if (choice.equals("4")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("없는 번호입니다. 다시 입력해주세요.");
            }
        }


        // 자원 닫기
        sc.close();
    }
}
