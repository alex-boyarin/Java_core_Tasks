package math_tasks;

import java.util.Scanner;

public class Task8 {   //  Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Задать x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Задать y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Задать x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Задать y2: ");
        double y2 = scanner.nextDouble();
        System.out.print("Задать x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Задать y3: ");
        double y3 = scanner.nextDouble();
        double res1 = (y2 - y1) * (x3 - x1);
        double res2 = (y3 - y1) * (x2 - x1);
        if (res1 == res2) {
            System.out.println("Точки будут расположены на одной прямой");
        } else {
            System.out.println("Точки НЕ расположены на одной прямой ");
        }
    }
}
