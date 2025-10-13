package Chp4;

// MonthSchedule에는 생성자, input(), view(), finish(), run() 메서드를 생성

import java.util.Scanner;

class Day {
    private String work;
    public void set(String work) { this.work = work; }
    public String get() { return work; }
    public void show() {
        if (work == null) System.out.println("없습니다.");
        else System.out.println(work + "입니다. ");
    }
}

class MonthSchedule {
    private Scanner sc; // 생성자에서 초기화하도록 변경
    private Day[] days;

    public MonthSchedule(int dayCount) {
        this.sc = new Scanner(System.in);
        this.days = new Day[dayCount];
        for (int i = 0; i < days.length; i++) {
            days[i] = new Day();
        }
    }

    private void input() {
        System.out.print("날짜(1~" + days.length + ") >> ");
        int day = sc.nextInt();
        if (day < 1 || day > days.length) {
            System.out.println("잘못된 날짜입니다.");
            return;
        }
        System.out.print("할일(빈칸없이 입력) >> ");
        sc.nextLine(); // nextInt() 다음에 남은 줄바꿈 문자 제거
        String work = sc.next();
        days[day - 1].set(work);
        System.out.println(); // 가독성을 위한 줄바꿈
    }

    private void view() {
        System.out.print("날짜(1~" + days.length + ") >> ");
        int day = sc.nextInt();
        if (day < 1 || day > days.length) {
            System.out.println("잘못된 날짜입니다.");
            return;
        }
        System.out.print(day + "일의 할 일은 ");
        days[day - 1].show();
        System.out.println(); // 가독성을 위한 줄바꿈
    }

    private void finish() {
        System.out.println("프로그램을 종료합니다.");
        sc.close(); // Scanner 리소스 정리
    }

    public void run() {
        System.out.println("이번달 스케쥴 관리 프로그램.");

        while (true) {
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >> ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    input();
                    break;
                case 2:
                    view();
                    break;
                case 3:
                    finish();
                    return; // run 메소드를 완전히 종료
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}

public class Ex07 {
    public static void main(String[] args) {
        MonthSchedule april = new MonthSchedule(30);
        april.run();
    }
}
