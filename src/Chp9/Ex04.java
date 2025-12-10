package Chp9;

import javax.swing.*;
import java.awt.*;

public class Ex04 extends JFrame {
    public Ex04() {
        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        // 1행 10열의 그리드 레이아웃
        contentPane.setLayout(new GridLayout(1, 10));

        // 10가지 색상 배열
        Color[] colors = {
                Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
                Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
                Color.PINK, Color.LIGHT_GRAY
        };

        for (int i = 0; i < 10; i++) {
            String text = Integer.toString(i);
            JButton button = new JButton(text);

            // --- [맥북 호환성 패치] ---
            // 맥북에서는 이 두 설정이 있어야 배경색이 제대로 보입니다.
            button.setOpaque(true);
            button.setBorderPainted(false);
            // ------------------------

            button.setBackground(colors[i]); // 배경색 설정

            contentPane.add(button); // 컨텐트팬에 부착
        }

        setSize(500, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex04();
    }
}