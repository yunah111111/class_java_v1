package ch03;

public class ConstantTest3 {

    // 코드 실행의 시작점
    public static void main(String[] args) {
        // 도전 과제 - 사각형의 면적을 구하는 코드 상수 활용하여 작성
        final int WIDTH = 5;
        final double HEIGHT = 6.125;
        double area = WIDTH * HEIGHT;
        System.out.println("사각형 면적: " + area);

        final double WID = 12.2311;
        final double HEI = 121.33;
        double area2 = WID * HEI;
        System.out.println("사각형 면적: " + area2);


    } // end of main

} // end of class
