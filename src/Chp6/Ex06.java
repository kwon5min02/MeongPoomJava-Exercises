package Chp6;

import java.util.Calendar;
import java.util.Scanner;

class Game {
    String name;
    int result; // 걸린 시간(초)

    public void TenGame(Scanner sc) {
        System.out.println("=== " + "10초 맞추기 게임 시작" + " ===");

        System.out.print("이름을 입력하세요 >> ");
        name = sc.next();

        // 버퍼 비우기 (엔터 처리)
        sc.nextLine();

        System.out.print(name + " 시작 <Enter> >> ");
        sc.nextLine();

        Calendar startCal = Calendar.getInstance();
        int startSec = startCal.get(Calendar.SECOND);
        System.out.println("\t[현재 초 : " + startSec + "]");

        System.out.print("10초 예상 후 <Enter> >> ");
        sc.nextLine();

        Calendar endCal = Calendar.getInstance();
        int endSec = endCal.get(Calendar.SECOND);
        System.out.println("\t[현재 초 : " + endSec + "]");

        result = endSec - startSec;
        if (result < 0) {
            result += 60;
        }

        System.out.println(name + "님의 기록: " + result + "초");
        System.out.println();
    }
}

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Game hwang = new Game();
        hwang.TenGame(sc); // 스캐너 전달

        Game lee = new Game();
        lee.TenGame(sc);   // 스캐너 전달

        // 10초와의 차이(절대값)를 구합니다.
        int hwangDiff = Math.abs(hwang.result - 10);
        int leeDiff = Math.abs(lee.result - 10);

        System.out.println("----------결과------------");
        System.out.println(hwang.name + "의 오차 : " + hwangDiff);
        System.out.println(lee.name + "의 오차 : " + leeDiff);

        if (hwangDiff < leeDiff) {
            System.out.println("승자는 " + hwang.name);
        } else if (hwangDiff > leeDiff) {
            System.out.println("승자는 " + lee.name);
        } else {
            System.out.println("무승부");
        }

        sc.close();
    }
}