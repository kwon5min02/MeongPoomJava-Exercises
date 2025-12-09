package Chp7;

import java.util.Scanner;
import java.util.Vector;

class Word {
    String word; // 영어 단어
    String answer; // 한글 뜻

    public Word(String word, String answer) {
        this.word = word;
        this.answer = answer;
    }
}

public class Ex12 {
    Vector<Word> words = new Vector<>();

    public Ex12() {
        // 초기 단어 데이터
        words.add(new Word("love", "사랑"));
        words.add(new Word("animal", "동물"));
        words.add(new Word("emotion", "감정"));
        words.add(new Word("human", "인간"));
        words.add(new Word("stock", "주식"));
        words.add(new Word("trade", "거래"));
        words.add(new Word("society", "사회"));
        words.add(new Word("baby", "아기"));
        words.add(new Word("honey", "꿀"));
        words.add(new Word("doll", "인형"));
        words.add(new Word("bear", "곰"));
        words.add(new Word("picture", "사진"));
        words.add(new Word("painting", "그림"));
        words.add(new Word("fault", "오류"));
        words.add(new Word("example", "보기"));
        words.add(new Word("eye", "눈"));
        words.add(new Word("statue", "조각상"));
    }

    public void run(Scanner sc) {
        System.out.println("**** 영어 단어 테스트 프로그램 \"명품영어\" 입니다. ****");

        while (true) {
            System.out.print("단어테스트:1, 단어삽입:2, 종료:3 >> ");
            try {
                int menu = sc.nextInt();

                switch (menu) {
                    case 1:
                        wordQuiz(sc); // 퀴즈 메서드 호출
                        break;
                    case 2:
                        sc.nextLine();
                        insertWord(sc); // 삽입 메서드 호출
                        break;
                    case 3:
                        System.out.println("게임을 종료합니다.");
                        sc.close();
                        return; // 프로그램 종료
                    default:
                        System.out.println("잘못된 메뉴입니다. 1, 2, 3 중에서 입력하세요.");
                }
            } catch (Exception e) {
                System.out.println("숫자를 입력해주세요.");
                sc.next(); // 버퍼 비우기
            }
            System.out.println(); // 메뉴 구분용 빈 줄
        }
    }

    // [기능 1] 단어 테스트
    public void wordQuiz(Scanner sc) {
        System.out.println("----------- 단어 테스트 시작 (종료: -1) -----------");
        System.out.println("현재 " + words.size() + "개의 단어가 들어 있습니다.");

        // 보기를 만들려면 최소 4단어가 필요함
        if (words.size() < 4) {
            System.out.println("단어 수가 부족합니다. 단어를 더 입력하세요 (최소 4개).");
            return;
        }

        while (true) {
            // 1. 정답 단어 선택
            int answerIndex = (int) (Math.random() * words.size());
            String targetWord = words.get(answerIndex).word;

            // 2. 보기 4개 생성 (인덱스 배열)
            int[] example = new int[4];
            int answerLoc = (int) (Math.random() * 4); // 정답이 들어갈 위치 (0~3)
            example[answerLoc] = answerIndex;

            // 오답 채우기
            for (int i = 0; i < 4; i++) {
                if (i == answerLoc) continue;

                int wrongIndex;
                while (true) {
                    wrongIndex = (int) (Math.random() * words.size());
                    // 정답과 겹치지 않고, 이미 뽑은 오답과도 겹치지 않아야 함
                    if (wrongIndex == answerIndex) continue;

                    boolean isExist = false;
                    for (int j = 0; j < 4; j++) {
                        if (example[j] == wrongIndex) {
                            isExist = true;
                            break;
                        }
                    }
                    if (!isExist) break;
                }
                example[i] = wrongIndex;
            }

            // 3. 문제 출력
            System.out.println(targetWord + "?");
            for (int i = 0; i < 4; i++) {
                System.out.print("(" + (i + 1) + ")" + words.get(example[i]).answer + " ");
            }
            System.out.print(":>> ");

            // 4. 정답 입력
            try {
                int userChoice = sc.nextInt();

                if (userChoice == -1) {
                    System.out.println("단어 테스트를 종료하고 메뉴로 돌아갑니다.");
                    break;
                }

                if (userChoice - 1 == answerLoc)
                    System.out.println("Excellent !!");
                else
                    System.out.println("No. !!");

            } catch (Exception e) {
                System.out.println("숫자를 입력하세요.");
                sc.next(); // 잘못된 입력 처리
            }
            System.out.println("-----------------------------------------------");
        }
    }

    // [기능 2] 단어 삽입
    public void insertWord(Scanner sc) {
        System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
        while(true) {
            System.out.print("영어 한글 입력 >> ");
            String word = sc.nextLine().trim();

            if (word.equals("그만")) return;

            String[] tokens = word.split(" ");
            if (tokens.length < 2)
                System.out.println("잘못된 입력입니다. '영어 뜻' 형식으로 작성하세요");

            words.add(new Word(tokens[0].trim(), tokens[1].trim()));
        }
    }

    public static void main(String[] args) {
        Ex12 ex12 = new Ex12();
        ex12.run(new Scanner(System.in));
    }
}