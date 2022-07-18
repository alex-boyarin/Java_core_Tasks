package arraysOfArrays;
//   8. В числовой матрице поменять местами два столбца любых столбца,
//   т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
//   а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.

import java.util.Scanner;

public class SwapColumn {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number column №1: ");
        int column1 = scanner.nextInt();
        System.out.print("Enter number column №2: ");
        int column2 = scanner.nextInt();
        int temp;
        for (int i = 0; i < array.length; i++) {
            if (column1 > column2) {
                System.out.println(array[i][column1] + "  " + array[i][column2]);
            }
            if (column1 < column2) {
                temp = array[i][column1];
                array[i][column1] = array[i][column2];
                array[i][column2] = temp;
                System.out.println(array[i][column1] + "  " + array[i][column2]);
            }
        }
    }
}
