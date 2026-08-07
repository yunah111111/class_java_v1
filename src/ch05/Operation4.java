package ch05;

/**
 * 증감, 감소 연산자 ++, --
 * 부호 연산자와 다르게 변수에 직접 접근해서 오직 1증가, 감소를 시키는 연산자이다.
 */
public class Operation4 {

    // 메인 함수
    public static void main(String[] args) {
        int value1 = 1;
        // 증감 연산자
        value1++;
        System.out.println("value1: " + value1);
//        value1 = value1 + 1;
//        value1 += 1;
//        value1++;

        // 감소 연산자
        int value2 = 1;
        value2--;
        System.out.println("value2: " + value2);
        System.out.println("----------------------------");

        // 2.1 - 증감 연산자가 항 앞에 올 경우 (전위 연산자) ++10;
        // 2.2 - 증감 연산자가 항 뒤에 올 경우 (전위 연산자) 10++;

        // 증감 전위 연산자 사용
        int data1 = 10;
        int temp1 = ++data1;
        System.out.println("temp1: " + temp1);

        // 증감 후위 연산자 사용
        int data2 = 10;
        int temp2 = data2++;
        System.out.println("temp2: " + temp2);
        // 증감 후위 연산자를 사용할 때 변수에 접근해서 값이 1증가 되는 것은 맞음
        // 단, ;(세미콜론)이 끝난 이후

        // 항이 하나 있을 때 확인
        int data3 = 10;
        int data4 = 10;
        ++data3;
        data4++;
        System.out.println("data3: " + data3);
        System.out.println("data4: " + data4);

        // 반복문을 제외하고 전위 연산자를 사용하는게 권장사항

        System.out.println("=============================");

        // 문제 1. 전위 감소 연산자, 후위 감소 연산자를 사용하고 결과를 출력
        int num1 = 12;
        int num2 = num1++; // num1 = 13  // num2 = 12
        int num3 = ++num1; // num1 = 14  // num3 = 14
        System.out.println("num1: " + num1); // 14
        System.out.println("num2: " + num2); // 12
        System.out.println("num3: " + num3); // 14




    } // end of main

} // end of class
