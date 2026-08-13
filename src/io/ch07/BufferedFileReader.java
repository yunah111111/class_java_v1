package io.ch07;

import com.oop14.B;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFileReader {

    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // 기반 스트림 - 대상은 파일
            fr = new FileReader("assets/a.txt");
            // 보조 스트림 - 기반 스트림을 감싸야함
            br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace(); // 오류나면 추적할 수 있도록 콘솔창에 뿌려라
        } finally {
            try {
                // 닫을 때는 역순으로 닫아줘야 함
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
                // 반대로 닫아야 함 br부터 닫고 fr 닫기
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
