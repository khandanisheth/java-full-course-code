import java.util.Scanner;

public class Disarium{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // 153

        // Save the original number for comparison
        int originalNum = num; // 153

        // Find the number of digits
        int digits = 0; 
        int temp = num;// 153
        while (temp > 0) { // 1 1 1
            digits++; /// 3 
            temp = temp / 10;//0
        }// ye tho bata rha ke digit kithne 

        // Calculate the sum of the digits raised to the power of the number of digits
        int sum = 0;
        temp = num; // 135
        while (temp > 0) { // 1 1
            int digit = temp % 10; // Extract last digit  3 5 
            sum += Math.pow(digit, digits); // Add digit^digits to the sum  27 +125+ 1
            digits--;
            temp = temp / 10; // Remove last digit 13
        }

        // Check if the sum is equal to the original number
        if (sum == originalNum) { // 32 = 123
            System.out.println(originalNum + " is an Disarium number.");
        } else {
            System.out.println(originalNum + " is not an Disarium number.");
        }

        sc.close();
    }
}
