package Chp7;

import java.util.HashMap;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 이름(String)과 포인트(Integer) 저장
        HashMap<String, Integer> map = new HashMap<>();

        System.out.println("** 포인트 관리 프로그램입니다 **");

        while (true) {
            System.out.print("이름과 포인트 입력 >> ");
            String str = sc.nextLine().trim();

            if (str.equals("그만")) break;

            // [안전 장치] 입력 형식이 맞는지 확인
            String[] tokens = str.split(" ");
            if (tokens.length < 2) {
                System.out.println("잘못된 입력입니다. '이름 점수' 형식으로 입력하세요.");
                continue;
            }

            String name = tokens[0].trim();

            try {
                int point = Integer.parseInt(tokens[1].trim());

                // "name의 점수를 가져와라. 없으면 0점으로 쳐라. 그 값에 point를 더해서 다시 넣어라."
                map.put(name, map.getOrDefault(name, 0) + point);

                // 현재 현황 출력
                for (String key : map.keySet()) {
                    System.out.print("(" + key + ", " + map.get(key) + ") ");
                }
                System.out.println();

            } catch (NumberFormatException e) {
                System.out.println("포인트는 숫자로 입력해주세요.");
            }
        }
        sc.close();
        System.out.println("프로그램을 종료합니다.");
    }
}