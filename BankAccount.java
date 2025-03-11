class BankAccount {
    private static String bankName = "HDFC Bank"; // Static variable
    private static int totalAccounts = 0; // Static counter
    private final int accountNumber; // Final variable that cannot be changed
    private String accountHolderName;

    // Constructor
    public BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        totalAccounts++; // Increment total accounts
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) { // Using instanceof
            System.out.println("\nBank Name: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
        }
    }

    public static void getTotalAccounts() {
        System.out.println("\nTotal Bank Accounts: " + totalAccounts);
    }
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(101, "Pranav");
        BankAccount acc2 = new BankAccount(102, "Abhay");

        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
        BankAccount.getTotalAccounts();
    }
}


