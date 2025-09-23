package Chp2;

import java.util.Scanner;

// 사칙연산을 입력받아 계산하는 프로그램
public class Ex12 {
    // if문 이용
    public static double ifExp(double a, String exp, double b) {
        double result = 0;
        if (exp.equals("+")) {
            result = a + b;
        } else if (exp.equals("-")) {
            result = a - b;
        } else if (exp.equals("*")) {
            result = a * b;
        } else if (exp.equals("/")) {
            if (b == 0)
                System.out.println("0으로 나눌 수 없다.");
            else
                result = a / b;
        }
        return result;
    }

    // switch문 이용
    public static double switchExp(double a, String exp, double b) {
        double result = 0;
        switch (exp) {
            case "+" -> result = a + b;
            case "-" -> result = a - b;
            case "*" -> result = a * b;
            case "/" -> {
                if (b == 0)
                    System.out.println("0으로 나눌 수 없다.");
                else
                    result = a / b;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연산 >> ");
        double a = sc.nextDouble();
        String exp = sc.next();
        double b = sc.nextDouble();

        System.out.println(ifExp(a, exp, b));
        System.out.println(switchExp(a, exp, b));

    }
}
