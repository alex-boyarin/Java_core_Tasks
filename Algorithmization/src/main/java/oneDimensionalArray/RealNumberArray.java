package oneDimensionalArray;

import java.util.Scanner;

//      3. Дан массив действительных чисел, размер которого N.
//       Подсчитать, сколько в нем отрицательных, положительных и нулевых значений.
public class RealNumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size array: ");
        int sizeArray = scanner.nextInt();
        System.out.print("Enter numbers: ");
        scanner.useDelimiter("(, )|\n");
        double[] array = new double[sizeArray];
        int positiveNumber = 0;
        int negativeNumber = 0;
        int zero = 0;
        for (int i = 0; i < array.length; i++) {
            double number = scanner.nextDouble();
            array[i] = number;
            if (array[i] > 0) {
                positiveNumber++;
            }
            if (array[i] < 0) {
                negativeNumber++;
            }
            if (array[i] == 0) {
                zero++;
            }
        }
        System.out.println("positiveNumber: " + positiveNumber);
        System.out.println("negativeNumber: " + negativeNumber);
        System.out.println("Zero: " + zero);
    }
}

