package Chp2;

import java.util.Scanner;

// Scanner 클래스를 이용하여 2자리의 정수를 입력받고, 십의 자리와 일의 자리가 같은지 판단
public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("2자리 정수 입력(10~99) >>> ");

        int num = sc.nextInt();

        int num10 = num / 10; // 10의 자리 추출
        int num1 = num % 10; // 1의 자리 추출

        if (num10 == num1) {
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다. ");
        } else {
            System.out.println("No! 10의 자리와 1의 자리가 다릅니다. ");
        }
        sc.close();

    }
}
