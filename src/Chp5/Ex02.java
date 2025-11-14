package Chp5;

public class Ex02 extends Ex01{
    private String addr;

    public Ex02(String addr, int size, int color) {
        super(size, color);
        this.addr = addr;
    }

    @Override
    public void printProperty() {
        System.out.print("나의 IPTV는 " + this.addr + " 주소의 ");
        super.printProperty();
    }

    public static void main(String[] args) {
        Ex02 ex02 = new Ex02("192.1.1.2", 32, 2048);
        ex02.printProperty();
    }
}
