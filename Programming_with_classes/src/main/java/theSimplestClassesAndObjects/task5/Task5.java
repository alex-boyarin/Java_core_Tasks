package theSimplestClassesAndObjects.task5;

import java.util.Scanner;

//5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу
// в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
// Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
// Написать код, демонстрирующий все возможности класса.
public class Task5 {
    public static void main(String[] args) {
        DecimalCounter decimalCounter;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Меню:\n" +
                "1. Старт счетчика автоматически\n" +
                "2. Старт счетчика в ручном режиме\n");
        int selection = scanner.nextInt();
        if (selection == 1) {
            decimalCounter = new DecimalCounter();
            System.out.println(decimalCounter);
        } else {
            System.out.print("Введите нижнюю границу счетчика,\n" +
                    "введите верхнюю границу,\n" +
                    "введите число.");
            decimalCounter = new DecimalCounter(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        }
        while (true) {
            decimalCounter.decrementCounter();
            if (decimalCounter.getNumber() == decimalCounter.getBottomLine()) {
                while (decimalCounter.getNumber() != decimalCounter.getUpperLine()) {
                    decimalCounter.counterIncrease();
                    System.out.println(decimalCounter.getNumber());
                }
            }
            if (scanner.nextInt() == 0) {
                break;
            }
            System.out.println(decimalCounter.getNumber());
        }
    }
}
