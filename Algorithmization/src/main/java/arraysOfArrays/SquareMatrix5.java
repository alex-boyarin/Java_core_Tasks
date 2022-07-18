package arraysOfArrays;
//   5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class SquareMatrix5 {
    public static void main(String[] args) {
        int[][] arraySquare = new int[5][5];
        int number = 1;
        for (int i = 0; i < arraySquare.length; i++) {
            for (int x = arraySquare.length - 1; x >= 0; x--) {
                if (x >= i) {
                    arraySquare[i][x] = number;
                    System.out.print(arraySquare[i][x] + " ");
                }
                if (x < i) {
                    arraySquare[i][x] = 0;
                    System.out.print(arraySquare[i][x] + " ");
                }
            }
            System.out.println("");
            number++;
        }
    }
}
