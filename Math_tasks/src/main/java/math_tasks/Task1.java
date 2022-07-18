package math_tasks;

import java.util.Scanner;

public class Task1 {   //1. Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите число b: ");
        double b = scanner.nextDouble();
        System.out.print("Введите число c: ");
        double c = scanner.nextDouble();
        System.out.format("%.3f", result(a, b, c));
    }

    public static double result(Double a, double b, double c) {
        return ((a - 3) * b / 2) + c;
    }
}
