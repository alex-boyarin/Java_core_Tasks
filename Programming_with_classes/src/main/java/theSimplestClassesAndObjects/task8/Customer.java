package theSimplestClassesAndObjects.task8;

import java.util.Comparator;
import java.util.Scanner;

public class Customer {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private String numberCreditCard;
    private String bankAccount;


    public Customer(int id, String surname, String name, String patronymic) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberCreditCard() {
        return numberCreditCard;
    }

    public void setNumberCreditCard(String numberCreditCard) {
        this.numberCreditCard = numberCreditCard;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public static Customer getCustomer(Scanner scanner) {
        System.out.print("Введите ID: ");
        int id = scanner.nextInt();
        System.out.print("Введите Фамилию: ");
        String surname = scanner.next();
        System.out.print("Введите Имя: ");
        String name = scanner.next();
        System.out.print("Введите Отчество: ");
        String patronymic = scanner.next();
        Customer customer = new Customer(id, surname, name, patronymic);
        System.out.print("Введите адрес: ");
        customer.setAddress(scanner.next());
        System.out.print("Введите номер credit card: ");
        customer.setNumberCreditCard(scanner.next());
        System.out.print("Введите банковский счет: ");
        customer.setBankAccount(scanner.next());
        return customer;
    }

    @Override
    public String toString() {
        return "{ id= " + id +
                ", surname= " + surname +
                ", name= " + name +
                ", patronymic= " + patronymic +
                ", address= " + address +
                ", numberCreditCard= " + numberCreditCard +
                ", bankAccount= " + bankAccount +
                '}' + "\n";
    }

    public static class ByNameComparator implements Comparator<Customer> {
        public int compare(Customer customer1, Customer customer2) {
            return customer1.getSurname() != customer2.getSurname() ?
                    customer1.getSurname().compareTo(customer2.getSurname()) :
                    customer1.getName() != customer2.getName() ?
                            customer1.getName().compareTo(customer2.getName()) :
                            customer1.getPatronymic().compareTo(customer2.getPatronymic());
        }
    }
}

