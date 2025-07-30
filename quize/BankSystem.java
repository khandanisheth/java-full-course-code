import java.util.Scanner;

class BankAccount {
    private String accountHolderName;
    private double balance;
    private String accountNumber;
    private String password;

    // Constructor to initialize the bank account
    public BankAccount(String accountHolderName, String accountNumber, String password) { // 1 1 1 0.0
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.password = password;
        this.balance = 0.0;
    }

    // Deposit method to add money to the balance
    public void deposit(double amount) { // 20
        if (amount > 0) { // 20 > 0
            balance += amount; // 0+20
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method to deduct money from the balance
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) { // 20 > 0 && 10 <= 20
            balance -= amount; // 20-10
            System.out.println("Withdrawn: $" + amount); // 10
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Check the current balance
    public void checkBalance() {
        System.out.println("Current Balance: $" + balance); // 10
    }

    // Transfer money to another account
    public void transfer(BankAccount recipient, double amount) {
        if (amount > 0 && amount <= balance) { // 5 > 0 && 5 <= 10
            this.balance -= amount;// 5
            recipient.deposit(amount);
            System.out.println("Transferred: $" + amount + " to account " + recipient.getAccountNumber());
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Validate user password
    public boolean validatePassword(String enteredPassword) {
        return password.equals(enteredPassword);
    }

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}

public class BankSystem {
    private static Scanner sc = new Scanner(System.in);
    private static BankAccount currentAccount;

    public static void main(String[] args) {
        System.out.println("Welcome to the Bank System!");

        while (true) {
            System.out.println("\n1. Create New Account");
            System.out.println("2. Login to Existing Account");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    createAccount(); // 1 1 1 0.0
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("Exiting Bank System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Method to create a new bank account
    public static void createAccount() {
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Account Number: ");
        String accountNumber = sc.nextLine();
        System.out.print("Set a Password: ");
        String password = sc.nextLine();

        currentAccount = new BankAccount(name, accountNumber, password); // 1 1 1
        System.out.println("Account created successfully!");
    }

    // Method to login to an existing bank account
    public static void login() {
        if (currentAccount == null) { // any == null *
            System.out.println("No account found! Please create a new account.");
            return;
        }

        System.out.print("Enter Account Number: "); 
        String accountNumber = sc.nextLine(); // 1

        if (!accountNumber.equals(currentAccount.getAccountNumber())) { // !1.equals(1)
            System.out.println("Invalid Account Number.");
            return;
        }

        System.out.print("Enter Password: ");
        String password = sc.nextLine();// 1

        if (!currentAccount.validatePassword(password)) { // !1.equals(1)
            System.out.println("Invalid Password.");
            return;
        }

        System.out.println("Login successful!");
        accountOperations();
    }

    // Method to handle account operations after login
    public static void accountOperations() {
        while (true) {
            System.out.println("\n1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Transfer Money");
            System.out.println("5. Logout");
            System.out.print("Choose an operation: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    depositMoney(); // 20
                    break;
                case 2:
                    withdrawMoney();// 10
                    break;
                case 3:
                    currentAccount.checkBalance();
                    break;
                case 4:
                    transferMoney();
                    break;
                case 5:
                    System.out.println("Logged out successfully.");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Method to deposit money
    public static void depositMoney() {
        System.out.print("Enter deposit amount: $");
        double amount = sc.nextDouble(); // 20
        currentAccount.deposit(amount);
    }

    // Method to withdraw money
    public static void withdrawMoney() {
        System.out.print("Enter withdraw amount: $");
        double amount = sc.nextDouble();// 10
        currentAccount.withdraw(amount);
    }

    // Method to transfer money
    public static void transferMoney() {
        sc = new Scanner(System.in);
        System.out.print("Enter recipient account number: "); // 12
        String recipientAccountNumber = sc.nextLine();
        System.out.print("Enter transfer amount: $"); // 5 
        double amount = sc.nextDouble();

        // Simulate recipient account for the purpose of this system
        BankAccount recipientAccount = new BankAccount("Recipient", recipientAccountNumber, "password");
        currentAccount.transfer(recipientAccount, amount); /// 12 5
    }
}
