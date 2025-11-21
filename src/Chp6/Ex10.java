package Chp6;

import java.util.Scanner;

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public boolean gambling(Scanner sc) {
        int a = (int)(Math.random()*3+1);
        int b = (int)(Math.random()*3+1);
        int c = (int)(Math.random()*3+1);

        System.out.print("[" + name + "] : <Enter>" );
        sc.nextLine();
        System.out.print("\t" + a + "  " + b + "  " + c + "  ");

        if (a == b && a == c) {
            System.out.println(name + "님이 이겼습니다!");
            return true;
        }
        else {
            System.out.println("아쉽군요!");
            return false;
        }
    }
}

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1번째 선수 이름>> ");
        Person p1 = new Person(sc.next());
        System.out.print("2번째 선수 이름>> ");
        Person p2 = new Person(sc.next());

        sc.nextLine(); // 버퍼 비우기

        while (true) {
            if (p1.gambling(sc))
                break;
            if (p2.gambling(sc))
                break;
        }
        sc.close();
    }
}
