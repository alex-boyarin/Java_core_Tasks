package aggregationAndComposition.task4;

public class Account {
    private int numberAccount;
    private final String TYPE_ACCOUNT;
    private static final String CURRENCY_TYPE = "BYN";
    private int BalanceMoney;
    private Client client;

    public Account(int numberAccount, String TYPE_ACCOUNT, int amountMoney, Client client) {
        this.TYPE_ACCOUNT = TYPE_ACCOUNT;
        this.numberAccount = numberAccount;
        this.BalanceMoney = amountMoney;
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getTypeAccount() {
        return TYPE_ACCOUNT;
    }


    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getCURRENCY_TYPE() {
        return CURRENCY_TYPE;
    }

    public int getBalanceMoney() {
        return BalanceMoney;
    }

    public void setBalanceMoney(int balanceMoney) {
        this.BalanceMoney = balanceMoney;
    }


    @Override
    public String toString() {
        return " {Client surname-" + client.getSurname() +
                " Account number-" + numberAccount +
                ", Type account-" + TYPE_ACCOUNT +
                ", Currency type-" + CURRENCY_TYPE +
                ", Balance money=" + BalanceMoney + "}\n";
    }
}
