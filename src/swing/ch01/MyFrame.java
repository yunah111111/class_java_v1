package swing.ch01;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    JButton[] buttons = new JButton[3];

    // 문제 1. JButton 객체를 JFrame 객체에 하나 더 올려보기
    // 문제 2. 배열을 활용해서 코드를 수정하기

    public MyFrame() {

        super.setTitle("배치 관리자 생성");
        super.setSize(600, 300);
        super.setVisible(true); // 화면에 setVisible 보이게 처리하라

        initData();
        setInitLayout();
    }

    public void initData() {

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("button" + (i + 1));
        }

    }

    public void setInitLayout() {
        // 배치 관리자 선언
        FlowLayout flowLayout = new FlowLayout();
        // 컴포넌트들을 수평, 수직으로 프레임 배치해 주는 녀석이다.
        super.setLayout(flowLayout);
        for (int i = 0; i < buttons.length; i++) {
            super.add(buttons[i]);
        }
    }

    // 테스트 코드 작성
    public static void main(String[] args) {
//        MyFrame frame1 = new MyFrame();
        new MyFrame();  // 생성자 호출 -->  생성자에 있는 로직이 동작한다.

    } // end of main

} // end of class
