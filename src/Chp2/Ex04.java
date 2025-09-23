package Chp2;

import java.util.Scanner;

// Scanner 클래스로 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력
public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 3개 입력 >> ");
        // 입력받은 세 정수를 각각 변수에 저장
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int median; // 중간값을 저장할 변수

        // 1. a가 중간값인 경우
        // (b <= a <= c) 이거나 (c <= a <= b)
        if ((b <= a && a <= c) || (c <= a && a <= b)) {
            median = a;
        }
        // 2. b가 중간값인 경우
        // (a <= b <= c) 이거나 (c <= b <= a)
        else if ((a <= b && b <= c) || (c <= b && b <= a)) {
            median = b;
        }
        // 3. a와 b가 중간값이 아니라면, c가 중간값
        else {
            median = c;
        }

        System.out.println("중간값은 " + median);
        sc.close();
    }
}
