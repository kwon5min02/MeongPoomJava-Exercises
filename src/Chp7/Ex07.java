package Chp7;

import java.util.HashMap;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        System.out.println("미래장학관리시스템입니다.");
        for (int i = 0; i < 5; i++) {
            System.out.print("이름과 학점 >> ");
            String str = sc.nextLine().trim();
            map.put(str.split(" ")[0].trim(), Integer.parseInt(str.split(" ")[1].trim()));
        }

        // 기준 학점 입력받기
        System.out.print("장학생 선발 학점 기준 입력 >> ");
        int standard = sc.nextInt();

        // 장학생 출력
        System.out.print("장학생 명단: ");
        for (String key : map.keySet()) {
            if (map.get(key) >= standard) System.out.print(key + " ");
        }

        sc.close();
    }
}
