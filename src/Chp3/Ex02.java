package Chp3;

// 2차원 배열을 출력
public class Ex02 {
    public static void main(String[] args) {
        int[][] n = {{1}, {1,2,3},{1},{1,2,3,4},{1,2}};
        for (int[] array : n) {
            for (int num : array)
                System.out.print(num + " ");
            System.out.println();
        }
    }
}
