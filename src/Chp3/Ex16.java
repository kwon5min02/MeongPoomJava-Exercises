package Chp3;

import java.util.Scanner;

// 가위바위보 게임
public class Ex16 {
    public static void main(String[] args) {
        String[] str = {"가위", "바위", "보"};
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

        while (true) {
            System.out.print("가위 바위 보! >> ");
            String rsp = sc.next();
            n = (int) (Math.random() * 3);

            // 루프 탈출
            if (rsp.equals("그만")) {
                System.out.println("게임을 종료합니다...");
                break;
            }

            if (rsp.equals(str[n]))
                System.out.println("사용자 = " + rsp + ", 컴퓨터 = " + str[n] + ", 비겼습니다.");
            else if ((rsp.equals("가위") && n == 2) || (rsp.equals("바위") && n == 0) || (rsp.equals("보") && n == 1))
                System.out.println("사용자 = " + rsp + ", 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
            else
                System.out.println("사용자 = " + rsp + ", 컴퓨터 = " + str[n] + ", 컴퓨터가 이겼습니다.");
        }
    }
}
