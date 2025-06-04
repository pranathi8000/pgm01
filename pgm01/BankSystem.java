// File: BankSystem.java

class Bank_Customer {
    String cust_name;
    int customer_id;
    String customer_address;

    // Constructor to initialize values
    public Bank_Customer(String cust_name, int customer_id, String customer_address) {
        this.cust_name = cust_name;
        this.customer_id = customer_id;
        this.customer_address = customer_address;
    }

    // Method to display customer details
    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + cust_name);
        System.out.println("Customer ID: " + customer_id);
        System.out.println("Customer Address: " + customer_address);
    }
}

class Bank_Transaction {
    String account_name;           // e.g., SBI, Canara, Bank of Baroda
    String accountholder_name;
    String account_type;           // saving/business
    long account_number;
    double balance;

    // Constructor to initialize values
    public Bank_Transaction(String account_name, String accountholder_name, String account_type,
                            long account_number, double balance) {
        this.account_name = account_name;
        this.accountholder_name = accountholder_name;
        this.account_type = account_type;
        this.account_number = account_number;
        this.balance = balance;
    }

    // Method to display transaction details
    public void displayTransactionInfo() {
        System.out.println("Account Name: " + account_name);
        System.out.println("Account Holder Name: " + accountholder_name);
        System.out.println("Account Type: " + account_type);
        System.out.println("Account Number: " + account_number);
        System.out.println("Balance: " + balance);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        // Create a bank customer
        Bank_Customer customer = new Bank_Customer("John Doe", 1001, "123 Elm Street");
        customer.displayCustomerInfo();

        System.out.println();

        // Create a bank transaction
        Bank_Transaction transaction = new Bank_Transaction("SBI", "John Doe", "saving", 1234567890L, 5000.75);
        transaction.displayTransactionInfo();
    }
}