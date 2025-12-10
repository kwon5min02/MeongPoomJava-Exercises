package Chp9;

import javax.swing.*;
import java.awt.*;

public class Ex02 extends JFrame {
    public Ex02() {
        setTitle("BorderLayout Practice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout(5, 7));

        contentPane.add(new JButton("North"), BorderLayout.NORTH);
        contentPane.add(new JButton("South"), BorderLayout.SOUTH);
        contentPane.add(new JButton("West"), BorderLayout.WEST);
        contentPane.add(new JButton("East"), BorderLayout.EAST);
        contentPane.add(new JButton("Center"), BorderLayout.CENTER);

        setSize(400, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Ex02();
    }
}
