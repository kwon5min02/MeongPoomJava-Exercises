package Chp5;

import java.util.Scanner;

interface Stack {
    int length(); // 현재 스택에 저장된 개수 리턴
    int capacity(); // 스택의 전체 저장 가능한 개수 리턴
    String pop(); // 스택의 top에 저장된 문자 리턴
    void push(String val); // 스택의 top에 문자 저장
}

class MyStack implements Stack {
    String[] str; // 저장할 배열
    int count = 0; // PUSH된 횟수 (다음에 PUSH할 인덱스)

    public MyStack(int i) {
        str = new String[i];
    }

    @Override
    public int length() {
        return count; // PUSH된 개수
    }

    @Override
    public int capacity() {
        return str.length;
    }

    // push를 0번 인덱스부터 차례대로 채우고, pop은 마지막 인덱스부터 읽도록 한다.
    @Override
    public void push(String val) {
        try {
            // 0번 인덱스부터 차례대로 저장
            str[count] = val;
            count++; // 다음 인덱스 준비
        } catch (IndexOutOfBoundsException e) {
            System.out.println("스택이 꽉 차서 푸시 불가!");
        }
    }

    @Override
    public String pop() {
        // 이 문제에서는 pop()이 모든 요소를 출력하길 원하므로
        // LIFO 순서(가장 마지막 인덱스)부터 0번 인덱스까지 역순으로 읽습니다.
        StringBuilder temp = new StringBuilder();

        // count가 3이면(A,B,C PUSH), 인덱스는 0, 1, 2
        // 읽는 순서: 2, 1, 0
        for (int i = count - 1; i >= 0; i--) {
            temp.append(str[i]).append(" ");
        }

        return temp.toString();
    }
}

public class Ex09 {
    public static void main(String[] args) {
        String s = "";
        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        Scanner sc = new Scanner(System.in);
        MyStack stringStack = new MyStack(sc.nextInt());

        // 스택에 push
        int i = 0;
        while (true) {
            System.out.print("문자열 입력 >> ");
            s = sc.next();

            if (s.equals("그만"))
                break;

            stringStack.push(s);
            i++;
        }

        // 스택에 저장된 문자열 출력
        System.out.print("스택에 저장된 모든 문자열 팝 : ");
        System.out.print(stringStack.pop());

    }
}
