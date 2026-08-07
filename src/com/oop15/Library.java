package com.oop15;

import com.oop14.B;

public class Library {

    private Book[] books;  // Book 객체를 저장하는 배열  // 처음에는 books = null 아직 배열도 없음
    private int bookCount;  // 현재 저장된 책 개수

    public Library(int size) {  // Library를 만들 때 몇 권까지 저장할지 받음 // ex) new Library(5)하면 size = 5
        this.books = new Book[size]; // Book를 저장할 수 있는 배열 만들기 // -> books는 아직 [][][][][] null
        this.bookCount = 0;  // 현재 저장된 책 개수
    }

    // 집합 관계의 핵심: 밖에서 생성된 객체의 주소값을 받아온다.
    public void addBook(Book book){   // Book book은 Book 객체의 주소값을 전달받는 변수
        if(bookCount >= books.length) {  // 배열이 꽉 찼는지 검사 // ex) bookCount = 5, books.length = 5면 더 이상 못 넣음
            System.out.println("더이상 책을 넣을 공간이 없습니다.");
        }
        books[bookCount] = book;   // ex) bookCount = 0이라면 books[0] = b1이 됨
        bookCount++; // 저장 개수를 하나 증가 0 -> 1
    }

    public void showBooks() {  // 책 목록 출력
        // 배열 길이가 아니라 실제 담긴 개수까지만 순회한다.
        for(int i = 0; i < bookCount; i++) {  // 실제로 저장된 개수만큼 반복  ex) bookCount = 2면  0, 1까지만 반복
            books[i].display();  // ex) books[0] -> Book 객체 -> display() 호출 // 즉, 책 제목: 자바의 정석 출력
        }
    }

}
