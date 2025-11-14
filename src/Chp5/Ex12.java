package Chp5;

import java.util.Scanner;

abstract class Shape {
    private Shape next; // 다음 노드를 가리키는 포인터
    public Shape() { next = null; }
    public void setNext(Shape obj) { next = obj; } // next 포인터 설정
    public Shape getNext() { return next; }        // next 포인터 반환
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

public class Ex12 {
    public static void main(String[] args) {
        // 'start'는 리스트의 첫 번째 노드(머리)를 가리킵니다.
        Shape start = null;
        // 'last'는 리스트의 마지막 노드(꼬리)를 가리킵니다.
        Shape last = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("그래픽 에디터 beauty를 실행합니다.");

        // 'count'는 리스트에 있는 노드의 총 개수를 저장합니다.
        int count = 0;

        // 메인 메뉴 루프
        while (true) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // 삽입
                    System.out.print("Line(1), Rect(2), Circle(3) >> ");
                    int shapeType = sc.nextInt();

                    Shape newShape = null;
                    switch (shapeType) {
                        case 1:
                            newShape = new Line();
                            break;
                        case 2:
                            newShape = new Rect();
                            break;
                        case 3:
                            newShape = new Circle();
                            break;
                        default:
                            System.out.println("잘못된 도형 타입입니다.");
                            continue; // 메인 메뉴로 복귀
                    }

                    if (start == null) {
                        // 2-1. 리스트가 비어있을 경우 (첫 번째 노드 삽입)
                        start = newShape; // 머리(start)가 새 노드를 가리킴
                        last = newShape;  // 꼬리(last)도 새 노드를 가리킴
                    } else {
                        // 2-2. 리스트에 노드가 있을 경우
                        last.setNext(newShape); // 현재 꼬리(last)가 새 노드를 가리킴
                        last = newShape;        // 꼬리(last) 포인터를 새 노드로 업데이트
                    }
                    count++; // 노드 개수 증가
                    break;

                case 2: // 삭제
                    if (start == null) {
                        System.out.println("삭제할 도형이 없습니다.");
                        break;
                    }

                    System.out.print("삭제할 도형의 위치 (1부터 " + count + "까지) >> ");
                    int index = sc.nextInt();

                    // 인덱스 유효성 검사
                    if (index < 1 || index > count) {
                        System.out.println("잘못된 위치입니다. (1 ~ " + count + " 사이 입력)");
                        break;
                    }

                    // 3-1. 머리(start) 노드를 삭제하는 경우
                    if (index == 1) {
                        start = start.getNext(); // 머리 포인터를 두 번째 노드로 이동
                        // 만약 이것이 마지막 노드였다면, start는 null이 됨
                        if (start == null) {
                            last = null; // 리스트가 비었으므로 꼬리(last)도 null로 설정
                        }
                    }
                    // 3-2. 중간 또는 꼬리 노드를 삭제하는 경우
                    else {
                        Shape prev = start; // 삭제할 노드의 '이전' 노드를 찾기 위한 포인터
                        // 'index - 1' 번째 노드까지 이동 (예: 3번째 삭제 시 2번째 노드까지 이동)
                        for (int i = 1; i < index - 1; i++) {
                            prev = prev.getNext();
                        }

                        // prev는 삭제할 노드(index)의 바로 이전 노드(index-1)가 됨
                        Shape nodeToRemove = prev.getNext(); // 삭제될 노드(index)

                        // (index-1)의 next를 (index+1)로 연결
                        prev.setNext(nodeToRemove.getNext());

                        // 3-3. 꼬리(last) 노드를 삭제했는지 확인
                        if (nodeToRemove == last) {
                            last = prev; // 꼬리 포인터를 (index-1)로 업데이트
                        }
                    }

                    count--; // 노드 개수 감소
                    System.out.println(index + "번째 도형을 삭제했습니다.");
                    break;

                case 3:
                    if (start == null) {
                        System.out.println("출력할 도형이 없습니다.");
                        break;
                    }

                    Shape p = start;
                    System.out.println("--- 모든 도형 보기 ---");
                    while (p != null) {
                        p.draw();
                        p = p.getNext(); // 다음 노드로 이동
                    }
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