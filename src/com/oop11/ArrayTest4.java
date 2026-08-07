package com.oop11;

public class ArrayTest4 {

    // 코드의 시작점
    public static void main(String[] args) {

        // 문자열로 배열을 사용
        String[] names = new String[10];

        // 인덱스 연산자 활용하여 값을 초기화
        names[0] = "김씨";
        names[1] = "나씨";
        names[2] = "박씨";
        names[3] = null;
        names[9] = "최씨";

        // 배열의 길이와 요소의 개수는 동일하지 않음
        // null값 출력하지 않고 요소만 출력하도록 코드 수정
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                // if (names != null) 이라고 해서 틀림
                // 그냥 names라고 하면 names가 존재하는지에 대해 검사하는 것뿐임
                System.out.println(names[i]);
            }


        } // end of main
    }
}
