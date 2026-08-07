package swing.ch03;

import javax.swing.*;
import java.awt.*;

public class SwingFrame extends JFrame {

    SwingFrame swingFrame;

    public SwingFrame() {
        setTitle("집그리기");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new MyImagePanel());
        setVisible(true);

    }

    class MyImagePanel extends JPanel {

        @Override
        public void paint(Graphics g) {
            super.paint(g);

            g.setColor(Color.PINK);
            g.drawRect(500, 0, 700, 0);

        }
    }

    public static void main(String[] args) {
        new MyImageFrame();
    }

}
