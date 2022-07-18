package aggregationAndComposition.task4;

import java.util.*;

public class Bank {
    private String nameBank;
    private List<Client> clients;

    public Bank(String nameBank, List<Client> clients) {
        this.nameBank = nameBank;
        this.clients = clients;
    }


    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public void sortClient() {
        clients.sort(Comparator.comparing(Client::getSurname));

    }


    public void sortAccounts() {
        List<Client> sortAccount = getClients();
        for (Client clients : sortAccount) {
            clients.getAccounts().sort(Comparator.comparingInt(Account::getNumberAccount));
        }
    }

    public void addClient(String surname) {
        Scanner scanner = new Scanner(System.in);
        List<Client> addAccount = getClients();
        for (Client client : addAccount) {
            if (client.getSurname().equals(surname)) {
                client.getAccounts().add(ConsoleUtil.getAccount(scanner, System.out, client));
            }
        }
    }

    public Account findAccount(int number) {
        Optional<Account> numberAccount = getClients().stream()
                .flatMap(clients -> clients.getAccounts().stream())
                .filter(account -> account.getNumberAccount() == number).findFirst();
        return numberAccount.get();
    }

    public int balanceMoneyCommon() {
        return getClients().stream()
                .map(Client::getAccounts)
                .flatMap(Collection::stream)
                .map(Account::getBalanceMoney)
                .reduce((sum, currentBalance) -> sum += currentBalance).get();
    }

    public int balanceMoneyPositive() {
        return getClients().stream()
                .map(Client::getAccounts)
                .flatMap(Collection::stream)
                .map(Account::getBalanceMoney)
                .filter(balance -> balance > 0)
                .reduce((sum, currentBalance) -> sum += currentBalance).get();
    }

    public int balanceMoneyNegative() {
        return getClients().stream()
                .map(Client::getAccounts)
                .flatMap(Collection::stream)
                .map(Account::getBalanceMoney)
                .filter(balance -> balance < 0)
                .reduce((sum, currentBalance) -> sum += currentBalance).get();
    }


    @Override
    public String toString() {
        return nameBank + "-Bank\n" + clients + "\n";
    }
}
