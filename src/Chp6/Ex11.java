package Chp6;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 보통 맨 위에 둡니다.
        System.out.print(">> ");
        StringBuffer sb = new StringBuffer(sc.nextLine());

        while(true){
            System.out.print("명령: ");
            String str = sc.nextLine();

            if (str.equals("그만")) {
                System.out.println("종료합니다.");
                break;
            }

            // 1. 명령 형식 체크 (split 결과가 2개가 아니면 형식이 틀린 것)
            String[] arr = str.split("!");
            if (arr.length != 2) {
                System.out.println("잘못된 명령입니다!");
                continue; // 다시 입력받으러 위로
            }

            String oldWord = arr[0]; // 찾을 단어
            String newWord = arr[1]; // 바꿀 단어

            // 2. 단어 존재 여부 체크
            // indexOf는 못 찾으면 자동으로 -1을 반환합니다. (에러 아님)
            int index = sb.indexOf(oldWord);

            if (index == -1) {
                System.out.println("찾을 수 없습니다!");
                continue;
            }

            // 3. 안전하게 교체
            sb.replace(index, index + oldWord.length(), newWord);
            System.out.println(sb.toString());
        }
        sc.close();
    }
}