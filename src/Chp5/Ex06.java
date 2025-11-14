package Chp5;

public class Ex06 extends Point {
    private String color;

    public Ex06() {
        super(0,0);
        this.color = "BLACK";
    }

    public Ex06(int x, int y) {
        super(x, y);
        this.color = "BLACK";
    }

    public void setXY(int x, int y) {
        super.move(x, y);
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color + "색의 (" + this.getX() + "," + this.getY() + ")의 점";
    }

    public static void main(String[] args) {
        Ex06 zeroPoint = new Ex06();
        System.out.println(zeroPoint.toString());

        Ex06 cp = new Ex06(10, 10);
        cp.setXY(5, 5);
        cp.setColor("RED");
        System.out.println(cp.toString() + "입니다.");
    }
}
