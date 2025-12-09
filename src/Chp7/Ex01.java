package Chp7;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Ex01 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("정수(-1이 입력될 때까지) >> ");
            int num = sc.nextInt();

            if (num == -1) break; // 반복문 나가기

            v.add(num); // 벡터에 저장
        }

        if (v.isEmpty()) { // 벡터가 비어있는지 확인
            System.out.println("입력된 수가 없습니다.");
        } else {
            System.out.println("가장 큰 수는 " + Collections.max(v));
        }

        sc.close();
    }
}
