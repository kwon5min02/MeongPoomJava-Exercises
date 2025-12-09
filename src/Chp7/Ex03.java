package Chp7;

import java.util.HashMap;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        HashMap<String, Integer> nations = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("나라 이름과 인구를 입력하세요. (예: Korea 5000)");

        // [입력 루프]
        while (true) {
            System.out.print("나라 이름, 인구 >> ");
            String str = sc.nextLine().trim(); // 앞뒤 공백 제거

            if (str.equals("그만")) break;

            // 예외 처리: 입력 형식이 맞는지 확인
            String[] tokens = str.split(" ");
            if (tokens.length < 2) {
                System.out.println("잘못된 입력입니다. '나라 이름 인구' 형식으로 입력해주세요.");
                continue; // 다시 입력 받기
            }

            try {
                String country = tokens[0];
                int population = Integer.parseInt(tokens[1]); // valueOf 대신 parseInt 사용 (기본형 int 반환)
                nations.put(country, population);
            } catch (NumberFormatException e) {
                System.out.println("인구는 숫자로 입력해주세요.");
            }
        }

        // [검색 루프]
        while (true) {
            System.out.print("인구 검색 >> ");
            String str2 = sc.nextLine().trim();

            if (str2.equals("그만")) break;

            Integer population = nations.get(str2);

            if (population == null)
                System.out.println(str2 + "는 없습니다.");
            else
                System.out.println(str2 + "의 인구는 " + population);
        }

        sc.close();
    }
}