package oneDimensionalArray;

import java.util.Scanner;

//      1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
public class SumElementArrayMultiplesK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size array: ");
        int size = scanner.nextInt();
        System.out.print("Enter number: ");
        scanner.useDelimiter("(, )|\n");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            int number = scanner.nextInt();
            array[i] = number;
        }
        System.out.print("Enter divider: ");
        int divider = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % divider == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}