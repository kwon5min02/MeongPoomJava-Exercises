package Chp3;

import java.util.Scanner;

// 배열에 정수 10개를 랜덤하게 저장하고, 그 숫자들의 평균을 구해라
public class Ex07 {
    public static void main(String[] args) {
        // 랜덤 정수 생성 및 배열 저장
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++)
            nums[i] = (int)(Math.random()*10 + 1);

        // 생성된 랜덤 정수를 출력
        System.out.print("랜덤한 정수들 : ");
        for (int num : nums)
            System.out.print(num + " ");

        System.out.println();
        int total = 0;
        // 전체 합 계산
        for (int num : nums)
            total += num;
        System.out.println("평균은 " + (double)total/nums.length);
    }
}
