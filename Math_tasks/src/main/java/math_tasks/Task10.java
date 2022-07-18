package math_tasks;

import java.util.Scanner;

public class Task10 {           //Вычислить значение функции: f(x)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число x: ");
        double x = scanner.nextDouble();
        double F;
        if (x <= 3) {
            F = Math.pow(x, 2) - 3 * x + 9;
            System.out.format("%.3f", F);
        } else if (x > 3) {
            F = 1 / (Math.pow(x, 3) + 6);
            System.out.format("%.3f", F);
        }
    }
}
