package math_tasks;

import java.util.Scanner;

public class Task15 {            //Найти max{min(a, b), min(c, d)}.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите a: ");
        int a = scanner.nextInt();
        System.out.print("Введите b: ");
        int b = scanner.nextInt();
        System.out.print("Введите с: ");
        int c = scanner.nextInt();
        System.out.print("Введите d: ");
        int d = scanner.nextInt();
        int res = Math.max(Math.min(a, b), Math.min(c, d));
        System.out.println("Максимум" + res);
    }
}

