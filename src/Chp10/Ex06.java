package Chp10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ex06 extends JFrame {
    JLabel lbl = new JLabel("C");

    public Ex06() {
        setTitle("클릭 연습용 응용프로그램");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        lbl.setSize(20, 20);
        lbl.setLocation(100, 100);

        lbl.addMouseListener(new MyMouseListener());

        contentPane.add(lbl);

        setSize(400, 400);
        setVisible(true);
    }

    class MyMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            int x = (int) (Math.random() *350);
            int y = (int) (Math.random() *350);

            lbl.setLocation(x, y);
        }
    }

    public static void main(String[] args) {
        new Ex06();
    }
}
