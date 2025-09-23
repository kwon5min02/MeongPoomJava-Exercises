package Chp2;

import java.util.Scanner;

// 직사각형을 구성하는 두 점을 입력받아 (100,100), (200,200)의 직사각형과 충돌하는지 판별
public class Ex08 {
    public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
        return (x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("좌표를 입력하시오. >> ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        if (inRect(x1, y1, 100, 100, 200, 200))
            System.out.println("충돌");
        else if (inRect(x2, y2, 100, 100, 200, 200))
            System.out.println("충돌");
        else if (inRect(x1, y2, 100, 100, 200, 200))
            System.out.println("충돌");
        else if (inRect(x2, y1, 100, 100, 200, 200))
            System.out.println("충돌");

        sc.close();
    }
}
