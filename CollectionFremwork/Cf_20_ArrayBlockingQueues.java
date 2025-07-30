import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class Cf_20_ArrayBlockingQueues {
    public static void main(String[] args) throws InterruptedException {
        // 🔹 Create a BlockingQueue with a capacity of 3
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);

        // 🔹 Add elements using put() method
        queue.put(10);
        queue.put(20);
        queue.put(30);

        System.out.println("Queue after adding elements: " + queue);

        // 🔹 Remove elements using take() method
        System.out.println("Removed: " + queue.take()); // 10 remove
        System.out.println("Removed: " + queue.take()); // 20 remove

        System.out.println("Removed: " + queue.take()); // 20 remove
        System.out.println("Removed: " + queue.take()); // 20 remove

        System.out.println("Queue after removing elements: " + queue);
    }
}
/*
 * Queue after adding elements: [10, 20, 30]
 * Removed: 10
 * Removed: 20
 * Removed: 30 ✅ (Queue ab empty ho gaya)
 * (Program yahan block ho jayega aur ruk jayega kyunki queue empty hai!)
 * 👉 4th take() method kabhi execute nahi hoga kyunki queue me koi element hi
 * nahi hai! Yeh infinite wait karega aur program block ho jayega.
 */