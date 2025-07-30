package Thered;

class BankAccount {
    private int balance = 100;

    // Synchronized method to prevent race condition
    public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);

        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");

            try {
                Thread.sleep(3000); // Simulating delay
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " insufficient balance");
        }
    }
}

public class T_6_Usesynchronized {
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount();

        // Creating a task for threads
        Runnable task = new Runnable() {
            @Override
            public void run() {
                sbi.withdraw(50);
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");

        t1.start();
        t2.start();
    }
}
