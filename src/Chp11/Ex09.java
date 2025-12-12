package Chp11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex09 extends JFrame {
    ImageIcon[] image = {
            new ImageIcon("images/rock.png"),
            new ImageIcon("images/scissors.png"),
            new ImageIcon("images/paper.png"),
            new ImageIcon("images/question.png"),
    };
    JButton rock; JButton scissors; JButton paper;
    JLabel me; JLabel com; JLabel result;

    public Ex09() {
        setTitle("가위 바위 보 게임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        JPanel north = new JPanel();
        north.setLayout(new FlowLayout());
        JPanel center = new JPanel();
        center.setLayout(new FlowLayout());
        center.setBackground(Color.YELLOW);

        // 위쪽 이미지 버튼 생성
        rock = new JButton(image[0]);
        scissors = new JButton(image[1]);
        paper = new JButton(image[2]);
        rock.addActionListener(new MyActionListener());
        scissors.addActionListener(new MyActionListener());
        paper.addActionListener(new MyActionListener());
        north.add(rock); north.add(scissors); north.add(paper);

        // 아래 이미지 생성
        me = new JLabel(image[3]);
        JLabel str = new JLabel("me");
        com = new JLabel(image[3]);
        JLabel str2 = new JLabel("com");
        result = new JLabel();
        result.setForeground(Color.RED);
        center.add(me); center.add(str); center.add(com); center.add(str2); center.add(result);

        contentPane.add(north, BorderLayout.NORTH);
        contentPane.add(center, BorderLayout.CENTER);
        pack();
        setVisible(true);
    }

    class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            // 누른 버튼에 따라 이미지 교체
            if (button == rock)
                me.setIcon(image[0]);
            else if (button == scissors)
                me.setIcon(image[1]);
            else if (button == paper)
                me.setIcon(image[2]);

            // 컴퓨터 이미지
            int random = (int) (Math.random() * 3);
            com.setIcon(image[random]);

            // 가위바위보 결과 판단
            if (button == rock) {
                if (random == 0)
                    result.setText("Same!!");
                else if (random == 1)
                    result.setText("Me!!");
                else if (random == 2)
                    result.setText("Computer!!");
            } else if (button == scissors) {
                if (random == 0)
                    result.setText("Computer!!");
                else if (random == 1)
                    result.setText("Same!!");
                else if (random == 2)
                    result.setText("Me!!");
            } else if (button == paper) {
                if (random == 0)
                    result.setText("Me!!");
                else if (random == 1)
                    result.setText("Computer!!");
                else if (random == 2)
                    result.setText("Same!!");
            }
        }
    }

    public static void main(String[] args) {
        new Ex09();
    }
}
