package Chp11;

import javax.swing.*;
import java.awt.*;

public class Ex04 extends JFrame {
    public Ex04() {
        setTitle("Money Changer with CheckBox");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.setBackground(Color.PINK);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel2.setLayout(new GridLayout(8, 3));
        panel1.setOpaque(false);
        panel2.setOpaque(false);

        JLabel money = new JLabel("금액");
        JTextField moneyText = new JTextField(10);
        JButton calc = new JButton("계산");

        JLabel won_50000 = new JLabel("오만원", JLabel.CENTER);
        JTextField won_50000Text = new JTextField();
        JCheckBox won_50000CheckBox = new JCheckBox();
        won_50000CheckBox.setSelected(true);

        JLabel won_10000 = new JLabel("만원", JLabel.CENTER);
        JTextField won_10000Text = new JTextField();
        JCheckBox won_10000CheckBox = new JCheckBox();
        won_10000CheckBox.setSelected(true);

        JLabel won_1000 = new JLabel("천원", JLabel.CENTER);
        JTextField won_1000Text = new JTextField();
        JCheckBox won_1000CheckBox = new JCheckBox();
        won_1000CheckBox.setSelected(true);

        JLabel won_500 = new JLabel("500원", JLabel.CENTER);
        JTextField won_500Text = new JTextField();
        JCheckBox won_500CheckBox = new JCheckBox();
        won_500CheckBox.setSelected(true);

        JLabel won_100 = new JLabel("100원", JLabel.CENTER);
        JTextField won_100Text = new JTextField();
        JCheckBox won_100CheckBox = new JCheckBox();
        won_100CheckBox.setSelected(true);

        JLabel won_50 = new JLabel("50원", JLabel.CENTER);
        JTextField won_50Text = new JTextField();
        JCheckBox won_50CheckBox = new JCheckBox();
        won_50CheckBox.setSelected(true);

        JLabel won_10 = new JLabel("10원", JLabel.CENTER);
        JTextField won_10Text = new JTextField();
        JCheckBox won_10CheckBox = new JCheckBox();
        won_10CheckBox.setSelected(true);

        JLabel won_1 = new JLabel("1원", JLabel.CENTER);
        JTextField won_1Text = new JTextField();

        calc.addActionListener(e -> {
            int won = Integer.parseInt(moneyText.getText());
            won_50000Text.setText("");
            won_10000Text.setText("");
            won_1000Text.setText("");
            won_500Text.setText("");
            won_100Text.setText("");
            won_50Text.setText("");
            won_10Text.setText("");
            won_1Text.setText("");

            if (won_50000CheckBox.isSelected()) {
                won_50000Text.setText(String.valueOf(won/50000));
                won %= 50000;
            }

            if (won_10000CheckBox.isSelected()) {
                won_10000Text.setText(String.valueOf(won/10000));
                won %= 10000;
            }

            if (won_1000CheckBox.isSelected()) {
                won_1000Text.setText(String.valueOf(won/1000));
                won %= 1000;
            }

            if (won_500CheckBox.isSelected()) {
                won_500Text.setText(String.valueOf(won/500));
                won %= 500;
            }

            if (won_100CheckBox.isSelected()) {
                won_100Text.setText(String.valueOf(won/100));
                won %= 100;
            }

            if (won_50CheckBox.isSelected()) {
                won_50Text.setText(String.valueOf(won/50));
                won %= 50;
            }

            if (won_10CheckBox.isSelected()) {
                won_10Text.setText(String.valueOf(won/10));
                won %= 10;
            }

            won_1Text.setText(String.valueOf(won));
        });

        panel1.add(money); panel1.add(moneyText); panel1.add(calc);
        panel2.add(won_50000); panel2.add(won_50000Text); panel2.add(won_50000CheckBox);
        panel2.add(won_10000); panel2.add(won_10000Text); panel2.add(won_10000CheckBox);
        panel2.add(won_1000); panel2.add(won_1000Text);  panel2.add(won_1000CheckBox);
        panel2.add(won_500); panel2.add(won_500Text);   panel2.add(won_500CheckBox);
        panel2.add(won_100); panel2.add(won_100Text);   panel2.add(won_100CheckBox);
        panel2.add(won_50); panel2.add(won_50Text);    panel2.add(won_50CheckBox);
        panel2.add(won_10); panel2.add(won_10Text);    panel2.add(won_10CheckBox);
        panel2.add(won_1); panel2.add(won_1Text);

        contentPane.add(panel1, BorderLayout.NORTH);
        contentPane.add(panel2, BorderLayout.CENTER);

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex04();
    }
}
