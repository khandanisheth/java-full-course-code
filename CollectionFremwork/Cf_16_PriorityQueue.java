import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Cf_16_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(40);
        queue.add(10);
        queue.add(30);
        queue.add(20);
        queue.add(1);
       // queue.add(null);
       /// queue.add(null);

        Queue<Integer> q = new LinkedList<>();
        q.add(30);
        q.add(110);
        q.add(310);
        q.add(260);
        q.add(11);

        queue.addAll(q);// Add Other Queue

        System.out.println("Sorted Queue (Min Heap Order):");
        System.out.println(queue);

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
        int searchElement = 2;
        if (queue.contains(searchElement)) {
            System.out.println(searchElement + " found in the queue.");
        } else {
            System.out.println(searchElement + " not found in the queue.");
        }
    }
}
