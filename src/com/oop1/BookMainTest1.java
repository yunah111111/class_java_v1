package com.oop1;

public class BookMainTest1 {

    // 코드 실행의 시작점
    public static void main(String[] args) {

        Book book1 = new Book(); // new명령어가 메모리에 올리는 것
        Book book2 = new Book();
        Book book3 = new Book();
        /**
         *  Book이라는 클래스(설계도)가 있다.
         *  b1 => 객체를 기억할 변수 이름
         *  new book() => 설계도로 객체 만들기
         *  = 만든 객체의 주소를 b1에 저장
         *
         *  b1은
         *
         *  Book b1 = new Book();
         *  => book
         */

        System.out.println("book1: " + book1);
        System.out.println("book2: " + book2);
        System.out.println("book3: " + book3);

        // new 키워드를 3번 작성했기 때문에 Heap이라는 메모리 영역에 객체가 3개 생성이 되었다.
        // 즉 메모리에 올라가면(인스턴스화) 객체라고 부를 수 있다.


    } // end of main

} // end of class
