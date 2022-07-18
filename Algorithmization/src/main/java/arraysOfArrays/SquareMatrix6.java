package arraysOfArrays;
//   6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class SquareMatrix6 {
    public static void main(String[] args) {
        int[][] arraySquare = new int[6][6];
        int counter = arraySquare.length - 1;
        int zero = 0;
        int one = 1;
        for (int i = 0; i < arraySquare.length / 2; i++) {
            for (int x = arraySquare.length - 1; x >= 0; x--) {
                if (x > counter) {
                    arraySquare[i][x] = zero;
                    System.out.print(arraySquare[i][x] + " ");
                }
                if (x >= i && x <= counter) {
                    arraySquare[i][x] = one;
                    System.out.print(arraySquare[i][x] + " ");
                }
                if (x < i) {
                    arraySquare[i][x] = zero;
                    System.out.print(arraySquare[i][x] + " ");
                }
            }
            System.out.println("");
            counter--;
        }
        for (int i = arraySquare.length / 2; i < arraySquare.length; i++) {
            for (int x = 0; x < arraySquare.length; x++) {
                if (x < counter) {
                    arraySquare[i][x] = zero;
                    System.out.print(arraySquare[i][x] + " ");
                }
                if (x <= i && x >= counter) {
                    arraySquare[i][x] = one;
                    System.out.print(arraySquare[i][x] + " ");
                }
                if (x > i) {
                    arraySquare[i][x] = zero;
                    System.out.print(arraySquare[i][x] + " ");
                }
            }
            System.out.println("");
            counter--;
        }
    }
}
