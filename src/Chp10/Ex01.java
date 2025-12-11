package Chp10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ex01 extends JFrame {
    JLabel lbl = new JLabel("사랑해");

    public Ex01() {
        setTitle("마우스 올리기 내리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(lbl);
        lbl.addMouseListener(new MouseListener()); // 이벤트 추가

        setSize(300, 300);
        setVisible(true);
    }

    class MouseListener extends MouseAdapter {
        @Override
        public void mouseEntered(MouseEvent e) { // 마우스 올렸을 때
            lbl.setText("Love Java");
        }

        @Override
        public void mouseExited(MouseEvent e) { // 마우스 내렸을 때
            lbl.setText("사랑해");
        }
    }

    public static void main(String[] args) {
        new Ex01();
    }
}
