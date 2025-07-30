
import java.util.function.BinaryOperator;
public class Cf_21_LemdaExpression {

    public static void main(String[] args) {
        // Addition
        BinaryOperator<Integer> add = (a, b) -> a + b;
        
        // Subtraction
        BinaryOperator<Integer> subtract = (a, b) -> a - b;
        
        // Multiplication
        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        
        // Division
        BinaryOperator<Integer> divide = (a, b) -> (b != 0) ? a / b : 0; // Handling divide by zero
        
        // Test the calculator
        int a = 10, b = 5;
        
        System.out.println("Addition: " + add.apply(a, b));
        System.out.println("Subtraction: " + subtract.apply(a, b));
        System.out.println("Multiplication: " + multiply.apply(a, b));
        System.out.println("Division: " + divide.apply(a, b));
    }
}

/*
add = (a, b) -> a + b: Addition operation.
subtract = (a, b) -> a - b: Subtraction operation.
multiply = (a, b) -> a * b: Multiplication operation.
divide = (a, b) -> (b != 0) ? a / b : 0: Division operation with handling for division by zero.
*/