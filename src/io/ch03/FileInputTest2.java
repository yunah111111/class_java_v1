package io.ch03;

import useful.ch01.EBook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;

public class FileInputTest2 {

    public static void main(String[] args) {

        // 파일을 열면 반드시 닫아 준은 것이 좋다 하지만 반복적 코드가 매번 발생해서 불편함이 있다.
        // 8버전 이후의 이 불편함을 해결하기 위해서 새로운 문법 try-with-resources 제공하고 있다.

//        try {
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        } finally {
//
//        }

//        try (스트림을 생성... 자동으로 close() 호출 됨) {
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        LocalTime start = LocalTime.now();
        // try - with -resources
        try (FileInputStream in = new FileInputStream("assets/a.txt")) {

            int readData;
            while ((readData = in.read()) != -1) {
                System.out.print((char)readData);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // close() 자동으로 호출 됨
        LocalTime end = LocalTime.now();

        Duration time = Duration.between(start, end);
        System.out.println(time.toNanos());

    }
}
