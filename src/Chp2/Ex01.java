package Chp2;

import java.util.Scanner;

// Scanner 클래스를 이용하여 원화를 입력받아 달러로 바꾸어 출력
public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("달러로 바꾸고 싶은 원화를 입력하시오 : ");
        int won = sc.nextInt(); // 원화 입력

        double dollar = (double)won / 1100; // 달러 변환

        System.out.println(won + "원은 $" + dollar + "입니다.");
        sc.close();
    }
}
