package ch02;

public class DataType3 {

    // 메인 함수
    public static void main(String[] args) {
        // 기본 자료형 (실수형)
        // 1.0, 0.124...
        // float, double - 두 가지 존재 / 4, 8 바이트 크기이다.

        // 4바이트 상자에 8바이트 크기를 넣으려니 오류 발생함
        float floatBox1 = 0.5f;
        float floatBox2 = 0.5F;
        // 접미사 f 선언해줘야 함 -> 실                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            수형 기본에 연산 단위는 double 타입이다.
        // 접미사를 사용해서 자바(컴파일러)에게 0.5는 double이 아니라 float 타입이라 명시하는게 접미사의 역할

        double doubleBox1 = 0.123;
        double doubleBox2 = 0.5;

        // 실수형 자료에서 기본 연산 단위는 double 타입이다.
        // Q. 더 큰 8byte 기본 연산으로 사용할까
        // A. 값의 정확성 때문


    } // end of main

} // end of class
