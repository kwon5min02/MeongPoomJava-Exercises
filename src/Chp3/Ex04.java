package Chp3;

import java.util.Scanner;

// 소문자 알파벳을 하나 입력받고 피라미드 출력
public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("소문자 알파벳 하나를 입력하시오 >> ");
        char s = sc.next().charAt(0);

        // 전체 줄을 제어
        for (char raw = s; raw >= 'a'; raw--) {
            // 각 줄에 출력될 알파벳 제어
            for (char col = 'a'; col <= raw; col++) {
                System.out.print(col);
            }
            // 각 줄마다 줄바꿈
            System.out.println();
        }

        sc.close();
    }
}
