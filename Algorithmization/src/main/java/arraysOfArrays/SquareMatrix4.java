package arraysOfArrays;
//   4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
public class SquareMatrix4 {
    public static void main(String[] args) {
        int[][] arrayMatrix = new int[4][4];
        int number;
        for (int i = 0; i < arrayMatrix.length; i++) {
            if (i % 2 == 0) {
                number = 1;
                for (int x = 0; x < arrayMatrix.length; x++) {
                    arrayMatrix[i][x] = number++;
                    System.out.print(arrayMatrix[i][x] + " ");
                }
                System.out.println("");
            }
            if (i % 2 != 0) {
                int reversNumber = arrayMatrix.length;
                for (int x = arrayMatrix.length - 1; x >= 0; x--) {
                    arrayMatrix[i][x] = reversNumber--;
                    System.out.print(arrayMatrix[i][x] + " ");
                }
                System.out.println("");
            }
        }
    }
}
