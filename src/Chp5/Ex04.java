package Chp5;

public class Ex04 extends Converter{
    public Ex04(double ratio) {
        this.ratio = ratio;
    }

    @Override
    protected double convert(double src) {
        return src/ratio;
    }

    @Override
    protected String getSrcString() {
        return "km";
    }

    @Override
    protected String getDestString() {
        return "mile";
    }

    public static void main(String[] args) {
        Ex04 toMile = new Ex04(1.6);
        toMile.run();
    }
}
