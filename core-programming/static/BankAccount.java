public class BankAccount {
    private static String bankName = "Global Trust Bank";
    private static int totalAccounts = 0;

    private final int accountNumber;
    private String accountHolderName;

    public BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
        } else {
            System.out.println("Invalid object type!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1001, "Alice");
        BankAccount acc2 = new BankAccount(1002, "Bob");

        acc1.displayDetails();
        System.out.println();
        acc2.displayDetails();

        System.out.println("\nTotal Accounts: " + BankAccount.getTotalAccounts());
    }
}