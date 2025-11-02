package problem2;

public class Main {
    public static void main(String[] args){
        Bank Attijari = new Bank("Attijari Wafa Bank");
        Customer amine = new Customer("Amine");
        Customer ali = new Customer("Ali");
        Attijari.addCustomer(amine);
        Attijari.addCustomer(ali);

        // adding an existing customer
        Attijari.addCustomer(amine);
        // adding another customer with same name (works)
        Customer amine2 = new Customer("Amine");
        Attijari.addCustomer(amine2);
        // adding transactions
        Attijari.addTransaction(amine,150.5);
        Attijari.addTransaction(amine, -50.5);
        Attijari.addTransaction(ali, -30.7);
        Attijari.addTransaction(amine2, 60.8);
        // display Customers with their transaction
        Attijari.displayCustomers();

    }
}
