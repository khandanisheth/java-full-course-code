package Exception;
// Custom Exception class
class CustomException extends Exception {
    // Constructor
    public CustomException(String message) {
        super(message);
    }
}

// Main class to demonstrate Custom Exception
public class CustomExceptionDemo {
    // Method that throws CustomException
    public static void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be 18 or above!");
        } else {
            System.out.println("Access granted!");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(16); // Age less than 18, exception will be thrown
        } catch (CustomException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
