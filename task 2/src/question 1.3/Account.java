public class Account {
    private double balance; // Data member to store balance

    // No-argument constructor (sets balance to 0 by default)
    public Account() {
        balance = 0.0;
    }

    // Two-argument constructor (sets balance to the specified value)
    public Account(double initialBalance, double additionalAmount) {
        balance = initialBalance + additionalAmount;
    }

    // Method to deposit amount into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    // Method to withdraw amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be greater than zero.");
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Main method to test the Account class
    public static void main(String[] args) {
        // Using the no-argument constructor
        Account account1 = new Account();
        System.out.println("Account 1:");
        account1.displayBalance();  // Display balance (default 0)

        // Deposit and withdraw operations on account1
        account1.deposit(1000);
        account1.displayBalance();

        account1.withdraw(500);
        account1.displayBalance();

        // Trying to withdraw more than the balance
        account1.withdraw(600);
        account1.displayBalance();

        // Using the two-argument constructor
        Account account2 = new Account(500, 200);
        System.out.println("\nAccount 2:");
        account2.displayBalance();  // Display balance (500 + 200)

        // Deposit and withdraw operations on account2
        account2.deposit(1500);
        account2.displayBalance();

        account2.withdraw(1200);
        account2.displayBalance();
    }
}
