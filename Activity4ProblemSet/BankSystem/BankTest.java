package Activity4ProblemSet.BankSystem;

public class BankTest {

    public static void main(String[] args) {
        // Create bank account objects
        BankAccount account1 = new BankAccount("001", 5000.00);
        BankAccount account2 = new BankAccount("002", 3000.00);

        // Display initial state
        System.out.println("=== BEFORE TRANSFER ===");
        account1.displayAccountInfo();
        account2.displayAccountInfo();

        // Create bank object and perform transfer
        Bank bank = new Bank();
        bank.transferMoney(account1, account2, 10000.00); // Transfer PHP 2,500

        // Display state after transfer
        System.out.println("\n=== AFTER TRANSFER ===");
        account1.displayAccountInfo();
        account2.displayAccountInfo();
    }
}
