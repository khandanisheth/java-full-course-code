package DSAjava.Queue;

import java.util.Scanner;

public class QueueArr {
    public int front = -1;
    public int rear = -1;

    // EnQueue Function
    public void enQueue(int[] arr, int n, Scanner sc) {
        if (rear == n - 1) {
            System.out.println("Queue Is OverFlow");
        } else {
            System.out.println("Enter Queue Item ->");
            int item = sc.nextInt();
            rear++;
            arr[rear] = item;
            if (front == -1) { 
                front = 0; // ✅ Front Initialize
            }
            System.out.println("Queue Item Successfully EnQueued");
        }
    }

    // DeQueue Function
    public void Dequeue(int[] arr) {
        if (front == -1 || front > rear) {  // ✅ Queue Underflow Condition Fix
            System.out.println("Queue Is Underflow");
            front = rear = -1;  // ✅ Reset queue properly
        } else {
            int item = arr[front];
            System.out.println("DeQueue Item -> " + item);
            if (front == rear) {  // ✅ Queue Empty Hone Par Reset
                front = rear = -1;
            } else {
                front++;  // ✅ Sirf Front Badhega
            }
            System.out.println("DeQueue Successfully Done");
        }
    }

    // Peek Function
    public void peek(int[] arr) {
        if (front == -1 || front > rear) {  // ✅ Queue Empty Check
            System.out.println("Queue Is Empty");
        } else {
            System.out.println("Peek Element -> " + arr[front]);  // ✅ Front Element Print
        }
    }

    // Display Function
    public void display(int[] arr) {
        if (front == -1 || front > rear) {  // ✅ Queue Empty Condition Fix
            System.out.println("Queue Is Empty");
        } else {
            System.out.println("Queue Elements ->");
            for (int i = front; i <= rear; i++) {  // ✅ Front se Rear tak print karega
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        QueueArr q = new QueueArr();
        Scanner sc = new Scanner(System.in);
        int[] queue;
        int n, choice;
        System.out.print("Enter Queue Capacity => ");
        n = sc.nextInt();
        queue = new int[n];

        while (true) {
            System.out.println("\nPress:");
            System.out.println("1. EnQueue Operation");
            System.out.println("2. DeQueue Operation");
            System.out.println("3. Peek Element");  // ✅ Peek Option Added
            System.out.println("4. Queue Display");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice => ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    q.enQueue(queue, n, sc);
                    break;
                case 2:
                    q.Dequeue(queue);
                    break;
                case 3:
                    q.peek(queue);  // ✅ Peek Call Added
                    break;
                case 4:
                    q.display(queue);
                    break;
                case 5:
                    sc.close(); // ✅ Scanner Band Kiya
                    System.exit(0);
                default:
                    System.out.println("Please Enter a Valid Choice.");
            }
        }
    }
}
