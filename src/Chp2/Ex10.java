package Chp2;

import java.util.Scanner;
import static Chp2.Ex09.distance;

// 두 개의 원을 입력받고 두 원이 서로 겹치는지 판단
public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 원의 중심과 반지름 입력 >> ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double r1 = sc.nextDouble();

        System.out.println("두번째 원의 중심과 반지름 입력 >> ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double r2 = sc.nextDouble();

        double dist = distance(x1, y1, x2, y2);

        if (dist <= (r1 + r2))
            System.out.println("두 원은 서로 겹친다.");
        else
            System.out.println("두 원은 서로 겹치지 않는다.");

        sc.close();
    }
}
