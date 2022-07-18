package math_tasks;

import java.util.Scanner;

public class Task11 {       // Вычислить значения функции на отрезке [а,b] c шагом h:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите b: ");
        double b = scanner.nextDouble();
        System.out.print("Введите h: ");
        double h = scanner.nextDouble();
        double x = a;
        double y = 0;
        int i = 0;
        double z = 0;
        while (x <= b && b != 0) {
            x = a + i * h;
            if (x > 2) {
                y = x;
                System.out.println(y);
            }
            if (x <= 2) {
                y = -x;
                System.out.println(y);
            } else {

            }
            i++;

        }

    }
}

