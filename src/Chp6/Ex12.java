package Chp6;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("갬블링 게임에 참여할 선수 숫자 >> ");
        int num = sc.nextInt();
        Person[] person = new Person[num];

        for (int i = 0; i < num; i++) {
            System.out.print((i+1) + "번째 선수 이름 >> ");
            person[i] = new Person(sc.next());
        }

        sc.nextLine(); // 버퍼 비우기

        boolean flag = false;
        while (!flag) {
            for (Person value : person) {
                if (value.gambling(sc)) {
                    flag = true;
                    break;
                }
            }
        }
        sc.close();
    }
}
