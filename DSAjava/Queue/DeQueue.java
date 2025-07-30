package DSAjava.Queue;

import java.util.Scanner;

class Queue {
    private int capacity;
    private int front;
    private int rear;
    private int[] queue;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.front = -1;
        this.rear = -1;
        this.queue = new int[capacity];
    }

    public boolean isFull() {
        return (rear == capacity - 1);
    }

    public boolean isEmpty() {
        return (front == -1 || front > rear);
    }

    // ✅ Enqueue at Rear End
    public void enQueueRearEnd(int item) {
        if (isFull()) {
            System.out.println("❌ Queue Overflow.");
        } else {
            rear++;
            queue[rear] = item;
            if (front == -1) {
                front = 0;
            }
            System.out.println("✅ Item " + item + " Successfully Enqueued at Rear End.");
        }
    }

    // ✅ Enqueue at Front End (Fixed Condition)
    public void enQueueFrontEnd(int item) {
        if (front == 0 && rear != -1) {
            System.out.println("❌ No Space at Front. Cannot Enqueue.");
        } else {
            if (front == -1) {
                front = rear = 0;
            } else {
                front--;
            }
            queue[front] = item;
            System.out.println("✅ Item " + item + " Successfully Enqueued at Front End.");
        }
    }

    // ✅ Dequeue from Front End
    public void deQueueFrontEnd() {
        if (isEmpty()) {
            System.out.println("❌ Queue Underflow.");
        } else {
            int item = queue[front];
            System.out.println("🗑 Deleted Item: " + item);
            if (front == rear) {
                front = rear = -1;
            } else {
                front++;
            }
            System.out.println("✅ Item Successfully Dequeued from Front End.");
        }
    }

    // ✅ Dequeue from Rear End
    public void deQueueRearEnd() {
        if (isEmpty()) {
            System.out.println("❌ Queue Underflow.");
        } else {
            int item = queue[rear];
            System.out.println("🗑 Deleted Item: " + item);
            if (front == rear) {
                front = rear = -1;
            } else {
                rear--;
            }
            System.out.println("✅ Item Successfully Dequeued from Rear End.");
        }
    }

    // ✅ Display Queue
    public void queueTraverse() {
        if (isEmpty()) {
            System.out.println("❌ Queue is Empty.");
        } else {
            System.out.print("📜 Queue Elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
}

public class DeQueue {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("🔢 Enter Queue Capacity: ");
            int capacity = scanner.nextInt();
            Queue queue = new Queue(capacity);
            System.out.println("🔄 Choose Queue Type:");
            System.out.println("1️⃣ Input Restricted DeQueue.");
            System.out.println("2️⃣ Output Restricted DeQueue.");
            System.out.print("📝 Enter Your Choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:  // ✅ Input Restricted DeQueue
                    while (true) {
                        System.out.println("\n🔄 Choose Operation:");
                        System.out.println("1️⃣ Enqueue Rear End.");
                        System.out.println("2️⃣ Dequeue Front End.");
                        System.out.println("3️⃣ Dequeue Rear End.");
                        System.out.println("4️⃣ Queue Traverse.");
                        System.out.println("5️⃣ Exit.");
                        System.out.print("📝 Enter Your Choice: ");
                        choice = scanner.nextInt();

                        switch (choice) {
                            case 1:
                                System.out.print("➕ Enter Queue Item: ");
                                int item = scanner.nextInt();
                                queue.enQueueRearEnd(item);
                                break;
                            case 2:
                                queue.deQueueFrontEnd();
                                break;
                            case 3:
                                queue.deQueueRearEnd();
                                break;
                            case 4:
                                queue.queueTraverse();
                                break;
                            case 5:
                                System.exit(0);
                            default:
                                System.out.println("❌ Invalid Choice. Try Again.");
                        }
                    }
                case 2:  // ✅ Output Restricted DeQueue
                    while (true) {
                        System.out.println("\n🔄 Choose Operation:");
                        System.out.println("1️⃣ Enqueue Rear End.");
                        System.out.println("2️⃣ Enqueue Front End.");
                        System.out.println("3️⃣ Dequeue Front End.");
                        System.out.println("4️⃣ Queue Traverse.");
                        System.out.println("5️⃣ Exit.");
                        System.out.print("📝 Enter Your Choice: ");
                        choice = scanner.nextInt();

                        switch (choice) {
                            case 1:
                                System.out.print("Enter Queue Item: ");
                                int item = scanner.nextInt();
                                queue.enQueueRearEnd(item);
                                break;
                            case 2:
                                System.out.print("Enter Queue Item: ");
                                item = scanner.nextInt();
                                queue.enQueueFrontEnd(item);
                                break;
                            case 3:
                                queue.deQueueFrontEnd();
                                break;
                            case 4:
                                queue.queueTraverse();
                                break;
                            case 5:
                                System.exit(0);
                            default:
                                System.out.println("❌ Invalid Choice. Try Again.");
                        }
                    }
                default:
                    System.out.println("❌ Invalid Choice. Try Again.");
            }
        }
    }
}
