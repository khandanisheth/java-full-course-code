package ATM;

import java.util.Scanner;

public class ATMMachine extends atmfun {
    public static void main(String[] args) {
        ATMMachine atm = new ATMMachine();
        System.out.println("Press \n 1.Cash Check \n 2.Cash Withdraw ->");
        System.out.println("Enter Your Choice ->");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        switch (key) {
            case 1:
                atm.cashcheck();
                break;
            case 2:
                atm.withdraw();
                break;
            default:
                System.out.println("/n Choice Is Invalid \n");
                break;
        }
        sc.close();
    }
}