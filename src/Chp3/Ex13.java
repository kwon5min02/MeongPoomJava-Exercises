package Chp3;

// 반복문을 이용하여 369게임에서 박수를 쳐야 하는 경우를 순서대로 출력 (1 ~ 99)
public class Ex13 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) { // 1부터 시작
            int count = 0; // 박수 횟수를 셀 변수
            int ones = i % 10;
            int tens = i / 10;

            // 십의 자리가 3, 6, 9인지 확인
            if (tens != 0 && tens % 3 == 0) {
                count++;
            }
            // 일의 자리가 3, 6, 9인지 확인
            if (ones != 0 && ones % 3 == 0) {
                count++;
            }

            // 박수 횟수가 1번 이상일 때만 출력
            if (count > 0) {
                System.out.print(i + " ");
                for (int j = 0; j < count; j++) {
                    System.out.print("짝");
                }
                System.out.println();
            }
        }
    }
}
