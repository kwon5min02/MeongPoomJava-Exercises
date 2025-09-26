package Chp3;

import java.util.Scanner;

// 과목 이름을 입력받아 점수를 출력하는 프로그램 (개선된 버전)
public class Ex14 {
    public static void main(String[] args) {
        String[] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int[] score = {95, 88, 76, 62, 55};

        // 1. Scanner를 반복문 밖에서 한 번만 생성
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("과목이름 >> ");
            String courseName = sc.next();

            if (courseName.equals("그만")) {
                break;
            }

            // 2. 검색 결과를 저장할 boolean 플래그 변수
            boolean isFound = false;
            for (int i = 0; i < course.length; i++) {
                if (course[i].equals(courseName)) {
                    System.out.println(course[i] + "의 점수는 " + score[i]);
                    isFound = true; // 과목을 찾았다고 표시
                    break; // 찾았으니 더 이상 반복할 필요 없음
                }
            }

            // 3. 반복문이 끝난 후, 플래그를 보고 "없는 과목"인지 판단
            if (!isFound) { // isFound가 false이면 (과목을 못 찾았으면)
                System.out.println("없는 과목입니다.");
            }
        }
        sc.close(); // 프로그램이 끝나기 전에 Scanner를 닫아줌
    }
}