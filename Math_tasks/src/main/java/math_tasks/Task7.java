package math_tasks;

import java.util.Scanner;

public class Task7 {        // Даны два угла треугольника (в градусах). Определить,
                    // существует ли такой треугольник, и если да, то будет ли он прямоугольным.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение a: ");
        int a = scanner.nextInt();
        System.out.print("Введите значение b: ");
        int b = scanner.nextInt();
        int sum = a + b;
        int c = 180 - sum;
        if (a > 0 && a != 90 && b > 0 && b != 90 && sum != 90 && sum < 180) {
            System.out.println("Треугольник существует");
            System.out.println("Угол a:" + a + ", угол b:" + b + ", угол c:" + c);
        } else if (a > 0 && b > 0 && sum < 180 || sum == 90 || c == 90) {
            System.out.println("Прямоугольный треугольник");
            System.out.println("Угол a: " + a + ", угол b: " + b + ", угол c: " + c);
        } else {
            System.out.println("Ошибка ввода!!!");
        }
    }
}
