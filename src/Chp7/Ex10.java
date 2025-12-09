package Chp7;

import java.util.Scanner;
import java.util.Vector;

abstract class Shape {
    public abstract void draw();                   // 도형 그리기 (추상 메서드)
}

class Line extends Shape {
    @Override
    public void draw() {
        System.out.println("Line");
    }
}

class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("Rect");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Shape> v = new Vector<>();

        System.out.println("그래픽 에디터 beauty를 실행합니다.");

        // 메인 메뉴 루프
        while (true) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // 삽입
                    System.out.print("Line(1), Rect(2), Circle(3) >> ");
                    int shapeType = sc.nextInt();

                    switch (shapeType) {
                        case 1:
                            v.add(new Line());
                            break;
                        case 2:
                            v.add(new Rect());
                            break;
                        case 3:
                            v.add(new Circle());
                            break;
                        default:
                            System.out.println("잘못된 도형 타입입니다.");
                            continue; // 메인 메뉴로 복귀
                    }

                    break;

                case 2: // 삭제
                    if (v.isEmpty()) {
                        System.out.println("삭제할 도형이 없습니다.");
                        break;
                    }

                    System.out.print("삭제할 도형의 위치 (1부터 " + v.size() + "까지) >> ");
                    int index = sc.nextInt();

                    // 인덱스 유효성 검사
                    if (index < 1 || index > v.size() - 1) {
                        System.out.println("잘못된 위치입니다. (1 ~ " + v.size() + " 사이 입력)");
                        break;
                    }

                    v.remove(index-1);
                    System.out.println(index + "번째 도형을 삭제했습니다.");
                    break;

                case 3:
                    if (v.isEmpty()) {
                        System.out.println("출력할 도형이 없습니다.");
                        break;
                    }

                    System.out.println("--- 모든 도형 보기 ---");
                    for (Shape s : v)
                        s.draw();

                    System.out.println("--------------------");
                    break;

                case 4:
                    System.out.println("beauty를 종료합니다.");
                    sc.close(); // 스캐너 종료
                    return;     // main 메서드 종료 (프로그램 종료)

                default:
                    System.out.println("잘못된 메뉴 번호입니다. (1~4)");
                    break;
            }
        }
    }
}