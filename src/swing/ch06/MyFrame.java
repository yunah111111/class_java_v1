package swing.ch06;

import swing.ch03.Mypanel;

import javax.crypto.KEM;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame {

    private JLabel backgroundMap;
    private JLabel player;
    private final int MOVE_STEP = 10;
    // private final int JUMP = 60;

    public MyFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setTitle("이미지 겹치기 연습");
        setSize(1000, 640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 배경 이미지 설정해보기
        ImageIcon backgroundIcon = new ImageIcon("images/images/backgroundMap.png");
        backgroundMap = new JLabel(backgroundIcon);
        // 배치 관리자 좌표 ==> 컴포넌트 사이즈와 위치를 직접 지정해야 함
        backgroundMap.setSize(1000, 600);
        backgroundMap.setLocation(0, 0);

        // 플레이어 이미지 초기화
        ImageIcon playerIcon = new ImageIcon("images/images/playerL.png");
        player = new JLabel(playerIcon);
        player.setSize(100, 100);
        player.setLocation(800, 510);  // 800 510  점프: 390 한번할때 120

        ImageIcon playerIcon2 = new ImageIcon("images/images/playerL.png");
        player = new JLabel(playerIcon2);
        player.setSize(100, 100);
        player.setLocation(800, 510);

    }

    private void setInitLayout() {
        // 루트 패널에 설정
        setLayout(null);
        add(backgroundMap);

        backgroundMap.add(player);
        setVisible(true);
    }

    private void addEventListener() {
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                int x = player.getX();
                int y = player.getY();

                if (keyCode == KeyEvent.VK_UP) {
                    player.setLocation(x, y - MOVE_STEP);
                    if (player.getY() < -5) {
                        player.setLocation(x, y);
                    }
                } else if (keyCode == KeyEvent.VK_DOWN) {
                    player.setLocation(x, y + MOVE_STEP);
                    if (player.getY() > 510) {
                        player.setLocation(x, y);
                    }
                } else if (keyCode == KeyEvent.VK_LEFT) {
                    player.setLocation(x - MOVE_STEP, y);
                    player.setIcon(new ImageIcon("images/images/playerL.png"));
                    if (player.getX() < 40) {
                        player.setLocation(x, y);
                    }
                } else if (keyCode == KeyEvent.VK_RIGHT) {
                    player.setLocation(x + MOVE_STEP, y);
                    player.setSize(100, 100);
                    player.setIcon(new ImageIcon("images/images/playerR.png"));
                    if (player.getX() > 870) {
                        player.setLocation(x, y);
                    }
                }
            }

            //if (player.getY() < 510) {
            //                        player.setLocation(x, 510);
            //                    } 떨어질때

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }


    // 테스트 코드
    public static void main(String[] args) {
        new MyFrame();
    }

}
