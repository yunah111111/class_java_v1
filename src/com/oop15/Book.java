package com.oop15;

public class Book { // Book 클래스 만들기

    private String title; // 책이 가지고 있는 정보

    public Book(String title) { // 생성자
        this.title = title;
    }

    public void display() { // 책 정보 출력하는 메서드
        System.out.println("책 제목: " + title);
    }

}
