package LambdaExpression;

public class Le_5_ThreadLambdaEx {
    public static void main(String[] args) throws InterruptedException {
        // Use StringBuilder for mutability
        StringBuilder st1 = new StringBuilder();

        // Lambda expression for printing "hello"
        //Runnable runnable1 = () -> System.out.println("hello");

        // Runnable task to modify StringBuilder
        Runnable run1 = () -> {
            for (int i = 0; i < 1000; i++) {
                try {
                    Thread.sleep(1); // Simulate work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (st1) { // Corrected synchronized block
                    st1.append("1");
                }
            }
        };

        // Creating and starting threads with run1
        Thread t1 = new Thread(run1);
        Thread t2 = new Thread(run1);
        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        // Print the final result (length should be 2000 * avg digit count)
        System.out.println(st1.length());
    }
}
