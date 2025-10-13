package Chp4;

import java.util.Arrays;

class ArrayUtil {
    public static int[] concat(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++)
            result[i] = a[i];
        for (int i = 0; i < b.length; i++) { // b의 길이만큼만 반복
            result[a.length + i] = b[i]; // result의 올바른 위치에 b[i]를 대입
        }
        return result;
    }

    public static void print(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}
public class Ex09 {
    public static void main(String[] args) {
        int[] array1 = {1, 5, 7, 9};
        int[] array2 = {3, 6, -1, 100, 77};
        int[] array3 = ArrayUtil.concat(array1, array2);
        ArrayUtil.print(array3);
    }
}
