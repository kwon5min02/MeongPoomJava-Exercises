package Chp4;

import java.util.Scanner;

class Circle {
    private double x, y;
    private int radius;

    public Circle(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void show() {
        System.out.println("(" + x + ", " + y + ")" + " " + radius);
    }
}

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle[] c = new Circle[3];

        for (int i = 0; i < c.length; i++) {
            System.out.print("x, y, radius >> ");
            c[i] = new Circle(sc.nextDouble(), sc.nextDouble(), sc.nextInt());
        }

        for (Circle circle : c)
            circle.show();

        sc.close();
    }
}
