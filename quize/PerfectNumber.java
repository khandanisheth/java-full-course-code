import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); //28

        // Calculate the sum of proper divisors
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {//28 14<=14
            if (num % i == 0) { // Check if i is a divisor 28 %4
                sum += i;//1+2+4+7+14==28
            }
        }
        // Check if the sum of divisors equals the number
        if (sum == num) {// 28== 28 
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " is not a Perfect Number.");
        }
        sc.close();
    }
}
