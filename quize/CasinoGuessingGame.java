
import java.util.Random;
import java.util.Scanner;

public class CasinoGuessingGame {

    public static void main(String[] args) {
        casinoGuessingGame();
    }

    public static void casinoGuessingGame() {
        System.out.println("Welcome to the Casino Number Guessing Game!");
        System.out.println("You have $100. Each attempt costs $10.");
        System.out.println("If you guess the number right, you win $200!");

        int balance = 100;
        int costPerAttempt = 10;

        while (balance >= costPerAttempt) {
            Random random = new Random();
            int secretNumber = random.nextInt(50) + 1;

            System.out.println("\nNew round! Guess a number between 1 and 50.");
            System.out.println("Current balance: $" + balance);

            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();

                balance -= costPerAttempt;

                if (guess == secretNumber) {
                    System.out.println("Congratulations! You've guessed the number (" + secretNumber + ")!");
                    balance += 200;
                } else {
                    System.out.println("Sorry, the number was " + secretNumber + ". Try again.");
                }
                scanner.close();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }
        }

        if (balance < costPerAttempt) {
            System.out.println("\nYou're out of funds. Game over!");
        }
        System.out.println("Final balance: $" + balance);
    }
}
