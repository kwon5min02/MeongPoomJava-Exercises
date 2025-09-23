package Chp2;

import java.util.Scanner;

// 숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을 12,1,2는 겨울, 그 외의 숫자는 잘못입력 출력
public class Ex11 {
    // if문 이용하기
    public static String ifSeason(int number) {
        String season;
        if (number == 1 || number == 2 || number == 12)
            season = "겨울";
        else if (number == 3 || number == 4 || number == 5)
            season = "봄";
        else if (number == 6 || number == 7 || number == 8)
            season = "여름";
        else if (number == 9 || number == 10 || number == 11)
            season = "가을";
        else
            season = "잘못입력";

        return season;
    }

    // switch문 이용하기
    public static String switchSeason(int number) {
        return switch (number) {
            case 12, 1, 2 -> "겨울";
            case 3, 4, 5 -> "봄";
            case 6, 7, 8 -> "여름";
            case 9, 10, 11 -> "가을";
            default -> "잘못입력";
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("달을 입력하세요 >> ");

        int number = sc.nextInt();

        System.out.println(ifSeason(number));
        System.out.println(switchSeason(number));

    }
}
