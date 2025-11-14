package Chp5;

import java.util.Scanner;

abstract class Calc {
    int a, b;
    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    abstract int calculate();
}

class Add extends Calc {
    @Override
    int calculate() {
        return a + b;
    }
}

class Sub extends Calc {
    @Override
    int calculate() {
        return a - b;
    }
}

class Mul extends Calc {
    @Override
    int calculate() {
        return a * b;
    }
}

class Div extends Calc {
    @Override
    int calculate() {
        if (b == 0) { // 0으로 나눌 수 없음.
            return 0;
        }
        return a / b;
    }
}

public class Ex11 {
    public static void main(String[] args) {
        // 1. 선언과 동시에 null로 초기화합니다.
        Calc calc = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수와 연산자를 입력하시오 >> ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        String exp = sc.next();

        calc = switch (exp) {
            case "+" -> new Add();
            case "-" -> new Sub();
            case "*" -> new Mul();
            case "/" -> new Div();
            default -> calc;
        };

        // 2. calc가 null이 아닌지 (즉, case 중 하나가 실행되었는지) 확인합니다.
        if (calc != null) {
            calc.setValue(x, y);
            System.out.println(calc.calculate());
        } else {
            System.out.println("잘못된 연산자입니다.");
        }

        sc.close();
    }
}