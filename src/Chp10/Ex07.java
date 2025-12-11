package Chp10;

import javax.swing.*;
import java.awt.*;

public class Ex07 extends JFrame {
    JLabel lbl = new JLabel("Love Java");

    public Ex07() {
        setTitle("마우스 휠을 굴려 폰트 크기 조절");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        lbl.setFont(new Font("Arial", Font.PLAIN, 11));
        contentPane.add(lbl);

        lbl.addMouseWheelListener(e -> {
            Font font = lbl.getFont();
            int size = font.getSize();

            if(e.getWheelRotation() < 0) { // up direction
                lbl.setFont(new Font("Arial", Font.PLAIN, size+5));
            }  else { // down direction
                if (size > 0) // 최소 크기
                    lbl.setFont(new Font("Arial", Font.PLAIN, size-5));
            }
        });

        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex07();
    }
}
