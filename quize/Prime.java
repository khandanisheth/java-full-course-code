public class Prime {
    public static void main(String[] args) {
        int num = 12;
        int isPrime = 0;

        for (int i = 2; i < num / 2; i++) {
            if (i % 2 == 0) {
                isPrime = 1;
                break;
            }
        }

        // Output the result
        if (isPrime == 0) {
            System.out.print(num + " is a prime number.\n");

        } else {
            System.out.print(num + " is not a prime number\n");
        }
    }
}
