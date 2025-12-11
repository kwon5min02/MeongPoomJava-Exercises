package Chp10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ex03 extends JFrame {
    JLabel lbl = new JLabel("Love Java");

    public Ex03() {
        setTitle("Left 키로 문자열 교체");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        contentPane.add(lbl);

        // 1. 레이블이 포커스를 받을 수 있도록 설정
        lbl.setFocusable(true);

        // 2. 리스너 부착
        lbl.addKeyListener(new MyKeyListener());

        setSize(400, 400);

        // 3. 화면에 프레임을 먼저 출력
        setVisible(true);

        // 4. 화면에 나온 뒤에 포커스를 요청해야 함
        lbl.requestFocus();
    }

    class MyKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();

            if (keyCode == KeyEvent.VK_LEFT) {
                StringBuilder str = new StringBuilder(lbl.getText());
                lbl.setText(str.reverse().toString());
            }
        }
    }

    public static void main(String[] args) {
        new Ex03();
    }
}
