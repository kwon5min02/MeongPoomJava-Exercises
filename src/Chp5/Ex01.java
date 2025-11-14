package Chp5;

class TV {
    private int size;
    public TV(int size) {
        this.size = size;
    }
    protected int getSize() {
        return size;
    }
}

public class Ex01 extends TV {
    private int color;
    public Ex01(int size, int color) {
        super(size);
        this.color = color;
    }

    protected void printProperty() {
        System.out.println(this.getSize() + "인치 " + this.color + "컬러");
    }

    public static void main(String[] args) {
        Ex01 ex01 = new Ex01(32, 1024);
        ex01.printProperty();
    }
}
