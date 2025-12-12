package Chp11;

import javax.swing.*;
import java.awt.*;

public class Ex07 extends JFrame {
    public Ex07() {
        setTitle("JSlider Practice Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(2, 1));

        JSlider slider = new JSlider(1, 100, 50);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);

        JLabel lb = new JLabel("I Love Java");
        lb.setHorizontalAlignment(JLabel.CENTER);
        lb.setFont(new Font("Serif", Font.BOLD, 50));

        slider.addChangeListener(e -> {
            JSlider source = (JSlider) e.getSource();
            int value = source.getValue();
            lb.setFont(new Font("Serif", Font.BOLD, value));
        });

        contentPane.add(slider);
        contentPane.add(lb);

        setSize(400, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex07();
    }
}
