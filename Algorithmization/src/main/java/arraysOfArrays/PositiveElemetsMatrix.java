package arraysOfArrays;

//   7. Сформировать квадратную матрицу порядка N по правилу: A[i,j]=sin((i2-j2)/n)
//   и подсчитать количество положительных элементов в ней.
public class PositiveElemetsMatrix {
    public static void main(String[] args) {
        double[][] array = new double[5][5];
        int isPositiveElement = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = Math.sin((Math.sqrt(i) - Math.sqrt(j)) / 5);
                System.out.format("%.3f ", array[i][j]);
                if (array[i][j] > 0) {
                    isPositiveElement++;
                }
            }
            System.out.println();
        }
        System.out.println("Positive elements: " + isPositiveElement);
    }
}
