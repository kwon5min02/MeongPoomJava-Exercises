package Chp9;

import javax.swing.*;
import java.awt.*;

public class Ex07 extends JFrame {
    public Ex07() {
        setTitle("계산기 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        // 각 영역에 패널 추가
        contentPane.add(new NorthPanel(), BorderLayout.NORTH);
        contentPane.add(new CenterPanel(), BorderLayout.CENTER);
        contentPane.add(new SouthPanel(), BorderLayout.SOUTH);

        setSize(400, 400);
        setVisible(true);
    }

    // [북쪽 패널]
    class NorthPanel extends JPanel {
        public NorthPanel() {
            // 새로 new JPanel()을 만들지 않고, 'this'(나 자신)를 사용합니다.
            setBackground(Color.LIGHT_GRAY);
            setLayout(new FlowLayout());

            add(new JLabel("수식입력"));
            add(new JTextField(20)); // 길이를 20으로 설정
        }
    }

    // [중앙 패널]
    class CenterPanel extends JPanel {
        public CenterPanel() {
            setLayout(new GridLayout(4, 4, 5, 5)); // (행, 열, 좌우간격, 상하간격)

            String[] arr = {
                    "0", "1", "2", "3",
                    "4", "5", "6", "7",
                    "8", "9", "CE", "계산",
                    "+", "-", "x", "/"
            };

            for (int i = 0; i < arr.length; i++) {
                JButton button = new JButton(arr[i]);

                // --- 맥북 호환 설정 ---
                button.setOpaque(true);
                button.setBorderPainted(false);
                // -------------------

                // 12번째 인덱스(+, -, x, /)부터는 배경색 변경
                if(i >= 12) {
                    button.setBackground(Color.CYAN);
                } else {
                    button.setBackground(Color.WHITE);
                }

                add(button);
            }
        }
    }

    // [남쪽 패널]
    class SouthPanel extends JPanel {
        public SouthPanel() {
            setBackground(Color.YELLOW);
            setLayout(new FlowLayout());

            add(new JLabel("계산 결과"));
            add(new JTextField(20));
        }
    }

    public static void main(String[] args) {
        new Ex07();
    }
}