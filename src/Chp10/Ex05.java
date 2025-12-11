package Chp10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ex05 extends JFrame {
    JLabel lbl = new JLabel("Love Java");

    public Ex05() {
        setTitle("+, - 키로 폰트 크기 조절");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        lbl.setFont(new Font("Arial", Font.PLAIN, 10));
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
            char keyChar = e.getKeyChar();

            Font f = lbl.getFont();
            int size = f.getSize();

            switch (keyChar) {
                case '+':
                    lbl.setFont(new Font("Arial", Font.PLAIN, size+5));
                    break;
                case '-':
                    lbl.setFont(new Font("Arial", Font.PLAIN, size-5));
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new Ex05();
    }
}
