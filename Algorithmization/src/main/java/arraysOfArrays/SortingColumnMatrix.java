package arraysOfArrays;

//   13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
public class SortingColumnMatrix {
    public static void main(String[] args) {
        int[][] array = {
                {41, 9, 21, 6, 58},
                {8, 2, 32, 52, 12},
                {34, 4, 61, 3, 11},
                {22, 7, 1, 56, 99},
        };
        for (int column = 0; column < array[0].length; column++) {
            int temp = 0;
            for (int string = 0; string < array.length; string++) {
                for (int x = string + 1; x < array.length; x++) {
                    if (array[string][column] > array[x][column]) {
                        temp = array[x][column];
                        array[x][column] = array[string][column];
                        array[string][column] = temp;
                    }
                }
                System.out.println(array[string][column] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int column = 0; column < array[0].length; column++) {
            int temp = 0;
            for (int string = 0; string < array.length; string++) {
                for (int x = string + 1; x < array.length; x++) {
                    if (array[string][column] < array[x][column]) {
                        temp = array[string][column];
                        array[string][column] = array[x][column];
                        array[x][column] = temp;
                    }
                }
                System.out.println(array[string][column] + " ");
            }
            System.out.println("");
        }
    }
}
