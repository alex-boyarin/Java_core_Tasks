package aggregationAndComposition.task4;

import java.util.List;
import java.util.Scanner;

/*4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
*/
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = ConsoleUtil.getBank(scanner, System.out);
        System.out.println(bank);
        while (true) {
            System.out.println("Меню:\n" +
                    "1. Добавить клиента в базу данных.\n" +
                    "2. Добавить счет клиенту.\n" +
                    "3. Сортировка счетов и клиентов.\n" +
                    "4. Поиск счета.\n" +
                    "5. Вычисление общей суммы по счетам.\n" +
                    "6. Вычисление общей суммы по счетам с положительным остатком.\n" +
                    "7. Вычисление общей суммы по счетам с отрицательным остатком.\n" +
                    "0. ВЫХОД.\n");
            int choice = scanner.nextInt();
            if (choice == 1) {
                List<Client> addClient = bank.getClients();
                addClient.add(ConsoleUtil.getClient(scanner, System.out));
                System.out.println(addClient);
            }
            if (choice == 2) {
                System.out.print(("введите фамилию клиента: "));
                String surname = scanner.next();
                bank.addClient(surname);
                System.out.println(bank);
            }
            if (choice == 3) {
                bank.sortClient();
                bank.sortAccounts();
                System.out.println(bank);
            }
            if (choice == 4) {
                System.out.print("Ведите номер счета ");
                int number = scanner.nextInt();
                System.out.println(bank.findAccount(number));
            }
            if (choice == 5) {
                System.out.println("Общая сумма по счетам = " + bank.balanceMoneyCommon() + " BYN");
            }
            if (choice == 6) {
                System.out.println("Общая сумма по счетам положительным остатком = " + bank.balanceMoneyPositive() + " BYN");
            }
            if (choice == 7) {
                System.out.println("Общая сумма по счетам отрицательным остатком = " + bank.balanceMoneyNegative() + " BYN");
            }
            if (choice == 0) {
                break;
            }
        }
    }
}


