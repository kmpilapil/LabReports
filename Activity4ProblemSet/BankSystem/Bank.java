package Activity4ProblemSet.BankSystem;

public class Bank {

    // Method to transfer money between two BankAccount objects
    public void transferMoney(BankAccount from, BankAccount to, double amount) {
        System.out.println("\n--- Initiating Transfer ---");
        System.out.println("From: " + from.getAccountNumber());
        System.out.println("To: " + to.getAccountNumber());
        System.out.println("Amount: PHP " + amount);

        if (from.withdraw(amount)) {
            to.deposit(amount);
            System.out.println("Transfer successful.");
        } else {
            System.out.println("Transfer failed due to insufficient funds.");
        }
    }
}
