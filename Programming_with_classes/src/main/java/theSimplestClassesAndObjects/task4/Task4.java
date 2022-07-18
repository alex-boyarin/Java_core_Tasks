package theSimplestClassesAndObjects.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//  4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//  Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
//  Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//  Добавьте возможность сортировки массив по пункту назначения,
//  причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
public class Task4 {
    public static void main(String[] args) {
        List<Train> trains = new ArrayList<>();
        trains.add(new Train(435, "Moscow", "16:30"));
        trains.add(new Train(999, "Berlin", "17:20"));
        trains.add(new Train(147, "Vilnius", "02:00"));
        trains.add(new Train(999, "Berlin", "08:20"));
        trains.add(new Train(121, "Berlin", "11:45"));
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Выберете пункт меню:\n" +
                    "1. Сортировка по номерам поездов.\n" +
                    "2. Сортировка по времени отправления.\n" +
                    "3. Сортировка по пункту назначения.\n" +
                    "4. Ведите номер поезда.\n" +
                    "5. Выход.\n");
            int selection = scanner.nextInt();
            if (selection == 5) {
                System.out.println("Вы вышли из меню.");
                break;
            }
            if (selection < 1 || selection > 5) {
                System.out.println("Выберите от 1 до 5.");
                continue;
            }
            if (selection == 4) {
                System.out.println("Введите номер поезда: ");
                int number = scanner.nextInt();
                for (Train train : trains) {
                    if (train.getNumberTrain() == number) {
                        System.out.println(train);
                    }
                }
                continue;
            }
            InfoCenter infoCenter = new InfoCenter(selection);
            infoCenter.sortingTrainCollection(trains);
            System.out.println(trains);
        }
    }
}

