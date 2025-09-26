package Chp3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("곱하고자 하는 두 수 입력 >> ");
                int n = sc.nextInt();
                int m = sc.nextInt();

                System.out.print(n + "x" + m + " = " + n * m);
                break;
            } catch (InputMismatchException e) {
                System.out.println("실수는 입력하면 안됩니다.");
                // 잘못된 입력 값을 버퍼에서 비워주는 역할
                sc.nextLine();
                // 루프로 돌아가기
                continue;
            }
        }
    }
}
