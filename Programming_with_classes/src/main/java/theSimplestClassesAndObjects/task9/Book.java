package theSimplestClassesAndObjects.task9;

import java.io.PrintStream;
import java.util.Scanner;

//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
public class Book {
    private int id;
    private String name;
    private String author;
    private String publishingHouse;
    private int yearOfPublishing;
    private int numberOfPages;
    private int price;
    private String bindingType;

    public Book(int id, String name, String author, String publishingHouse, int yearOfPublishing, String bindingType) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
        this.bindingType = bindingType;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public static Book getBook(Scanner scanner, PrintStream out) {
        out.print("Введите ID: ");
        int id = scanner.nextInt();
        out.print("Введите Название: ");
        String name = scanner.next();
        out.print("Введите Автор: ");
        String author = scanner.next();
        out.print("Введите Издательство: ");
        String publishingHouse = scanner.next();
        out.print("Введите год издания: ");
        int yearOfPublishing = scanner.nextInt();
        out.print("Тип переплета: ");
        String bindingType = scanner.next();
        Book book = new Book(id, name, author, publishingHouse, yearOfPublishing, bindingType);
        out.print("Введите количество страниц: ");
        book.setNumberOfPages(scanner.nextInt());
        out.print("Введите стоимость: ");
        book.setPrice(scanner.nextInt());
        return book;
    }

    @Override
    public String toString() {
        return "Book " +
                " id=" + id +
                ", name=" + name +
                ", author=" + author +
                ", publishingHouse=" + publishingHouse +
                ", yearOfPublishing=" + yearOfPublishing +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
                ", bindingType=" + bindingType + "\n";
    }
}
