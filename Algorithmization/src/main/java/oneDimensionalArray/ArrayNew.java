package oneDimensionalArray;
//  10. Дан целочисленный массив с количеством элементов п.
//   Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).

import java.util.Arrays;

public class ArrayNew {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }
        System.out.print(Arrays.toString(array));
    }
}
