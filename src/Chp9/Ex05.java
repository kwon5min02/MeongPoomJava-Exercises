package Chp9;

import javax.swing.*;
import java.awt.*;

public class Ex05 extends JFrame {
    public Ex05() {
        setTitle("4x4 Color Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(4,4));

        Color[] colors = {
                Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
                Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
                Color.PINK, Color.LIGHT_GRAY, Color.DARK_GRAY, Color.BLACK,
                Color.WHITE, Color.ORANGE, Color.CYAN, Color.GRAY
        };

        for (int i = 0; i < colors.length; i++) {
            String text = Integer.toString(i);
            JLabel jlabel = new JLabel(text);

            jlabel.setOpaque(true);

            jlabel.setBackground(colors[i]);
            contentPane.add(jlabel);
        }

        setSize(600,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Ex05();
    }
}
