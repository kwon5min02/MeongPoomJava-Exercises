package Chp4;

// "LG에서 만든 2017년형 32인치 TV"와 같이 출력되도록 TV 클래스를 작성.
class TV {
    String name;
    int year, inch;

    public TV(String name, int year, int inch) {
        this.name = name;
        this.year = year;
        this.inch = inch;
    }

    public void show() {
        System.out.println(this.name + "에서 만든 " + this.year + "년형 " + this.inch + "인치 TV");
    }
}
public class Ex01 {
    public static void main(String[] args) {
        TV myTV = new TV("LG", 2017, 32);
        myTV.show();
    }
}
