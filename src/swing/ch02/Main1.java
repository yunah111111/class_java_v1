package swing.ch02;

import javax.swing.*;

public class Main1 {

    public static void main(String[] args) {
        MyComponent myComponent = new MyComponent();
        myComponent.run();
        // new MyComponent().run();
        JTextField field1 = myComponent.getTextField();
        field1.setText("홍길동");
    }

}
