package com.oop11;

public class ArrayTest2 {

    // 코드의 시작점
    public static void main(String[] args) {

        // 문자열 사용 방법
        String s1 = "안녕";
        String s2 = new String("안녕");

        // 문자열로 배열을 사용
        String[] names = new String[5];

        // 인덱스 연산자 활용하여 값을 초기화
        names[0] = "김씨";
        names[1] = "나씨";
        names[2] = "박씨";

        // 인덱스 연산자를 활용하여 값을 조회
        System.out.println(names); // 주소값 출력, [][][][][] 생성 됨
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        // 인덱스 연산자를 통해서 값을 수정
        names[0] = "Mr.Kim";
        names[1] = "Mr.Na";
        names[2] = "Mr.Park";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        // 인덱스 연산자를 통해서 값을 삭제 String에 값이 없는 걸 null이라고 함
        // null --> 가리키는 주소가 없다
        names[0] = null;
        names[1] = null;
        names[2] = null;
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);

        // System.out.println(names[5]); // 오류 발생

        System.out.println(names.length); // 배열의 길이를 나타냄
        System.out.println(names.length -1); // 인덱스 크기를 나타냄



    } // end of main

} // end of class
