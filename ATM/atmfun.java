package ATM;

import java.util.Scanner;

public class atmfun extends atmdata {
    Scanner sc = new Scanner(System.in);

    public void cashcheck() {
        System.out.println(balance);
    }

    int i = 1;

    public void withdraw() {
        while (true) {
            System.out.println("Enter Your pin ->");
            int x = pin = sc.nextInt();
            if (x == pass) {
                System.out.println("Your Password Is Check");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println("*************************         ***********************************");
                System.out.println("************************* Right Password ***********************************");
                System.out.println("*************************         ***********************************\n");
                System.out.println("Enter Your Amount ->");
                int amt = sc.nextInt();
                if (amt <= balance) {
                    float y = balance - amt;
                    System.out.println("Your Amount is Successfully Withdrawn, your Amount ->\n" + amt);
                    System.out.println("\n Your Amount is Total ->%\n" + y);
                    break;
                } else {
                    System.out.println("   Balance is Low Balance || Sorry \n Your Total Balance Is ->\n " + balance);
                    break;
                }

            } else {
                System.out.println("\n --Your Pin Is Wrong --\n");
                i++;
            }
            if (i == 3) {
                System.out.println("\n ***----24 hours Ban  Your Account***---\n");
                System.exit(0);
                break;
            }
        }
        System.out.println("\n------------** Thanks for BOB ATM **-------------\n");

    }
}