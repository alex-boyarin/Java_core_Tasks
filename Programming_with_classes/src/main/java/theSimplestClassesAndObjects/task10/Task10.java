package theSimplestClassesAndObjects.task10;

import java.util.Scanner;

//  10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы,
//  set- и get- методы и метод  toString(). Создать второй класс, агрегирующий массив типа Airline,
//  с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//  Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
//  Найти и вывести: a) список рейсов для заданного пункта назначения;
//  b) список рейсов для заданного дня недели;
//  c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Airlines airlines = new Airlines();
        while (true) {
            System.out.println("Выберите опцию:\n" +
                    "1. Добавить данные по направлении полета.\n" +
                    "2. Список рейсов для заданного пункта назначения.\n" +
                    "3. Список рейсов для заданного дня недели.\n" +
                    "4. Список рейсов для заданного дня недели, время вылета для которых больше заданного.\n" +
                    "0. Выход.");
            int option = scanner.nextInt();
            if (option == 1) {
                while (true) {
                    System.out.println("Добавить данные о полете <y>\n Выход <n>");
                    String choice = scanner.next();
                    if (choice.equals("y")) {
                        airlines.addAirlines(Airline.getAirline(scanner, System.out));
                    }
                    if (choice.equals("n")) {
                        break;
                    }
                    System.out.println(airlines);
                }
            }
            if (option == 2) {
                System.out.print("Введите пункт назначения: ");
                String destination = scanner.next();
                System.out.println(airlines.findAirline(SearchCriteria.byDestination(), destination));
            }

            if (option == 3) {
                System.out.print("Введите день недели: ");
                String dayOfTheWeek = scanner.next();
                System.out.println(airlines.findAirline(SearchCriteria.byDayOfTheWeek(), dayOfTheWeek));
            }
            if (option == 4) {
                System.out.print("Введите день недели: ");
                String dayOfTheWeek = scanner.next();
                System.out.print("Введите время после которого производится вылет: ");
                String timeBeforeDeparture = scanner.next();
                for (Airline daysOfTheWeek : airlines.getAirlines()) {
                    if (daysOfTheWeek.getDaysOfTheWeek().equals(dayOfTheWeek) &&
                            daysOfTheWeek.getDepartureTime().compareTo(timeBeforeDeparture) > 0) {
                        System.out.print(daysOfTheWeek);
                    }
                }
            }
            if (option == 0) {
                break;
            }
        }
    }
}
