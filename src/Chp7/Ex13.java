package Chp7;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<String> program = new Vector<>(); // 명령어를 저장할 리스트
        HashMap<String, Integer> memory = new HashMap<>(); // 변수(sum, i 등)를 저장할 맵

        System.out.println("슈퍼컴이 작동합니다. 프로그램을 입력해주세요. GO를 입력하면 작동합니다.");

        // 1. 프로그램 입력 단계
        while (true) {
            System.out.print(">> ");
            String line = sc.nextLine().trim();

            if (line.equalsIgnoreCase("go")) break; // go 입력 시 입력 종료 및 실행 시작
            if (line.isEmpty()) continue;

            program.add(line); // 명령어 저장
        }

        // 2. 프로그램 실행 단계
        // pc (Program Counter): 현재 실행 중인 명령어의 인덱스
        for (int pc = 0; pc < program.size(); pc++) {
            String commandLine = program.get(pc);
            String[] tokens = commandLine.split(" "); // 공백으로 쪼개기

            String opcode = tokens[0]; // 명령어 (mov, add 등)
            String arg1 = tokens[1];   // 첫 번째 인자 (변수명)
            String arg2 = tokens[2];   // 두 번째 인자 (값 또는 변수명)

            // arg2가 숫자인지 변수인지 미리 파악하여 값(val2) 준비
            int val2 = 0;
            try {
                val2 = Integer.parseInt(arg2); // 숫자라면 바로 정수로 변환
            } catch (NumberFormatException e) {
                val2 = memory.getOrDefault(arg2, 0); // 문자라면 변수 메모리에서 값 가져오기
            }

            // 명령어 해석 및 실행
            switch (opcode) {
                case "mov": // mov a b : a에 b 값을 대입
                    memory.put(arg1, val2);
                    break;

                case "add": // add a b : a에 b 값을 더함
                    int currentAddVal = memory.getOrDefault(arg1, 0);
                    memory.put(arg1, currentAddVal + val2);
                    break;

                case "sub": // sub a b : a에서 b 값을 뺌
                    int currentSubVal = memory.getOrDefault(arg1, 0);
                    memory.put(arg1, currentSubVal - val2);
                    break;

                case "jn0": // jn0 a b : a가 0이 아니면 b번 줄로 이동
                    // arg1이 변수인지 숫자인지 체크
                    int checkVal = 0;
                    try {
                        checkVal = Integer.parseInt(arg1);
                    } catch (NumberFormatException e) {
                        checkVal = memory.getOrDefault(arg1, 0);
                    }

                    if (checkVal != 0) {
                        // 중요: for문의 증감식(pc++) 때문에 1을 더 빼줘야 다음 턴에 원하는 줄(val2)이 됩니다.
                        pc = val2 - 1;
                    }
                    break;

                case "prt": // prt a b : a 값을 출력하고 종료
                    System.out.println("[prt " + arg1 + " " + arg2 + "]");

                    // 현재 모든 변수 상태 출력
                    for (String key : memory.keySet()) {
                        System.out.print(key.toUpperCase() + ":" + memory.get(key) + "  ");
                    }
                    System.out.println();

                    // 결과 출력
                    System.out.println("출력할 결과는 " + memory.get(arg1) + ". 프로그램 실행 끝");
                    return; // 프로그램 즉시 종료
            }
        }
        sc.close();
    }
}