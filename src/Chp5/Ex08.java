package Chp5;

public class Ex08 extends Point {
    public Ex08() {
        super(0, 0);
    }

    public Ex08(int x, int y) {
        super(Math.max(0,x), Math.max(0,y));
    }

    @Override
    public void move(int x, int y) {
        if (x >= 0 && y >= 0) {
            super.move(x, y);
        }
    }

    @Override
    public String toString() {
        return "(" + this.getX() + "," + this.getY() + ")의 점";
    }

    public static void main(String[] args) {
        Ex08 p = new Ex08();
        p.move(10,10);
        System.out.println(p.toString() + "입니다.");

        p.move(-5, 5); // 객체 p는 음수 공간으로 이동되지 않음
        System.out.println(p.toString() + "입니다.");

        Ex08 p2 = new Ex08(-10, -10);
        System.out.println(p2.toString() + "입니다.");
    }
}
