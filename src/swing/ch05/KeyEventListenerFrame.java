package swing.ch05;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventListenerFrame extends JFrame {

    private final int FREAM_SIZE = 500;
    private JTextArea textArea;



    public KeyEventListenerFrame() {

        initData();
        setInitlayOut();
        addEventListener();

    }

    private void initData() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setResizable(false); // false라고 하면 사용자가 마우스로 크기를 조정 못 하게 막음
        textArea = new JTextArea();

    }

    private void setInitlayOut() {
        add(textArea);
        setVisible(true);


    }

    private void addEventListener() {
        // 이벤트 리스너 등록 - 익명 내부 클래스로 처리
        textArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("키 누름: " + e.getKeyCode());

                Object kbutton = e.getKeyCode();

                if(kbutton.equals(38)) {
                    textArea.append("↑ 위 \n");
                } else if (kbutton.equals(40)) {
                    textArea.append("↓ 아래 \n");
                } else if (kbutton.equals(37)) {
                    textArea.append("← 왼쪽 \n");
                } else if (kbutton.equals(39)) {
                    textArea.append("→ 오른쪽\n");
                }

                // if (e.getKekyCode() == KeyEvent.VK_UP)

            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("KeyReleased 발생: " + e.getKeyCode());
            }
        });
    }


    public static void main(String[] args) {
        new KeyEventListenerFrame();

    }

}
