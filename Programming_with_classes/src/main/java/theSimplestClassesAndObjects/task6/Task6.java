package theSimplestClassesAndObjects.task6;

import java.util.Scanner;

//  6. Составьте описание класса для представления времени.
//  Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда)
//  с проверкой допустимости вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0.
//  Создать методы изменения времени на заданное количество часов, минут и секунд.
public class Task6 {
    public static void main(String[] args) {
        Time timeAuto;
        Time timeManual;
        int choice;
        String yesNo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("'1' Время по умолчанию\n" +
                "'2' Установка времени в ручном режиме");
        choice = scanner.nextInt();
        if (choice == 1) {
            timeAuto = new Time();
            System.out.print(timeAuto + "\nИзмененить время на заданое количество часов, минут и секунд?\n <y> <n> --: ");
            yesNo = scanner.next();
            if (yesNo.equals("y")) {
                System.out.print("Введите кол-во часов: ");
                timeAuto.addHour(scanner.nextInt());
                System.out.print("Введите кол-во Минут: ");
                timeAuto.addMinute(scanner.nextInt());
                System.out.print("Введите кол-во секунд: ");
                timeAuto.addSeconds(scanner.nextInt());
                System.out.println(timeAuto);
            }
        }
        if (choice == 2) {
            System.out.println("Введите часы, минуты, секунды ");
            timeManual = new Time(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            System.out.print(timeManual + "\nИзмененить время на заданое количество часов, минут и секунд?\n <y> <n> --: ");
            yesNo = scanner.next();
            if (yesNo.equals("y")) {
                System.out.print("Введите кол-во часов: ");
                timeManual.addHour(scanner.nextInt());
                System.out.print("Введите кол-во Минут: ");
                timeManual.addMinute(scanner.nextInt());
                System.out.print("Введите кол-во секунд: ");
                timeManual.addSeconds(scanner.nextInt());
                System.out.println(timeManual);
            }
        }
    }
}
