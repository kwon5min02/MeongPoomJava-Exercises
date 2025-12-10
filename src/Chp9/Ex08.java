package Chp9;

import javax.swing.*;
import java.awt.*;

public class Ex08 extends JFrame {
    public Ex08() {
        setTitle("여러 개의 패널을 가진 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        contentPane.add(new NorthPanel(), BorderLayout.NORTH);
        contentPane.add(new CenterPanel(), BorderLayout.CENTER);
        contentPane.add(new SouthPanel(), BorderLayout.SOUTH);

        setSize(300, 300);
        setVisible(true);
    }

    // [북쪽 패널]
    class NorthPanel extends JPanel {
        public NorthPanel() {
            setBackground(Color.LIGHT_GRAY);
            setLayout(new FlowLayout());

            add(new JButton("열기"));
            add(new JButton("닫기"));
            add(new JButton("나가기"));
        }
    }

    // [중앙 패널]
    class CenterPanel extends JPanel {
        public CenterPanel() {
            setBackground(Color.WHITE);
            setLayout(null);

            for (int i = 0; i < 10; i++) {
                JLabel label = new JLabel("*");
                label.setSize(20, 20);
                label.setForeground(Color.RED);
                int x = (int)(Math.random() * 200) + 10;
                int y = (int)(Math.random() * 150) + 10;

                label.setLocation(x, y);
                add(label);
            }
        }
    }

    // [남쪽 패널]
    class SouthPanel extends JPanel {
        public SouthPanel() {
            setBackground(Color.YELLOW);
            setLayout(new GridLayout(1,2));
            add(new JButton("Word Input"));
            add(new JTextField(20));
        }
    }

    public static void main(String[] args) {
        new Ex08();
    }
}
