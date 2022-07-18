package math_tasks;

import java.util.Scanner;

public class Task2 {  //  2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите число b: ");
        double b = scanner.nextDouble();
        System.out.print("Введите число c: ");
        double c = scanner.nextDouble();
        System.out.format("%.3f", function1(a, b, c) + 5);
    }

    public static double function1(double a, double b, double c) {

        return ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c))) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);

    }
}
