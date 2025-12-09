package Chp7;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        double sum = 0;

        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> ");
        String str = sc.nextLine();
        String[] arr = str.split(" ");

        for (String s : arr) {
            list.add(s.charAt(0));
        }

        if (list.isEmpty()) {
            System.out.println("학점을 입력해주세요.");
        } else {
            for (char ch : list) {
                switch (ch) {
                    case 'A':
                        sum += 4.0;
                        break;
                    case 'B':
                        sum += 3.0;
                        break;
                    case 'C':
                        sum += 2.0;
                        break;
                    case 'D':
                        sum += 1.0;
                        break;
                    case 'F':
                        sum += 0.0;
                        break;
                }
            }
            System.out.println("평균은 " + sum/list.size());
        }
        sc.close();
    }
}
