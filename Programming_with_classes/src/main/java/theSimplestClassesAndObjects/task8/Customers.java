package theSimplestClassesAndObjects.task8;

import java.util.Arrays;

public class Customers {
    private Customer[] customers;
    private int arraySize;
    private int registry;


    public Customers(int arraySize) {
        this.arraySize = arraySize;
        this.customers = new Customer[arraySize];
    }

    public int getRegistry() {
        return registry;
    }

    public Customers() {
        this.arraySize = 100;
    }

    public void addCustomerToDataBase(Customer customer) {
        if (registry < arraySize) {
            customers[registry] = customer;
            registry++;
        } else {
            Customer[] customersNew = new Customer[arraySize * 2];
            for (int i = 0; i < registry; ++i) {
                customersNew[i] = customers[i];
            }
            customers = customersNew;
            arraySize = arraySize * 2;
            customers[registry] = customer;
            registry++;
        }
    }

    public void sortByName() {
        Arrays.sort(customers, 0, arraySize, new Customer.ByNameComparator());
    }

    public void PrintCreditCard(String from, String to) {
        for (Customer creditCard : customers) {
            if (creditCard.getNumberCreditCard().compareTo(from) >= 0 && creditCard.getNumberCreditCard().compareTo(to) <= 0) {
                System.out.println(creditCard);
            }
        }
    }

    @Override
    public String toString() {
        return "Customers:\n" + Arrays.toString(customers);
    }
}
