package Chp2;

import java.util.Scanner;

// 1 ~ 99까지의 정수를 입력받고
// 3, 6, 9 중 하나가 있는 경우는 박수짝
// 두 개 있는 경우는 박수짝짝 출력
public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1~99 사이의 정수를 입력하시오 >> ");

        int num = sc.nextInt();
        int num10 = num / 10;
        int num1 = num % 10;

        // 십의 자리 비교
        if (num10 == 3 || num10 == 6 || num10 == 9) {
            // 일의 자리 비교
            if (num1 == 3 || num1 == 6 || num1 == 9) {
                System.out.println("박수짝짝");
            } else {
                System.out.println("박수짝");
            }
        } else if (num1 == 3 || num1 == 6 || num1 == 9) {
            // 십의 자리는 위에서 3, 6, 9가 아니여야 여기로 올 수 있기에...
            System.out.println("박수짝");
        }

        sc.close();
    }
}
