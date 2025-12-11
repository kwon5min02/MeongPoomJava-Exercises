package Chp10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ex02 extends JFrame {
    Container contentPane;
    public Ex02() {
        setTitle("드래깅동안 YELLOW");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = getContentPane();
        contentPane.setBackground(Color.GREEN);

        contentPane.addMouseListener(new MouseListener());  // 드래그 놓기
        contentPane.addMouseMotionListener(new MouseListener());  // 드래그

        setSize(400, 200);
        setVisible(true);
    }

    class MouseListener extends MouseAdapter {
        @Override
        public void mouseDragged(MouseEvent e) { // 드래그 하는 동안: 노란색
            contentPane.setBackground(Color.YELLOW);
        }

        @Override
        public void mouseReleased(MouseEvent e) { // 마우스를 놓았을 때: 초록색
            contentPane.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new Ex02();
    }
}
