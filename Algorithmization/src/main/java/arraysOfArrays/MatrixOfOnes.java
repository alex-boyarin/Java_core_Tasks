package arraysOfArrays;

import java.util.Scanner;

//   14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
//      причем в каждом столбце число единиц равно номеру столбца.
public class MatrixOfOnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter quantity arrays: ");
        int array = scanner.nextInt();
        System.out.print("Please enter quantity column: ");
        int column = scanner.nextInt();
        System.out.println();
        int[][] matrix = new int[array][column];
        int number = 2;
        System.out.println("Matrix random numbers: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int x = 0; x < matrix[0].length; x++) {
                int mix = rnd(number);
                matrix[i][x] = mix;
                System.out.print(matrix[i][x] + " ");
            }
            System.out.println();
        }
        int one = 1;
        System.out.println("Matrix sorting numbers: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int x = 0; x < matrix[0].length; x++) {
                if (x > i) {
                    matrix[i][x] = one;
                    System.out.print(matrix[i][x] + " ");
                } else {
                    matrix[i][x] = 0;
                    System.out.print(matrix[i][x] + " ");
                }
            }
            System.out.println();
        }

    }

    public static int rnd(int number) {
        return (int) (Math.random() * number);
    }
}
