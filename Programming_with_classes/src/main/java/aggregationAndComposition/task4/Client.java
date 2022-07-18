package aggregationAndComposition.task4;


import java.util.List;

public class Client {
    private String name;
    private String surname;
    private String numberPassport;
    private List<Account> accounts;

    public Client(String name, String surname, String numberPassport) {
        this.name = name;
        this.surname = surname;
        this.numberPassport = numberPassport;

    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumberPassport() {
        return numberPassport;
    }

    public void setNumberPassport(String numberPassport) {
        this.numberPassport = numberPassport;
    }


    @Override
    public String toString() {
        return "{Client name-" + name +
                ", surname-" + surname +
                ", passport-" + numberPassport + "}\n" + accounts;
    }
}
