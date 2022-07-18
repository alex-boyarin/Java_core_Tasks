package math_tasks;

import java.util.Scanner;

public class Task18 { // Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число b: ");
        int b = scanner.nextInt();
        int remainderA;
        int remainderB;
        int res;
        for (int i = a; i > 0; i /= 10) {
            remainderA =i % 10;
            for (int x = b; x > 0; x /= 10) {
                remainderB = x % 10;
              if  (remainderA == remainderB) {
                    System.out.println("Число присуствует в обоих числах "+ remainderA );
                }

            }
        }
    }

}