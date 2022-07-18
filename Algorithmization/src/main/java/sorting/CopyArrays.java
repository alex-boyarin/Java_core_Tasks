package sorting;

import java.util.Arrays;

//  1. Заданы два одномерных массива с различным количеством элементов и натуральное число k.
//  Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
//  при этом не используя дополнительный массив.
public class CopyArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = {10, 11, 12, 13, 14, 15, 16};
        int k = 4;
        int[] arraySum = new int[array1.length + array2.length];
        for (int i = 0; i < arraySum.length; i++) {
            if (i < k) {
                System.arraycopy(array1, 0, arraySum, 0, k);
            }
            if (i == k) {
                System.arraycopy(array2, 0, arraySum, k, array2.length);
            }
            if (i == k + array2.length) {
                System.arraycopy(array1, k, arraySum, i, array1.length - k);
            }
        }
        System.out.println(Arrays.toString(arraySum));
    }
}
