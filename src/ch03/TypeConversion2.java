package ch03;

/**
 * 형변환이란
 * 데이터의 타입을 다른 타입으로 변경 하는 것
 * - 자동 형변환, 강제 형변환
 */
public class TypeConversion2 {

    // 코드의 시작점
    public static void main(String[] args) {
        // 자동 형변환 코드 작성
        // 강제 형변환 코드 작성
        // 결과 출력
        int intArea = 12;
        double doubleArea;
        doubleArea = intArea;
        System.out.println("doubleArea: " + doubleArea);

        double doubleA = 15.984;
        int intA;
        intA = (int) doubleA;
        System.out.println("intA: " + intA);


    } // end of main

} // end of class
