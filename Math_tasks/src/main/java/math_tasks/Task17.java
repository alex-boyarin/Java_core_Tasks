package math_tasks;

import java.util.Scanner;

public class Task17 {           //Для каждого натурального числа в промежутке от m до n вывести все делители,
                                // кроме единицы и самого числа.m и n вводятся с клавиатуры.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите m: ");
        int m = scanner.nextInt();
        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        for (int x = m; x < n; x++) {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    System.out.println(x + " " + i);
                }
            }
        }
    }
}
