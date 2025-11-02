package problem2;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String name){
        this.name = name;
    }
    public void addCustomer(Customer customer){
        // customers can have same name, so check if it is the same object not just name's equality
        if(customers.contains(customer)){
            System.out.println("Already in the bank");
        }
        else {
            customers.add(customer);
        }
    }
    public void addTransaction(Customer customer,Double amount){
        if(customers.contains(customer)){
            customer.addTransaction(amount);
        }
        else {
            System.out.println("Customer not found in the bank");
        }
    }
    public void displayCustomers(){
        for(Customer customer : customers){
            System.out.print(customer.getName() + ", Transactions: ");
            // unboxing
            for(double transaction : customer.getTransactions()){
                if(transaction > 0) System.out.print("+" + transaction + "  ");
                else System.out.print(transaction + "  ");
            }
            System.out.println();
        }
    }
}
