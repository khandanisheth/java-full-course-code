package DSAjava.Queue;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a queue
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements to the queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        // Display the queue
        System.out.println("Queue: " + queue);

        // Get the front element of the queue without removing it
        int frontElement = queue.peek();
        System.out.println("Front Element: " + frontElement);

        // Dequeue elements from the queue
        int removedElement1 = queue.poll();
        int removedElement2 = queue.poll();

        // Display the removed elements
        System.out.println("Removed Elements: " + removedElement1 + ", " + removedElement2);

        // Display the queue after dequeue
        System.out.println("Queue after Dequeue: " + queue);

        // Enqueue a new element to the queue
        queue.offer(60);

        // Display the updated queue
        System.out.println("Updated Queue: " + queue);

        // Check if the queue contains a specific element
        boolean containsElement = queue.contains(30);
        System.out.println("Queue Contains 30? " + containsElement);

        // Get the size of the queue
        int size = queue.size();
        System.out.println("Queue Size: " + size);

        // Clear the queue
        queue.clear();

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is Queue Empty? " + isEmpty);
    }
}
