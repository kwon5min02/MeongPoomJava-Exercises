package Chp2;

import java.util.Scanner;

// Scanner를 이용하여 정수 3개를 입력받고 삼각형이 되는지 판별
public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 3개를 입력하시오 >> ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 두변의 합이 다른 한 변보다 커야 함
        if (a + b > c && a + c > b && b + c > a)
            System.out.println("삼각형이 됩니다.");
        else
            System.out.println("불가능");

        sc.close();
    }
}
