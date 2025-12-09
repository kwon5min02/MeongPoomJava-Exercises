package Chp7;

import java.util.Scanner;
import java.util.Vector;

public class Ex04 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("강수량 입력 (0 입력 시 종료) >> ");
            int n = sc.nextInt();

            if(n == 0) break;

            v.add(n);

            int sum = 0;

            for (int next : v) {
                System.out.print(next + " ");
                sum += next;
            }
            System.out.println();

            System.out.println("현재 평균 " + (double)sum / v.size());
        }
        sc.close();
    }
}