package Chp3;

// 4 X 4 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 저장
public class Ex09 {
    public static void main(String[] args) {
        int[][] nums = new int[4][4];

        for (int i = 0; i < nums.length; i++)
            for (int j = 0; j < nums[i].length; j++)
                nums[i][j] = (int)(Math.random()*10 + 1);

        for (int[] num : nums) {
            for (int a : num) {
                System.out.print(a + "      ");
            }
            System.out.println();
        }
    }
}
