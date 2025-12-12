package Chp11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Ex10 extends JFrame {

    // 다음에 클릭해야 할 숫자를 저장하는 멤버 변수
    private int nextClickNumber = 0;

    // 레이블들을 저장할 리스트
    private ArrayList<JLabel> labels = new ArrayList<>();

    public Ex10() {
        setTitle("Ten 레이블 클릭");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        // 레이블 생성: 0부터 9까지 10개 생성
        for (int i = 0; i < 10; i++) {
            JLabel l = new JLabel(String.valueOf(i));
            l.setFont(new Font("Arial", Font.BOLD, 18));
            l.setForeground(Color.BLUE); // 색상 설정
            l.addMouseListener(new MyMouseListener());
            contentPane.add(l);
            labels.add(l);
        }

        setSize(400, 400);

        // 초기 레이블 배치
        placeLabelsRandomly();
        setVisible(true);
    }

    private void placeLabelsRandomly() {
        int frameWidth = getWidth() - 50;
        int frameHeight = getHeight() - 80;

        for (JLabel l : labels) {
            // 랜덤 위치 계산
            int x = (int) (Math.random() * frameWidth);
            int y = (int) (Math.random() * frameHeight);

            l.setBounds(x, y, 30, 30);
            l.setVisible(true); // 레이블을 보이게 설정
        }
    }

    class MyMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            JLabel clickedLabel = (JLabel) e.getSource();

            // 클릭된 레이블의 텍스트(숫자)를 정수로 변환
            int clickedNumber = Integer.parseInt(clickedLabel.getText());

            if (clickedNumber == nextClickNumber) {
                // 순서가 맞으면 레이블을 숨기고 다음 순서로 이동
                clickedLabel.setVisible(false);
                nextClickNumber++;


                if (nextClickNumber == 10) {
                    // 다음 게임을 위해 상태 초기화
                    nextClickNumber = 0;
                    // 레이블을 다시 랜덤 위치에 배치하고 보이게 함
                    placeLabelsRandomly();
                }
            }
        }
    }

    public static void main(String[] args) {
        new Ex10();
    }
}