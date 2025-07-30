package Exception;

public class E_11_BankAccount {
    private double balance;

    public E_11_BankAccount(double amount) {
        this.balance = amount;
    }

    public void withdraw(double amount) throws E_11_CustomException {  // Specific Exception
        if (amount > balance) {
            throw new E_11_CustomException();  // Custom Exception throw
        }
        balance -= amount;
        System.out.println("This Is Your Total Amount -> " + balance);
    }
}
