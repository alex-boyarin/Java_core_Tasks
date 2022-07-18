package math_tasks;

import java.util.Scanner;

public class Task3 {    //3. Вычислить значение выражения по формуле (все переменные принимают действительные значения)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число x: ");
        double x = scanner.nextDouble();
        System.out.print("Введите число y: ");
        double y = scanner.nextDouble();
        System.out.format("%.3f", function(x, y));
    }

    public static double function(double x, double y) {
        double result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        return result;
    }
}

