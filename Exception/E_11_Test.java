package Exception;

public class E_11_Test {
    public static void main(String[] args) {
        E_11_BankAccount obj = new E_11_BankAccount(10);
        try {
            obj.withdraw(15);  // Invalid transaction, Exception throw hoga
        } catch (E_11_CustomException e) {  // Specific Exception catch
            System.out.println("Exception: " + e);
        }
    }
}
