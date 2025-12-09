package Chp7;

import java.util.HashMap;
import java.util.Scanner;

class Location {
    String city;
    int x;
    int y;

    public Location(String[] location) {
        this.city = location[0].trim();
        this.x = Integer.parseInt(location[1].trim());
        this.y = Integer.parseInt(location[2].trim());
    }

    @Override
    public String toString() {
        return city + "\t" + x + "\t" + y;
    }
}

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Location> map = new HashMap<>();

        System.out.println("도시, 경도, 위도를 입력하세요.");
        for (int i = 0; i < 4; i++) {
            System.out.print(">> ");
            String str = sc.nextLine().trim();
            String[] location = str.split(",");

            if (location.length != 3) {
                System.out.println("입력 형식이 잘못되었습니다. 다시 입력해주세요.");
                i--;
                continue;
            }

            String cityName = location[0].trim();
            map.put(cityName, new Location(location));
        }

        System.out.println("---------------------------------------");
        for (Location location : map.values()){
            System.out.println(location);
        }
        System.out.println("---------------------------------------");

        while (true) {
            System.out.print("도시 이름 >> ");
            String searchCity = sc.next().trim();

            if (searchCity.equals("그만")) break;

            // [핵심] HashMap의 장점: 반복문(for) 없이 key로 바로 찾아냅니다.
            Location result = map.get(searchCity);

            if (result != null) {
                // null이 아니라는 건 맵 안에 있다는 뜻
                System.out.println(result);
                System.out.println("---------------------------------------");
            } else {
                // null이면 없다는 뜻
                System.out.println(searchCity + "는 없는 도시입니다.");
            }
        }

        sc.close();
        System.out.println("프로그램을 종료합니다.");
    }
}