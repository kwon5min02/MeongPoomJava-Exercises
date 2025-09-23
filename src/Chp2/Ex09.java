package Chp2;

import java.util.Scanner;

// 원의 중심을 나타내는 한 점과 반지름을 실수 값으로 받고,
// 실수 값으로 다른 점을 입력받아 원 내부에 있는지 판별
public class Ex09 {
    // 두 점 (x, y)와 (x1, y1) 사이의 거리를 구하는 메서드로 수정
    public static double distance(double x, double y, double x1, double y1) {
        return Math.sqrt(Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원의 중심과 반지름 입력 >> ");
        // 중심 좌표는 실수(double)로 받는 것이 더 유연합니다.
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double r = sc.nextDouble();

        System.out.print("점 입력 >> ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        // 두 점 사이의 거리 계산
        // distance 메서드에 원의 중심(x, y)과 점(x1, y1)을 모두 전달
        double dist = distance(x, y, x1, y1);

        // 중심과 점 사이의 거리가 반지름보다 작거나 같으면 원 내부에 있음
        if (dist <= r) {
            System.out.println("점 (" + x1 + ", " + y1 + ")는 원 안에 있다.");
        } else {
            System.out.println("점 (" + x1 + ", " + y1 + ")는 원 안에 없다.");
        }

        sc.close();
    }
}