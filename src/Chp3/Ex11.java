package Chp3;

// main 함수의 인자를 받아, 정수의 평균을 구하기
public class Ex11 {
    public static void main(String[] args) {
        int sum = 0;

        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }

        System.out.println((double)sum / args.length);
    }
}
