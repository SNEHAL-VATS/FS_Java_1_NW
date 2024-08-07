public class Main {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.deposit(5000);

        RecurringAccount recurringAccount = new RecurringAccount();
        recurringAccount.deposit(3000);

        FixedAccount fixedAccount = new FixedAccount();
        fixedAccount.deposit(10000);

        System.out.println("Saving Account Number: " + savingAccount.getAccountNumber() + ", Balance: " + savingAccount.getBalance());
        System.out.println("Recurring Account Number: " + recurringAccount.getAccountNumber() + ", Balance: " + recurringAccount.getBalance());
        System.out.println("Fixed Account Number: " + fixedAccount.getAccountNumber() + ", Balance: " + fixedAccount.getBalance());

        System.out.println("Total Bank Balance: " + Account.calculateBankBalance());
    }
}
