package Chp3;

import java.util.Scanner;

// 정수를 몇 개 저장할지 키보드로부터 개수를 입력받고,
// 1 부터 100까지 범위의 정수를 랜덤하게 삽입
// 같은 수는 없다.
public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 몇개? ");
        int num = sc.nextInt();

        // 입력받은 개수만큼 배열 생성
        int[] nums = new int[num];

        // 배열을 채우는 루프
        for (int i = 0; i < nums.length; i++) {
            // 1. 1~100 사이의 랜덤 정수 생성
            int randomNum = (int)(Math.random() * 100 + 1);

            // 2. 중복 검사를 위한 내부 루프
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (nums[j] == randomNum) { // 이미 배열에 같은 수가 있다면
                    isDuplicate = true;
                    break; // 중복 검사 중단
                }
            }

            // 3. 중복 여부에 따른 처리
            if (isDuplicate) {
                i--; // 중복이 발생했으므로, 현재 인덱스(i)를 다시 시도하도록 i를 1 감소
            } else {
                nums[i] = randomNum; // 중복이 아니면 배열에 숫자 삽입
            }
        }

        // 결과 출력
        int count = 0;
        for (int j : nums) {
            System.out.print(j + " ");
            count++;
            if (count % 10 == 0) {
                System.out.println();
                count = 0;
            }
        }

        sc.close();
    }
}