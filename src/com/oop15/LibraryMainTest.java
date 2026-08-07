package com.oop15;

import com.oop14.B;

public class LibraryMainTest {

    public static void main(String[] args) {

        // 1. 책 객체를 밖에서 먼저 생성한다. (독립적인 존재)
        Book b1 = new Book("자바의 정석"); // Book 객체 생성
        Book b2 = new Book("이펙트브 자바");

        // 2. 도서관을 만들고 책을 넣을 수 있다.
        Library library1 = new Library(5);  // 도서관 생성 -> books[][][][][] null
        library1.addBook(b1); // books[0] = b1  -> books[b1(자바의정석)][][][][]
        library1.addBook(b2); // books[1] --> books [b1][b2][][][]
        library1.showBooks(); // 배열 돌면서 Book1.display(), Book2.display()를 호출

        System.out.println("----- 도서관 폐관 -----");

        // 3. 도서관 객체를 가리키던 참조를 끊는다.
        // 주의: 이 순간 객체가 사라지는 것이 아니라, GC의 수거 대상이 될 뿐
        // GC: 가비지 콜렉터의 약자
        library1 = null; // library1 -> null이 되어 Library 객체를 가리키는 참조가 끊어짐

        // 4. 도서고나은 사라졌지만 b1, b2는 여전히 살아있다.
        // 즉, b1, b2 변수가 각 Book 객체를 계속 붙잡고 있기 때문에 GC 대상이 안 됨
        // library1.showBooks();
        b1.display();
        b2.display(); // 그래도 정상 작동

    }

}
