package arraysOfArrays;

//  15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
public class ReplacElemMatrix {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
        };
        int maxElemMatrix = 0;
        for (int string = 0; string < array.length; string++) {
            for (int column = 0; column < array[0].length; column++) {
                if (array[string][column] > maxElemMatrix) {
                    maxElemMatrix = array[string][column];
                }
            }
        }
        System.out.println("Max element matrix: " + maxElemMatrix);
        for (int string = 0; string < array.length; string++) {
            for (int column = 0; column < array[0].length; column++) {
                if (array[string][column] % 2 != 0) {
                    array[string][column] = maxElemMatrix;
                    System.out.print(array[string][column] + " ");
                } else {
                    System.out.print(array[string][column] + " ");
                }
            }
            System.out.println();
        }
    }
}
