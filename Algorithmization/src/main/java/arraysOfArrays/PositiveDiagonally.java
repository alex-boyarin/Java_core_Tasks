package arraysOfArrays;

//   10. Найти положительные элементы главной диагонали квадратной матрицы.
public class PositiveDiagonally {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, -4, 12},
                {13, 14, 15, 17}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j && array[i][j] > 0) {
                    System.out.print(array[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

