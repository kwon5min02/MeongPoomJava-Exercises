package Chp2;

import java.util.Scanner;

// Scanner 클래스를 이용하여 정수로 된 돈의 액수를 입력받아 각 지폐, 동전으로 변환
public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 입력하시오 >> ");
        int num = sc.nextInt();

        int num_50000 = num / 50000;
        int num_10000 = num % 50000 / 10000;
        int num_1000 = num % 50000 % 10000 / 1000;
        int num_500 = num % 50000 % 10000 % 1000 / 500;
        int num_100 = num % 50000 % 10000 % 1000 % 500 / 100;
        int num_50 = num % 50000 % 10000 % 1000 % 500 % 100 / 50;
        int num_10 = num % 50000 % 10000 % 1000 % 500 % 100 % 50 / 10;
        int num_1 = num % 50000 % 10000 % 1000 % 500 % 100 % 50 % 10;

        System.out.println("오만원권 " + num_50000);
        System.out.println("만원권 " + num_10000);
        System.out.println("천원권 " + num_1000);
        System.out.println("오백원권 " + num_500);
        System.out.println("백원권 " + num_100);
        System.out.println("오십원권 " + num_50);
        System.out.println("십원권 " + num_10);
        System.out.println("일원권 " + num_1);

        sc.close();
    }
}
