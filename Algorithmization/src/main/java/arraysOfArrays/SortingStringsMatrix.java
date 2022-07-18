package arraysOfArrays;

//   12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
public class SortingStringsMatrix {
    public static void main(String[] args) {
        int[][] array = {
                {41, 9, 21, 6, 58},
                {8, 2, 32, 52, 12},
                {34, 4, 61, 3, 11},
                {22, 7, 1, 56, 99}
        };
        for (int string = 0; string < array.length; string++) {
            int temp = 0;
            for (int column = 0; column < array[string].length; column++) {
                for (int x = column + 1; x < array[string].length; x++) {
                    if (array[string][column] > array[string][x]) {
                        temp = array[string][x];
                        array[string][x] = array[string][column];
                        array[string][column] = temp;
                    }
                }
                System.out.print(array[string][column] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int string = 0; string < array.length; string++) {
            int temp = 0;
            for (int column = 0; column < array[string].length; column++) {
                for (int x = column + 1; x < array[string].length; x++) {
                    if (array[string][column] < array[string][x]) {
                        temp = array[string][column];
                        array[string][column] = array[string][x];
                        array[string][x] = temp;
                    }
                }
                System.out.print(array[string][column] + " ");
            }
            System.out.println("");
        }
    }
}
