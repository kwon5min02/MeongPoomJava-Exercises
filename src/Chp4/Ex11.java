package Chp4;

import java.util.Scanner;

class Add {
    int a;
    int b;
    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    int calculate(int a, int b) {
        return a + b;
    }
}

class Sub {
    int a;
    int b;
    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    int calculate(int a, int b) {
        return a - b;
    }
}

class Mul {
    int a;
    int b;
    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    int calculate(int a, int b) {
        return a * b;
    }
}

class Div {
    int a;
    int b;
    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    int calculate(int a, int b) {
        return a / b;
    }
}

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수와 연산자를 입력하시오 >> ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        String exp =  sc.next();

        switch (exp) {
            case "+":
                Add add = new Add();
                add.setValue(a, b);
                System.out.println(add.calculate(add.a, add.b));
                break;
            case "-":
                Sub sub = new Sub();
                sub.setValue(a, b);
                System.out.println(sub.calculate(sub.a, sub.b));
                break;
            case "*":
                Mul mul = new Mul();
                mul.setValue(a, b);
                System.out.println(mul.calculate(mul.a, mul.b));
                break;
            case  "/":
                Div div = new Div();
                div.setValue(a, b);
                System.out.println(div.calculate(div.a, div.b));
                break;
        }
    }
}
