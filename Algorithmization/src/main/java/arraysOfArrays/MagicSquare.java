package arraysOfArrays;

/*     16. Магическим квадратом порядка n называется квадратная матрица размера nxn,
составленная из чисел 1, 2, 3, ..., так, что суммы по каждому столбцу,
каждой строке и каждой из двух больших диагоналей равны между собой. Построить такой квадрат.*/
public class MagicSquare {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int indexI = 0;
        int count = 0;
        for (int number = 1; number <= 5; number++) {
            for (int i = indexI; i < array.length; i++) {
                for (int j = count; j < array.length; ) {
                    array[i][j] = number;
                    if (count == array.length - 1) {
                        count = 1;
                        break;
                    }
                    if (count == array.length - 2) {
                        count = 0;
                        break;
                    }
                    count += 2;
                    break;
                }
            }
            count++;
        }
        for (int string = 0; string < array.length; string++) {
            for (int column = 0; column < array.length; column++) {
                System.out.print(array[string][column] + " ");
            }
            System.out.println();
        }
    }
}
