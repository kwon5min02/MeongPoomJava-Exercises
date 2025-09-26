package Chp3;

// main 함수 인자 중 정수만 골라 합을 구해라.
public class Ex12 {
    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            try {
                // 1. 문자열을 정수로 변환 시도
                int num = Integer.parseInt(arg);
                // 2. 변환에 성공하면 합계에 더함
                sum += num;
            }
            catch (NumberFormatException e) {
                // 3. 변환에 실패하면(문자열이면) 아무것도 하지 않고 넘어감
                continue;
            }
        }
        // 4. 모든 인자 확인 후 최종 합계 출력
        System.out.println("정수들의 합: " + sum);
    }
}