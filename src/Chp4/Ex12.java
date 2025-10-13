package Chp4;

import java.util.Scanner;

class ReserveSystem {
    Scanner sc;
    private String[] s = {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"};
    private String[] a = {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"};
    private String[] b = {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"};

    ReserveSystem() {
        this.sc = new Scanner(System.in);
    }

    void reserve() {
        System.out.print("좌석구분 S(1), A(2), B(3) >> ");
        int n = sc.nextInt();

        switch(n) {
            case 1:
                System.out.print("S>> ");
                for (String s : this.s)
                    System.out.print(s + " ");
                System.out.println();
                break;
            case 2:
                System.out.print("A>> ");
                for (String a : this.a)
                    System.out.print(a + " ");
                System.out.println();
                break;
            case 3:
                System.out.print("B>> ");
                for (String b : this.b)
                    System.out.print(b + " ");
                System.out.println();
                break;
        }

        System.out.print("이름>> ");
        String name = sc.next();
        System.out.print("번호>> ");
        int num = sc.nextInt();

        try {
            switch(n) {
                case 1:
                    if(s[num-1].equals("---"))
                        s[num-1] = name;
                    else System.out.println("이미 예약된 좌석입니다.");
                    break;
                case 2:
                    if(a[num-1].equals("---"))
                        a[num-1] = name;
                    else System.out.println("이미 예약된 좌석입니다.");
                    break;
                case 3:
                    if(b[num-1].equals("---"))
                        b[num-1] = name;
                    else System.out.println("이미 예약된 좌석입니다.");
                    break;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("없는 좌석입니다.");
        }

    }

    void view() {
        System.out.print("S>> ");
        for (String s : this.s)
            System.out.print(s + " ");
        System.out.println();

        System.out.print("A>> ");
        for (String a : this.a)
            System.out.print(a + " ");
        System.out.println();

        System.out.print("B>> ");
        for (String b : this.b)
            System.out.print(b + " ");
        System.out.println();
        System.out.println("<<<조회를 완료하였습니다.>>>");
    }

    void cancel() {
        System.out.print("좌석구분 S(1), A(2), B(3) >> ");
        int n = sc.nextInt();

        switch(n) {
            case 1:
                System.out.print("S>> ");
                for (String s : this.s)
                    System.out.print(s + " ");
                System.out.println();
                break;
            case 2:
                System.out.print("A>> ");
                for (String a : this.a)
                    System.out.print(a + " ");
                System.out.println();
                break;
            case 3:
                System.out.print("B>> ");
                for (String b : this.b)
                    System.out.print(b + " ");
                System.out.println();
                break;
        }

        System.out.print("이름>> ");
        String name = sc.next();

        switch(n) {
            case 1:
                for (int i = 0; i < this.s.length; i++)
                    if(this.s[i].equals(name))
                        s[i] = "---";
                break;
            case 2:
                for (int i = 0; i < this.a.length; i++)
                    if(this.a[i].equals(name))
                        a[i] = "---";
                break;
            case 3:
                for (int i = 0; i < this.b.length; i++)
                    if(this.b[i].equals(name))
                        b[i] = "---";
                break;
            default:
                System.out.println("없는 이름입니다.");
        }
    }

    void finish() {
        System.out.println("프로그램을 종료합니다.");
        sc.close();
    }

    void run() {
        System.out.println("명품 콘서트홀 예약 시스템입니다.");

        while (true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
            int n = sc.nextInt();

            switch(n) {
                case 1:
                    reserve();
                    break;
                case 2:
                    view();
                    break;
                case 3:
                    cancel();
                    break;
                case 4:
                    finish();
                    return;
                default:
                    System.out.println("잘못입력하셨습니다.");
            }
        }

    }
}


public class Ex12 {
    public static void main(String[] args) {
        ReserveSystem reserve = new ReserveSystem();
        reserve.run();
    }
}
