import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number!");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }
    }

    static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length(); // Count of digits
        while (num > 0) {
            int digit = num % 10; // Last digit
            sum += Math.pow(digit, digits); // Add power of digit
            num /= 10; // Remove last digit
        }
        return sum == originalNum; // Check Armstrong condition
    }
}
