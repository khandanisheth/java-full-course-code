package LambdaExpression;

public class Le_4_ThreadAnonymous  {
    public static void main(String[] args) throws InterruptedException {
        // Use StringBuilder instead of String for mutability
        StringBuilder st = new StringBuilder();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    try {
                        Thread.sleep(10); // Simulate work
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // Append to StringBuilder
                    synchronized(st)
                    {
                        st.append("k");
                    }
                }
            }
        };

        // Creating and starting threads
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        // Print the final result (length should be 2000)
        System.out.println(st.length());
    }
}
