import java.util.LinkedList;
import java.util.Queue;

public class Cf_15_QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Add elements
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");// This Is Are Used and but Queue is Full then To Add and Thorow Exception
        queue.offer("Danish");// This Is Are Used To Add and null but Queue is Full
        queue.add(null);
        queue.add(null);
        System.out.println("Queue: " + queue); // [Apple, Banana, Cherry]

        // Peek element (First element dekhne ke liye)
        System.out.println("Front Element: " + queue.peek()); // This are Paerform to frontItem and Queue is Empty then
                                                              // To Add and Thorow Exception
        System.out.println("Front Element: " + queue.element()); // This Is Are Used To Front Element and null but Queue
                                                                 // is Empty
        System.out.println(queue.remove());// This are Paerform to Dequeue but Queue is Empty then To Add and Thorow
                                           // Exception
        System.out.println("Queue: " + queue);
        System.out.println(queue.poll());// This Is Are Used To Dequeue and null but Queue is Empty

        // Search for an element
        String searchElement = "Cherry";
        if (queue.contains(searchElement)) {
            System.out.println(searchElement + " found in the queue.");
        } else {
            System.out.println(searchElement + " not found in the queue.");
        }

    }
}
/*
 * 📌 Queue Kab Use Kare?
 * ✅ Jab data ko sequentially process karna ho (Jaise CPU scheduling, Printer
 * queue, Messaging system).
 * ✅ Jab order maintain karna ho aur fast removal chahiye ho.
 * ✅ Jab sorting wali queue chahiye ho tab PriorityQueue use kare.
 */