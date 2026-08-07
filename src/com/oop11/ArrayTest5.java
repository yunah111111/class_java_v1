package com.oop11;

import java.util.Random;

public class ArrayTest5 {

    public static int[] makeNumber() {
        // 1, 10, 11, 12 등등 여섯자리 정수값을 반환하는 코드
        Random random = new Random();

//        int g1 = random.nextInt(45) + 1;
        // 17 0 0 0 0 0
//        int g2 = random.nextInt(45) + 1;
        // 17 2 0 0 0 0
//        int g3 = random.nextInt(45) + 1;
        // 17 2 38 0 0 0
//        int g4 = random.nextInt(45) + 1;
//        int g5 = random.nextInt(45) + 1;
//        int g6 = random.nextInt(45) + 1;

        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(45) + 1;
        } // 이 for문은 랜덤 숫자를 하나씩 넣기 위한 반복문
        return numbers;
        // return null; // 가리키는 주소가 없음
    } // end of makeNumber method

    public static void main(String[] args) {

        int[] lotto = makeNumber();
        System.out.println(lotto); // 주소값이 나옴 근데 왜 난 에러 뜨지

        for (int i = 0; i < 6; i++) {
            System.out.print(lotto[i] + "\t");
        }


    } // end of main

} // end of class
