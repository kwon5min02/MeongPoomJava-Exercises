package Chp3;

// 다양한 반복문
// 클래스로 작성하는 대신 메서드로 작성
public class Ex01 {
    public static void whileTest() {
        int sum = 0, i = 0;
        while (i < 100) {
            sum += i;
            i += 2;
        }
        System.out.println(sum);
    }

    public static void forTest() {
        int sum = 0;
        for (int i = 0; i < 100; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void doWhileTest() {
        int sum = 0, i = 0;
        do {
            sum += i;
            i += 2;
        } while (i < 100);
        System.out.println(sum);
    }

    public static void main(String[] args) {
        whileTest();
        forTest();
        doWhileTest();
    }
}
