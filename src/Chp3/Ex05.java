package Chp3;

import java.util.Scanner;

// 양의 정수 10개를 입력받아 배열에 저장하고, 3의 배수만 추출
public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수 10개를 입력하시오 >> ");
        // 정수를 저장할 배열 생성
        int[] nums = new int[10];

        // 배열에 정수 저장
        for (int i = 0; i < nums.length; i++)
            nums[i] = sc.nextInt();

        System.out.print("3의 배수는 ");
        for (int num : nums) {
            // 3의 배수 판별
            if (num % 3 == 0)
                System.out.print(num + " ");
        }

        sc.close();
    }
}
