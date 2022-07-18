package aggregationAndComposition.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClientBase {
    private List<Client> clients = dataBaseClients();

    public List<Client> getClients() {
        return clients;
    }

    private static List<Client> dataBaseClients() {
        List<Client> dataClient = new ArrayList<>();
        dataClient.add(new Client("Vasya", "Pupkin", 375296666666L));
        dataClient.add(new Client("Petya", "Petrovich", 375296777777L));
        dataClient.add(new Client("Britney", "Spears", 375296888888L));
        dataClient.add(new Client("Brad", "Pitt", 375296333333L));
        dataClient.add(new Client("Bruce", "Willis", 375296444444L));
        return dataClient;
    }


    public Client chooseClient( String surname) {
        return clients.stream()
                .filter(client -> client.getSurname().equals(surname))
                .findFirst().orElseGet(() -> addClient(surname));
    }

    private Client addClient(String surname) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя и телефон");
        String name = scanner.next();
        long phoneNumber = scanner.nextLong();
        Client client = new Client(name, surname, phoneNumber);
        clients.add(client);
        return client;
    }
}
