import java.util.Scanner;

public class XylemNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // 1234

        // Save original number for display
        int originalNum = num;// 1234

        // Initialize sums for extreme and middle digits
        int extremeSum = 0;
        int middleSum = 0;

        // Extract the last digit (rightmost digit)
        extremeSum += num % 10; // Add the last digit to extreme sum 4
        num = num / 10;         // Remove the last digit 123

        // Process middle digits
        while (num > 9) {       // Stop when only one digit is left  1 1
            middleSum += num % 10; // Add the middle digit to middle sum 5
            num = num / 10;        // Remove the middle digit 1
        }

        // Add the first digit (leftmost digit) to extreme sum
        extremeSum += num;//6

        // Check if the number is a Xylem number
        if (extremeSum == middleSum) {//6==5
            System.out.println(originalNum + " is a Xylem number.");
        } else {
            System.out.println(originalNum + " is not a Xylem number.");
        }
        sc.close();
    }
}
