package Chp6;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        int n, com;
        Scanner sc = new Scanner(System.in);

        // 1. 배열을 사용해 숫자(인덱스)를 문자열로 쉽게 변환
        // 0번 인덱스는 비워두고, 1:가위, 2:바위, 3:보 로 사용
        String[] hands = {"", "가위", "바위", "보"};

        while (true) {
            System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)] >> ");
            n = sc.nextInt();

            // 2. 종료 조건 먼저 체크
            if (n == 4) {
                System.out.println("게임을 종료합니다.");
                break;
            }

            // 잘못된 입력 방지
            if (n < 1 || n > 4) {
                System.out.println("잘못 입력하셨습니다.");
                continue;
            }

            com = (int) (Math.random() * 3 + 1);

            // 3. 무엇을 냈는지 한 번에 출력 (배열 활용)
            System.out.println("철수(" + hands[n] + ") : 컴퓨터(" + hands[com] + ")");

            // 4. 승패 로직
            if (n == com) {
                System.out.println("비겼습니다.");
            } else if ((n == 1 && com == 3) || (n == 2 && com == 1) || (n == 3 && com == 2)) {
                // 가위(1)-보(3), 바위(2)-가위(1), 보(3)-바위(2) -> 이기는 경우
                System.out.println("철수가 이겼습니다.");
            } else {
                // 비기지도 않고, 이기지도 않았으면 진 것임
                System.out.println("컴퓨터가 이겼습니다.");
            }
        }
    }
}