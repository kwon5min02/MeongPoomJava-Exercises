package Chp3;

import java.util.Scanner;

// 배열과 반복문을 이용하여 지폐 반환 프로그램 작성
public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 입력하시오 >> ");
        int won = sc.nextInt();
        // 개수 셀 변수
        int count;

        // 화폐 단위 배열
        int[] units = {50000, 10000, 1000, 500, 100, 50, 10, 1};

        // 배열을 순회하며 화폐 단위를 하나씩 꺼내옴
        for (int unit : units) {
            // 반복할 때마다 count를 0으로 초기화
            count = 0;
            // 화폐 개수 세기
            while (won >= unit) {
                won -= unit;
                count++;
            }
            System.out.println(unit + "원 짜리 : " + count + "개");
        }

        sc.close();
    }
}
