package Chp9;

import javax.swing.*;
import java.awt.*;

public class Ex06 extends JFrame {
    public Ex06() {
        setTitle("Random Labels");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        for (int i = 0; i < 20; i++) {
            JLabel label = new JLabel();

            int x = (int)(Math.random() * 200) + 50;
            int y = (int)(Math.random() * 200) + 50;

            label.setLocation(x, y);
            label.setSize(10, 10);
            label.setBackground(Color.BLUE);
            label.setOpaque(true);
            contentPane.add(label);
        }

        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Ex06();
    }
}
