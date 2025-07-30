package LambdaExpression;

interface Functional {
    int operation(int a, int b);
}

public class Le_8_CalculeterLemda {
    public static void main(String[] args) {
        Functional add = (a, b) -> a + b;
        Functional sub = (a, b) -> a - b;
        Functional mult = (a, b) -> a * b;
        // Division operation with exception handling
        Functional dividedFunctional = (a, b) -> {
            try {
                return a / b; // Perform division
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
                return 0; // Return 0 if there's an error (e.g., division by zero)
            }
        };

        int a=10,b=0;
        System.out.println("Add ->"+add.operation(a, b));
        System.out.println("Subtrect ->"+sub.operation(a, b));
        System.out.println("Multiply ->"+mult.operation(a, b));
        System.out.println("Diveded ->"+dividedFunctional.operation(a, b));
    }
}
