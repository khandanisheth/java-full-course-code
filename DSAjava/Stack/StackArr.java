package DSAjava.Stack;
import java.util.Scanner;

public class StackArr {
    public int top = -1;

    /* Push Stack Operation */
    public void push(int[] arr, int n, Scanner sc) {
        if (top == n - 1) {
            System.out.println("Stack Overflow\n");
        } else {
            System.out.print("Enter Stack Item -> ");
            int item = sc.nextInt();
            top++;
            arr[top] = item;
            System.out.println("Push Operation Successful");
        }
    }

    /* Pop Stack Operation */
    public void pop(int[] arr) {
        if (top == -1) {
            System.out.println("Stack Underflow\n");
        } else {
            int item = arr[top];
            System.out.println("Stack Pop Item -> " + item);
            top--;
        }
    }

    public void peek(int []arr)
    {
        if (top == -1) {
            System.out.println("Stack is Empty\n");
        } else {
            System.out.println("Peek Element -> " + arr[top]);
        }
    }
    /* Traverse Stack Operation */
    // public void traverse(int[] arr) {
    //     if (top == -1) {
    //         System.out.println("Stack Is Empty\n");
    //     } else {
    //         System.out.println("Stack Elements:");
    //         for (int i = 0; i <= top; i++) {
    //             System.out.println(arr[i]);
    //         }
    //     }
    // }

    public void traverse(int[] arr) {
        if (top == -1) {
            System.out.println("Stack Is Empty\n");
        } else {
            System.out.println("Stack Elements (Top to Bottom):");
            for (int i = top; i >= 0; i--) {  // Reverse loop for LIFO order
                System.out.println("aar["+i+"]"+arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        StackArr stackObj = new StackArr();
        Scanner scanner = new Scanner(System.in);
        int[] stack;
        int n, choice;

        System.out.print("Enter Stack Capacity => ");
        n = scanner.nextInt();
        stack = new int[n];

        while (true) {
            System.out.println("\nPress:");
            System.out.println("1. Push Operation");
            System.out.println("2. Pop Operation");
            System.out.println("3. Stack Display");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice => ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    stackObj.push(stack, n, scanner);
                    break;
                case 2:
                    stackObj.pop(stack);
                    break;
                case 3:
                    stackObj.traverse(stack);
                    break;
                case 4:
                    System.out.println("Exiting Program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Please Enter a Valid Choice.");
            }
        }
    }
}
