package Activity4ProblemSet.BankSystem;

public class BankAccount {

    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Display account information
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: PHP " + balance);
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited PHP " + amount + " to " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew PHP " + amount + " from " + accountNumber);
            return true;
        } else {
            System.out.println("Insufficient funds or invalid amount for " + accountNumber);
            return false;
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }
}
