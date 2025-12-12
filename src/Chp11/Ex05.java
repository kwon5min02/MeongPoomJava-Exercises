package Chp11;

import javax.swing.*;
import java.awt.*;

public class Ex05 extends JFrame {
    public Ex05() {
        setTitle("JSlider Practice Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        JSlider slider = new JSlider(100, 200, 150);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(20);

        JLabel lb = new JLabel("150");
        lb.setBackground(Color.GREEN);
        lb.setOpaque(true);

        // 슬라이더 이벤트 추가
        slider.addChangeListener(e -> {
            lb.setText(slider.getValue() + "");
        });

        contentPane.add(slider);
        contentPane.add(lb);

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex05();
    }
}
