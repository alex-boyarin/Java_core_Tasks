package arraysOfArrays;

//   1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
public class MatrixColumn {
    public static void main(String[] args) {
        int[][] array = {
                {10, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j += 2) {
                if (array[0][j] > array[2][j]) {
                    System.out.print(array[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }
}
