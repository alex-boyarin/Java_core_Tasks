package math_tasks;

import java.util.Scanner;

public class Task4 {   //4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
                         // Поменять местами дробную и целую части числа и вывести полученное значение числа.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        double T = scanner.nextDouble();
        System.out.println(r(T));
    }

    public static double r(double T) {
        return (T * 1000) % 1000 + (int) T / 1000.0;
    }
}
