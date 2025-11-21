package Chp6;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 됩니다. ");
        String str = sc.nextLine();

        for (int i = 1; i <= str.length(); i++) {
            System.out.println( str.substring(i)+ str.substring(0, i));
        }

    }
}
