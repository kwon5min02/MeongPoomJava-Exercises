package Chp4;

// 3과목의 점수를 입력받아 Grade 객체를 생성하고 성적 평균을 출력
// Grade 클래스에 int 타입의 math, science, english 필드를 private로 선언하고, 생성자와 세 과목의 평균을 리턴하는
// average() 메서드를 작성.


import java.util.Scanner;

class Grade {
    private int math, science, english;

    public Grade(int math, int science, int english) {
        this.math = math;
        this.science = science;
        this.english = english;
    }

    public int average() {
        return (this.math + this.science + this.english)/3;
    }

}

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 >> ");
        int math = sc.nextInt();
        int science = sc.nextInt();
        int english = sc.nextInt();
        Grade me = new Grade(math, science, english);
        System.out.println("평균은 " + me.average());

        sc.close();
    }
}
