package oneDimensionalArray;

import java.util.Arrays;

//  4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
public class ReplacementMinOnMax {
    public static void main(String[] args) {
        int[] array = {2, -7, 4, -6, 10, 7, 3, 12, 1};
        int maxNumber = array[0];
        int minNumber = array[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxNumber < array[i]) {
                maxNumber = array[i];
                maxIndex = i;
            }
            if (minNumber > array[i]) {
                minNumber = array[i];
                minIndex = i;
            }
        }
        swap(array, maxIndex, minIndex);
        System.out.println("Min number: " + minNumber);
        System.out.println("Max number: " + maxNumber);
        System.out.print(Arrays.toString(array));
    }

    public static void swap(int[] array, int minIndex, int maxIndex) {
        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;
    }
}
