package Chp11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ex06 extends JFrame {
    public Ex06() {
        setTitle("TextArea Practice Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(2, 1));

        JTextArea textArea = new JTextArea();

        JSlider slider = new JSlider(0, 100, 0);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);

        // 텍스트 글자 수만큼 슬라이드 움직이기
        textArea.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                JTextArea textArea = (JTextArea) e.getSource();
                if (textArea.getText().length() >= 100) // 글자수 제한
                    textArea.setEnabled(false);

                slider.setValue(textArea.getText().length());
            }
        });

        // 슬라이드 줄이면 글자 수도 줄어듦
        slider.addChangeListener(e -> {
            if (textArea.getText().length() >= slider.getValue())
                textArea.setText(textArea.getText().substring(0, slider.getValue()));
        });

        contentPane.add(new JScrollPane(textArea));
        contentPane.add(slider);

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex06();
    }
}
