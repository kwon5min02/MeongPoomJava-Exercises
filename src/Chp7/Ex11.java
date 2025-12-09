package Chp7;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11 {
    HashMap<String, String> map = new HashMap<>();

    void run(Scanner sc) {
        System.out.println("**** 수도 맞추기 게임을 시작합니다 ****");

        while (true) {
            // 입력 메뉴 선택
            System.out.print("입력: 1, 퀴즈: 2, 종료: 3 >> ");
            int menu = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기

            switch (menu) {
                case 1:
                    System.out.println("현재 " + map.size() + "개 나라와 수도가 입력되어 있습니다. ");
                    while (true) {
                        System.out.print("나라와 수도 입력 " + map.size() + ">> ");
                        String str = sc.nextLine().trim();

                        if (str.equals("그만")) break;

                        // [안전 장치] 입력 형식이 맞는지 확인
                        String[] tokens = str.split(" ");
                        if (tokens.length < 2) {
                            System.out.println("잘못된 입력입니다. '나라 수도' 형식으로 입력하세요.");
                            continue;
                        }

                        String country = tokens[0].trim();
                        String capital = tokens[1].trim();

                        if (map.containsKey(country)) {
                            System.out.println(country + "는 이미 있습니다!!");
                        }
                        map.put(country, capital);
                    }
                    break;
                case 2:
                    for (String key : map.keySet()) {
                        System.out.print(key + "의 수도는 ? ");

                        if (map.get(key).equals(sc.next().trim()))
                            System.out.println("정답");
                        else
                            System.out.println("아닙니다.");
                    }
                    break;
                case 3:
                    System.out.println("종료합니다.");
                    sc.close();
                    return;
            }
        }
    }

    public static void main(String[] args) {
        Ex11 ex11 = new Ex11();
        ex11.run(new Scanner(System.in));
    }
}
