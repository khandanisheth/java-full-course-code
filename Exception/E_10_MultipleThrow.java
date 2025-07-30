package Exception;

public class E_10_MultipleThrow {

    public static void validate(int age, String nationality) throws Exception {
        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or above!");
        } else if (!nationality.equals("Indian")) {
            throw new IllegalArgumentException("Only Indian citizens are allowed!");
        }
        System.out.println("Validation Successful!");
    }

    public static void main(String[] args) {
        try {
            validate(1, "Indian"); // ❌ Age exception throw hoga, next check nahi hoga
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            validate(20, "American"); // ❌ Nationality exception throw hoga
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            validate(25, "Indian"); // ✅ No exception, method successful
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}