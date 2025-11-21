package Chp6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex07 {
    public void useStringTokenizer(Scanner sc) {
        String str;

        System.out.println("-----------StringTokenizer 사용-----------");
        while (true) {
            System.out.print(">> ");
            str = sc.nextLine();

            if (str.equals("exit")) {
                System.out.println("종료합니다.");
                break;
            }

            StringTokenizer st = new StringTokenizer(str, " ");
            System.out.println("어절 개수는 " + st.countTokens());        }

    }
    public void useString(Scanner sc) {
        String str;

        System.out.println("-----------String 사용-----------");
        while (true) {
            System.out.print(">> ");
            str = sc.nextLine();

            if (str.equals("exit")) {
                System.out.println("종료합니다.");
                break;
            }

            str = str.trim(); // 앞뒤 공백 제거

            if(str.isEmpty()) { // 엔터만 쳤을 때 1개가 나오는 것 방지
                System.out.println("어절 개수는 0");
                continue;
            }

            String[] words = str.split("\\s+");
            System.out.println("어절 개수는 " + words.length);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ex07 ex07 = new Ex07();
        ex07.useStringTokenizer(sc);
        ex07.useString(sc);
    }
}
