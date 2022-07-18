package math_tasks;

import java.util.Scanner;

public class Task14 {       //Напишите программу, где пользователь вводит любое целое положительное число.
                             // А программа суммирует все числа от 1 до введенного пользователем числа.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        int b = 0;
        for (int i = 1; i <= a; i++) {
            System.out.println(b += i);
        }
        if (a <= 0) {
            System.out.println("Только положительное число!!!");
        }
    }
}
