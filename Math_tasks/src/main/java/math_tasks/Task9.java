package math_tasks;

import java.util.Scanner;

public class Task9 {        // Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
                        // Определить, пройдет ли кирпич через отверстие.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите a: ");
        int a = scanner.nextInt();
        System.out.print("Введите b: ");
        int b = scanner.nextInt();
        System.out.print("Введите x: ");
        int x = scanner.nextInt();
        System.out.print("Введите y: ");
        int y = scanner.nextInt();
        System.out.print("Введите z: ");
        int z = scanner.nextInt();
        if (a >= x && b >= y || a >= y && b >= x) {
            System.out.println("Кирпич проходит !!!");
        }
        if (a >= x && b >= z || a >= z && b >= x) {
            System.out.println("Кирпич тоже пройдет.");
        }
        if (a >= y && b >= z || a >= z && b >= y) {
            System.out.println("Кирпич опять пройдет.");
        } else {
            System.out.println("А вот теперь не пройдет. ");
        }


    }
}
