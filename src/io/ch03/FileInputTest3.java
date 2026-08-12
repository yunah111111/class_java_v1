package io.ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;

public class FileInputTest3 {

    public static void main(String[] args) {

        // in.read(byte[] b)를 사용해서 코드를 완성하기

        // 데이터를 담아 둘 그릇(바구니0랄 미리 만들어 둔다.)
        // 크기 10 = 한번에 최대 10바이트까지 읽어 오겠다고 설정함
        byte[] buffer = new byte[255];

        // read(byte[])는 읽은 바이트 수를 반환함
        // read()가 바이트 값 자체를 돌려주는 것과 다름
        int readCount;


        LocalTime start = LocalTime.now();

        // try - with -resources
        try (FileInputStream in = new FileInputStream("assets/a.txt")) {
            // [a][b][c][d][e][]
            // [a][b][c] <--
            // [d][e][c]
            while ((readCount = in.read(buffer)) != -1) {

                // buffer.length
                for (int i = 0; i < readCount
                        ; i++) {
                    System.out.print((char)buffer[i]);
                }

            }



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // close() 자동으로 호출 됨
        LocalTime end  = LocalTime.now();

        Duration time = Duration.between(start, end);
        System.out.println(time.toNanos());
    }
}
