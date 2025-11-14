package Chp5;

public class Ex07 extends Point {
    private int z;

    public Ex07(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void moveUp() {
        this.z++;
    }

    public void moveDown() {
        this.z--;
    }

    public void move(int x, int y, int z) {
        super.move(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + this.getX() + "," + this.getY() + "," + this.z + ")의 점";
    }

    public static void main(String[] args) {
        Ex07 p3d = new Ex07(1, 2, 3);
        System.out.println(p3d.toString() + "입니다.");

        p3d.moveUp();
        System.out.println(p3d.toString() + "입니다.");

        p3d.moveDown();
        p3d.move(10, 10);
        System.out.println(p3d.toString() + "입니다.");

        p3d.move(100, 200, 300);
        System.out.println(p3d.toString() + "입니다.");
    }
}
