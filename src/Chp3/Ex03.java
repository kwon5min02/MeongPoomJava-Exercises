package Chp3;

import java.util.Scanner;

// 정수를 입력받고 * 피라미드 출력
public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오 >>> ");
        int n = sc.nextInt();

        // 각 줄에 출력할 별의 개수를 제어할 변수
        int m = n;
        // 반복 줄
        for (int i = 0; i < n; i++) {
            // 한 줄에 출력할 별 반복
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            // 한 줄 끝나면 줄바꿈
            System.out.println();
            m--;
        }

        sc.close();
    }
}
