package Exception;

public class E_9_ThrowKeyWord {
    // Method jo exception throw karega
    public static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Not eligible for voting");
        } else {
            System.out.println("Eligible for voting");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16); // Method call kar rahe hain jo exception throw karega
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
