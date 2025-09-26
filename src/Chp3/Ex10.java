package Chp3;

// 4x4 배열에 1~10 사이의 정수를 10개 랜덤하게 삽입
// 나머지 6개는 모두 0
public class Ex10 {
    public static void main(String[] args) {
        int[][] nums = new int[4][4]; // 배열은 자동으로 0으로 초기화됩니다.
        int x, y;

        for (int i = 0; i < 10; i++) {
            // 1. 올바른 인덱스 범위(0~3)의 랜덤 좌표 생성
            x = (int)(Math.random() * 4);
            y = (int)(Math.random() * 4);

            // 2. 해당 좌표가 비어있는지(값이 0인지) 확인
            if (nums[x][y] != 0) {
                // 이미 숫자가 있다면 중복이므로 다시 시도
                i--;
            } else {
                // 비어있다면 1~10 사이의 랜덤 정수 삽입
                nums[x][y] = (int)(Math.random() * 10 + 1);
            }
        }

        // 결과 출력을 위한 코드
        for (int[] num : nums) {
            for (int i : num) {
                System.out.print(i + "      "); // \t는 탭 문자로 간격을 맞춤
            }
            System.out.println(); // 한 행이 끝나면 줄바꿈
        }
    }
}