package Chp5;

class Oval implements Shape2 {
    private double a, b;

    public Oval(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void setAB(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw() {
        System.out.println(a + " * " + b + "에 내접하는 타원입니다. ");
    }

    @Override
    public double getArea() {
        return PI * a * b;
    }
}

class Rect2 implements Shape2 {
    private double a, b;

    public Rect2(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void setAB(double a,double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw() {
        System.out.println(a + " * " + b + "크기의 사각형입니다. ");
    }

    @Override
    public double getArea() {
        return a * b;
    }
}

public class Ex14 {
    public static void main(String[] args) {
        Shape2[] list = new Shape2[3];
        list[0] = new Ex13(10);
        list[1] = new Oval(20, 30);
        list[2] = new Rect2(10, 40);

        for (Shape2 shape2 : list) shape2.redraw();
        for (Shape2 shape2 : list) System.out.println("면적은 " + shape2.getArea());

    }
}
