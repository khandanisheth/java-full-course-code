package DSAjava.Queue;
import java.util.Scanner;

public class CirCularQueue {
    int rear = -1;
    int front = -1;

    public void enQueue(int[] arr, int n, Scanner sc) {
        if ((rear + 1) % n == front) {
            System.out.println("CirQueue Is Overflow!");
        } else {
            System.out.print("Enter Queue Item -> ");
            int item = sc.nextInt();
            rear = (rear + 1) % n;
            arr[rear] = item;
            if (front == -1) {
                front = 0;
            }
            System.out.println("Item Enqueued Successfully!");
        }
    }

    public void Dequeue(int[] arr, int n) {
        if (front == -1) {
            System.out.println("CirQueue Is Underflow!");
        } else {
            int item = arr[front];
            System.out.println("Dequeued Item -> " + item);
            if (front == rear) {
                rear = front = -1; // Queue is empty
            } else {
                front = (front + 1) % n;
            }
            System.out.println("Dequeue Operation Successful!");
        }
    }

    public void CirCularDisplay(int[] arr, int n) {
        if (front == -1) {
            System.out.println("CirQueue Is Empty!");
        } else {
            System.out.println("Circular Queue Items ->");
            int i = front;
            while (true) {
                System.out.print(arr[i] + " ");
                if (i == rear) break;
                i = (i + 1) % n;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CirCularQueue q = new CirCularQueue();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Circular Queue Capacity => ");
        int n = sc.nextInt();
        int[] queue = new int[n];

        while (true) {
            System.out.println("\nPress:");
            System.out.println("1. EnQueue");
            System.out.println("2. DeQueue");
            System.out.println("3. Display Queue");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice => ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    q.enQueue(queue, n, sc);
                    break;
                case 2:
                    q.Dequeue(queue, n);
                    break;
                case 3:
                    q.CirCularDisplay(queue, n);
                    break;
                case 4:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Please Enter a Valid Choice.");
            }
        }
    }
}
