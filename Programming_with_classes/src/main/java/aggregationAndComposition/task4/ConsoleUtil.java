package aggregationAndComposition.task4;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleUtil {
    public static Account getAccount(Scanner scanner, PrintStream out, Client client) {
        int numberAccount = randomNumberAccount();
        out.print("Введите тип счета: ");
        String typeAccount = scanner.next();
        out.print("Введите количество валюты: ");
        int amountMoney = scanner.nextInt();
        Account account = new Account(numberAccount, typeAccount, amountMoney,client);
        return account;
    }

    public static int randomNumberAccount() {
        return (int) (Math.random() * 1000001 + 8999990);
    }

    public static Client getClient(Scanner scanner, PrintStream out) {
        out.print("Введите имя: ");
        String name = scanner.next();
        out.print("Введите фамилию: ");
        String surname = scanner.next();
        out.print("Введите номер паспорта: ");
        String numberPassport = scanner.next();
        Client client = new Client(name, surname, numberPassport);
        List<Account> accounts = new ArrayList<>();
        while (true) {
            out.print("Добавить счет <y> <n> ? ");
            String choice = scanner.next();
            if (choice.equals("y")) {
                accounts.add(ConsoleUtil.getAccount(scanner, out, client));
            } else {
                break;
            }
        }
       client.setAccounts(accounts);
        return client;
    }

    public static Bank getBank(Scanner scanner, PrintStream out) {
        out.print("Введите название Банка: ");
        String nameBank = (scanner.next());
        List<Client> clients = new ArrayList<>();
        while (true) {
            out.print("Добавить Клиента <y> <n> ? ");
            String choice = scanner.next();
            if (choice.equals("y")) {
                clients.add(ConsoleUtil.getClient(scanner, out));
            } else {
                break;
            }
        }
        Bank bank = new Bank(nameBank, clients);
        return bank;
    }
}
