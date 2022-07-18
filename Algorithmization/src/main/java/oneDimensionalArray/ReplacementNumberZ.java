package oneDimensionalArray;

import java.util.Scanner;

//      2. Дана последовательность действительных чисел а1, а2, ..., ап.
//      Заменить все ее члены, большие данного Z, этим числом.Подсчитать количество замен.
public class ReplacementNumberZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size array: ");
        int sizeArray = scanner.nextInt();
        int[] array = new int[sizeArray];
        System.out.print("Enter valid numbers: ");
        int validNumbers = scanner.nextInt();
        System.out.print("Enter Z: ");
        int z = scanner.nextInt();
        int sumReplacements = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = validNumbers;
            if (z < validNumbers) {
                validNumbers = z;
                sumReplacements++;
            }
            System.out.println(validNumbers);
            validNumbers++;
        }
        System.out.print("Number of replacements: " + sumReplacements);
    }
}