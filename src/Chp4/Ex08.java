package Chp4;

import java.util.Scanner;

class Phone {
    String name, tel;
    public Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    public String getPhone(String name) {
        String result = "";
        if (this.name.equals(name))
            result = this.tel;

        return result;
    }
}

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("인원수 >> ");
        int n = sc.nextInt();
        sc.nextLine();
        Phone[] p = new Phone[n];

        for (int i = 0; i < n; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈칸 없이 입력) >> ");
            String name = sc.next();
            String tel = sc.next();
            p[i] = new Phone(name, tel);
        }

        System.out.println("저장되었습니다....");

        String nm = "";
        while (true) {
            System.out.print("검색할 이름 >> ");
            nm = sc.next();

            if (nm.equals("그만"))
                break;

            boolean found = false; // 검색 성공 여부를 저장할 플래그
            for (Phone phone : p) {
                // Phone 클래스의 getPhone 메소드 로직을 직접 구현하는 것이 더 직관적임
                if (nm.equals(phone.name)) { // p[i] 객체의 name 필드와 직접 비교
                    System.out.println(nm + "의 번호는 " + phone.tel + "입니다.");
                    found = true;
                    break; // 찾았으니 더 이상 검색할 필요가 없으므로 for문 종료
                }
            }

            // for문을 모두 순회한 후에도 found가 false이면, 없는 것임
            if (!found)
                System.out.println(nm + "이 없습니다.");
        }

        sc.close();
    }
}
