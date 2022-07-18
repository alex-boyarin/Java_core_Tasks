package theSimplestClassesAndObjects.task9;

import java.util.Scanner;

//  9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод  toString().
// Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.
// Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
// Найти и вывести: a) список книг заданного автора;
// b) список книг, выпущенных заданным издательством;
// c) список книг, выпущенных после заданного года.
public class Task9 {
    public static void main(String[] args) {
        Books books = new Books();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Сделайте выбор: \n" +
                    "1. Добавить книгу в базу данных.\n" +
                    "2. Список книг заданного автора.\n" +
                    "3. Список книг, выпущенных заданным издательством.\n" +
                    "4. Список книг, выпущенных после заданного года.\n" +
                    "0 Выход.\n");
            int option = (scanner.nextInt());
            if (option == 1) {
                while (true) {
                    System.out.println("Добавить книгу <y>\n Выход <n>");
                    String choice = scanner.next();
                    if (choice.equals("y")) {
                        books.addBooks(Book.getBook(scanner, System.out));
                    }
                    if (choice.equals("n")) {
                        break;
                    }
                    System.out.println(books);
                }
            }
            if (option == 2) {
                System.out.print("Введите Автора книг: ");
                String author = scanner.next();
                System.out.println(books.findBooks(Criteria.byAuthor(), author));
            }
            if (option == 3) {
                System.out.print("Введите издательство: ");
                String publishingHouse = scanner.next();
                System.out.println(books.findBooks(Criteria.byPublishingHouse(), publishingHouse));
            }
            if (option == 4) {
                System.out.print("Введите год издательства после которого нужно вывести книги : ");
                String yearAfterPublication = scanner.next();
                System.out.println(books.findBooks(Criteria.byYearAfterPublication(), yearAfterPublication));
            }
            if (option == 0) {
                break;
            }
        }
    }
}