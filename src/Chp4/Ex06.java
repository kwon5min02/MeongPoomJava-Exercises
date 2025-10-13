package Chp4;

import java.util.Scanner;

class Circle2 {
    double x, y;
    int radius;

    public Circle2(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void show() {
        System.out.println("(" + x + ", " + y + ")" + " " + radius);
    }
}

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle2[] c = new Circle2[3];

        for (int i = 0; i < c.length; i++) {
            System.out.print("x, y, radius >> ");
            c[i] = new Circle2(sc.nextDouble(), sc.nextDouble(), sc.nextInt());
        }

        int max = 0;
        for (int i = 0; i < c.length; i++)
            if (c[i].radius > c[max].radius)
                max = i;

        System.out.println("가장 면적이 큰 원은 " + "(" + c[max].x + ", " + c[max].y + ")" + " " + c[max].radius);

        sc.close();
    }
}
