package arraysOfArrays;
//      3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
public class PrintColumnStringMatrix {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int string = 2;
        int column = 2;
        for (int i = 0; i < 3; i++) {
            System.out.print(array[string - 1][i] + " ");
        }
        System.out.println("-строка");

        System.out.println("столбец:");
        for (int j = 0; j < 3; j++) {
            System.out.println(array[j][column - 1] + " ");
        }

    }
}
