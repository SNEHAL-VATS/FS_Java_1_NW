public class Account {
    private static int accountNumberCounter = 1000;
    protected static double bankBalance = 0.0;
    protected int accountNumber;
    protected double balance;

    public Account() {
        this.accountNumber = generateAccountNumber();
    }

    public static int generateAccountNumber() {
        return accountNumberCounter++;
    }

    public static double calculateBankBalance() {
        return bankBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            bankBalance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            bankBalance -= amount;
        }
    }
}
