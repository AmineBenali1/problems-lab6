package problem2;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String name){
        this.name = name;
    }
    public void addTransaction(Double amount){
        transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
