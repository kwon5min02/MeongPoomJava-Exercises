package Chp7;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    String department;
    int stdId;
    double scoreAvg;

    public Student(String[] studentArray) {
        // 사용자가 "이름, 학과" 대신 "이름,학과" 혹은 " 이름 , 학과 "로 쳐도 되게끔 처리
        this.name = studentArray[0].trim();
        this.department = studentArray[1].trim();
        this.stdId = Integer.parseInt(studentArray[2].trim());
        this.scoreAvg = Double.parseDouble(studentArray[3].trim());
    }

    @Override
    public String toString() {
        return "이름: " + name +
                "\n학과: " + department +
                "\n학번: " + stdId +
                "\n학점평균: " + scoreAvg;
    }
}

public class Ex05 {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("학생 이름, 학과, 학번, 학점평균을 쉼표(,)로 구분하여 입력하세요.");

        for (int i = 0; i < 4; i++) {
            System.out.print(">> ");
            String str = sc.nextLine();

            String[] studentArray = str.split(",");

            // 입력값 개수 체크 (예외 방지)
            if (studentArray.length != 4) {
                System.out.println("입력 형식이 잘못되었습니다. 다시 입력해주세요.");
                i--; // 이번 순서는 무효 처리하고 다시 입력받기 위해 i 감소
                continue;
            }

            studentArrayList.add(new Student(studentArray));
        }

        System.out.println("---------------------------------------");
        // 입력된 모든 학생 출력
        for (Student student : studentArrayList) {
            System.out.println(student);
            System.out.println("---------------------------------------");
        }

        // [검색 로직 수정]
        while (true) {
            System.out.print("학생 이름 >> ");
            String searchName = sc.next().trim(); // next()로 받아도 trim() 해주는 게 안전

            if (searchName.equals("그만")) break;

            boolean isFound = false; // [핵심] 찾았는지 여부를 체크하는 깃발 변수

            for (Student student : studentArrayList) {
                if (searchName.equals(student.name)) {
                    System.out.println(student);
                    System.out.println("---------------------------------------");
                    isFound = true; // 찾았음 표시
                    break; // 이미 찾았으니 반복문 중단
                }
            }

            // 전체를 다 뒤져봤는데 isFound가 여전히 false라면
            if (!isFound) {
                System.out.println("없는 학생입니다.");
            }
        }

        sc.close();
        System.out.println("프로그램을 종료합니다.");
    }
}