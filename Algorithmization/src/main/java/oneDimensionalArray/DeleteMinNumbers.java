package oneDimensionalArray;

import java.util.Arrays;

//      8. Дана последовательность целых чисел а1 ,а2 ,..., аn.
//      Образовать новую последовательность, выбросив из исходной те члены, которые равны min(а1 ,а2 ,..., аn).
public class DeleteMinNumbers {
    public static void main(String[] args) {
        int[] array = {3, 1, 1, 4, 2};
        int min = findMin(array);
        array2(array, min);
    }

    public static void array2(int[] array, int min) {
        int[] array2 = new int[array.length - minCount(array, min)];
        int index2 = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] > min) {
                array2[index2] = array[index];
                index2++;
            }
        }
        System.out.print(Arrays.toString(array2));
    }

    public static int minCount(int[] a, int m) {
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == m) {
                counter++;
            }
        }
        return counter;
    }

    public static int findMin(int[] array) {
        int min = array[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}

