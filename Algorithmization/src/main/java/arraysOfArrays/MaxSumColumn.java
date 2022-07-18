package arraysOfArrays;

// 9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
//  Определить, какой столбец содержит максимальную сумму.
public class MaxSumColumn {
    public static void main(String[] args) {
        int[][] array = {
                {41, 9, 21, 6, 58},
                {8, 2, 32, 52, 12},
                {34, 4, 61, 20, 11},
                {22, 7, 1, 100, 40}
        };
        int maxSum = 0;
        int column;
        for (column = 0; column < array[0].length; column++) {
            int string = 1;
            int temp = array[0][column];
            while (string < array.length) {
                temp += array[string][column];
                string++;
            }
            if (temp > maxSum) {
                maxSum = temp;
            }
            System.out.println("Sum element column №" + column + ") " + temp);
        }
        System.out.println("Maximal sum element column " + maxSum);
    }
}
