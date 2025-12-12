package Chp11;

import javax.swing.*;
import java.awt.*;

public class Ex01 extends JFrame {
    JCheckBox checkBox1 = new JCheckBox("버튼 비활성화");
    JCheckBox checkBox2 = new JCheckBox("버튼 감추기");
    JButton btn = new JButton("test Button");

    public Ex01() {
        setTitle("CheckBox Practice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        // 1. 버튼 비활성화 (setEnabled) 로직
        checkBox1.addActionListener(e -> {
            // isSelected()가 true이면(!를 붙여) 버튼은 false(비활성화)가 됩니다.
            btn.setEnabled(!checkBox1.isSelected());
        });

        // 2. 버튼 감추기 (setVisible) 로직
        checkBox2.addActionListener(e -> {
            // isSelected()가 true이면(!를 붙여) 버튼은 false(숨기기)가 됩니다.
            btn.setVisible(!checkBox2.isSelected());
        });

        contentPane.add(checkBox1);
        contentPane.add(checkBox2);
        contentPane.add(btn);

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex01();
    }
}
