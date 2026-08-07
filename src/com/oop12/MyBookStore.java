package com.oop12;

import java.util.Scanner;

/**
 * 모든 프로그래밍의 기본은 C(Create) R(Read) U(Update) D(Delete) 이다.
 * 배열을 활용한 간단한 데이터 관리 시스템
 */
public class MyBookStore {

    // 현재 저장된 실제 데이터 개수를 출력하는 공유 변수(static)
    static int lastIndexNumber = 0;
    // 기준값으로 사용하기 위한 static 변수를 선언함

    // 전체 조회하기
    public static void readAll(Book[] books) {
        System.out.println("------------ 전체 조회 호출 됨 --------------");
        if (lastIndexNumber == 0) {
            System.out.println("아직 저장된 책이 없습니다.");
            return;
        }

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i].getTitle() + ", " + books[i].getAuthor());
            }
        }
    }

    // 전체 삭제하기
    public static void deleteAll(Book[] books) {
        System.out.println("------------ 전체 삭제하기 ------------");
        for (int i = 0; i < books.length; i++) {
            books[i] = null;
        }
        // 전체 삭제 후 기준 값 0으로 초기화
        lastIndexNumber = 0;
    }

    // 저장하기
    // [a][b][c][d][e][][][][][]......
    public static void save(Scanner sc, Book[] books) {   // Scanner sc 이거 이해하기
        System.out.println("------------ 저장하기 호출 됨 ------------");

        if (lastIndexNumber >= books.length) {
            System.out.println("저장 공간이 가득 찼습니다.");
            return; // 메서드 즉시 종료 키워드 or 반환 키워드
        }

        System.out.println("책의 제목을 입력하세요.");
        String title = sc.nextLine();
        System.out.println("책의 저자를 입력하세요.");
        String author = sc.nextLine();

        Book book = new Book(title, author);
        books[lastIndexNumber] = book;
        lastIndexNumber++;
    }

    // 선택 조회
    public static void searchByTitle(Scanner sc, Book[] books) {
        System.out.println("------------ 선택 조회 호출 됨 ------------");
        System.out.println("조회할 책 제목을 입력해주세요.");
        String targetTitle = sc.nextLine();

        boolean isFine = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) { // 예외 상황 방지용으로
                // 만약 books[i] == null을 하면 book[2]는 null인데
                // books[2].getTitle을 하면 비어있는데 어케 제목 알려주냐고 오류 발생...

                // 문자열 비교는 반드시 equal() 사용
                // .trim() --> 문자열에 앞뒤 공백 자동 제거
                // 공백사피 엔스공백 ..?
                if (books[i].getTitle().equals(targetTitle.trim())) {
                    System.out.println("[검색 결과 확인]");
                    books[i].showInfo();
                    isFine = true;
                    break;
                }
            }
        }
        // isFine -> true or false
        // isFine -> true --> false
        // if (isFine == false)
        if (isFine == false) {  // 단독 if문은 true일 때만 실행이 됨 / 반대로 false일 때 실행시키고 싶으면 !부정하면 됨
            System.out.println("조회된 책 결과가 없습니다.");
        }
    }

    // 선택 삭제
    public static void deleteByTitle(Scanner sc, Book[] books) {
        System.out.println("------------ 선택 삭제 ------------");
        System.out.println("삭제할 책 제목을 입력해주세요");
        String targetDelete = sc.nextLine();

        boolean isFind = false; //
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                if (books[i].getTitle().equals(targetDelete)) {
                    books[i] = null;
                    isFind = true;
                    break;
                }
            }
        }
        if (isFind == false) {
            System.out.println("입력한 책은 없습니다.");
        }
        lastIndexNumber--; // 넣어도 될려나
    }


    // 도전 과제 1
    // 선택 삭제 하는 기능 만들기


    // 메인 함수
    public static void main(String[] args) {
        // 준비물
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[100];

        // 샘플 데이터 만들어 놓기
        books[0] = new Book("플러터UI실전", "김근호");
        books[1] = new Book("무궁화꽃이피었습니다", "김진명");
        books[2] = new Book("흐르는강물처럼", "파울로코엘료");
        books[3] = new Book("리딩으로리드하라", "이지성");
        books[4] = new Book("사피엔스", "유발하라리");

        // 샘플 데이터가 5개 이므로 인덱스 관리 번호로 사용
        lastIndexNumber = 5;

        boolean flag = true;

        final String SAVE = "1";
        final String SEARCH_ALL = "2";
        final String SEARCH_BY_TITLE = "3";
        final String DELETE_ALL = "4";
        final String DELETE_BY_TITLE = "5";
        final String END = "0";

        // 2단계 실행의 흐름 만들어 보기
        while (flag) {
            System.out.println("** 메뉴 선택 **");
            System.out.println("1.저장 2.전체 조회 3.선택 조회 4.전체 삭제 5. 선택 삭제 0.종료");
            String selectedNumber = sc.nextLine();

            if (selectedNumber.equals(SAVE)) {
                save(sc, books);
            } else if (selectedNumber.equals(SEARCH_ALL)) {
                readAll(books);
            } else if (selectedNumber.equals(SEARCH_BY_TITLE)) {
                searchByTitle(sc, books);
            } else if (selectedNumber.equals(DELETE_ALL)) {
                deleteAll(books);
            }else if (selectedNumber.equals(DELETE_BY_TITLE)){
                deleteByTitle(sc, books);
            }else if (selectedNumber.equals(END)) {
                System.out.println(">> 프로그램 종료");
                flag = false;
            } else {
                System.out.println(">>> 잘못된 선택입니다 <<<");
            }
        }
    } // end of main


} // end of class
