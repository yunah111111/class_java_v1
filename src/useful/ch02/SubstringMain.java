package useful.ch02;

public class SubstringMain {

    public static void main(String[] args) {
        // 개념 정리 - substring은 문자열의 일부 구간을 잘라내어 새로운 문자열로 반환하는 메서드이다.
        // H e l l o W o r l d
        // 0 1 2 3 4 5 6 7 8 9
        String text = "HelloWorld";

        // 1. 시작 위치부터 끝가지 자르기
        System.out.println("substring(5): " + text.substring(5));
        // 2. 시작 위치부터 끝 위치 '앞'까지
        System.out.println("substring(0, 5): " + text.substring(0, 5)); // 5는 포함 안 됨 0 ~ 4까지
        // 3. 만들어져있는 모양 맞추기 개념 확인

        // 시작 인덱스 포함, 끝 인덱스는 포함 안 한다.
        // end - start
        // 6 - 2 = 4  4글자 추출
        System.out.println("substring(2, 6): " + text.substring(2, 6));

        // 주의할 점
        // System.out.println("substring(0, 20): " + text.substring(0, 20));
        // 컴파일 시점에는 오류 안 남 / 런타임 시점에서 에러가 남  ==> 범위를 벗어나기 때문

    } // end of main

} // end of class
