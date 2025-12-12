package Chp11;

import javax.swing.*;
import java.awt.*;

public class Ex02 extends JFrame {
    JComboBox<String> comboBox;
    JTextField textField;

    public Ex02() {
        setTitle("JTextField and JComboBox");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        textField = new JTextField(20);
        comboBox = new JComboBox<>();

        textField.addActionListener(e -> {
           JTextField jTextField = (JTextField) e.getSource();
           String text = jTextField.getText();

           comboBox.addItem(text); // 콤보박스에 추가
           jTextField.setText("");  // 입력 후 텍스트 필드의 내용 지우기
        });

        contentPane.add(textField);
        contentPane.add(comboBox);

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex02();
    }
}
