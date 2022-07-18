package theSimplestClassesAndObjects.task8;

import java.util.Scanner;

//  8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод  toString().
//  Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. Задать критерии выбора
//  данных и вывести эти данные на консоль. id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//  Найти и вывести: a) список покупателей в алфавитном порядке;
//  b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customers customers = new Customers(1);
        while (true) {
            System.out.println("1. Внести покупателя в базу данных.\n" +
                    "2. Сортировать покупателей по ФИО.\n" +
                    "3. Вывести покупателей по заданным параметрам credit card.\n" +
                    "0. выход.");
            int option = scanner.nextInt();
            if (option == 1) {
                while (true) {
                    System.out.println("Добавить покупателя <y>\n Выход <n>");
                    String choice = scanner.next();
                    if (choice.equals("y")) {
                        customers.addCustomerToDataBase(Customer.getCustomer(scanner));
                    }
                    if (choice.equals("n")) {
                        break;
                    }
                }
                System.out.println(customers);
            }
            if (option == 2) {
                customers.sortByName();
                System.out.println(customers);
            }
            if (option == 3) {
                System.out.print("Введите диапазон № credit card\n От: ");
                String from = scanner.next();
                System.out.print("До: ");
                String to = scanner.next();
                customers.PrintCreditCard(from, to);
            }
            if (option == 0) {
                break;
            }
        }
    }
}
