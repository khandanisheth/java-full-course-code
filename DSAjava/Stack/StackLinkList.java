package DSAjava.Stack;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class StackLinkList {
    private Node top;
    StackLinkList()
    {
        this.top=null;
    }

    public void push(int value)
    {
        Node newNode =new Node(value);
        if(top==null)
        {
            top=newNode ;
        }
        else
        {
           newNode.next=top;
           top=newNode;
        }
        System.out.println("Item SuccessFully Pushed Stack List");
    }

    public void pop()
    {
        if(top==null)
        {
            System.out.println("Stack Underflow\n");
            return;
        }
        else{
            System.out.println("Popped Element -> " + top.data);
            top=top.next;
        }
    }

    /* Peek Operation */
    public void peek() {
        if (top == null) {
            System.out.println("Stack is Empty\n");
            return;
        }
        System.out.println("Peek Element -> " + top.data);
    }   

    public void Display()
    {
        if (top == null) {
            System.out.println("Stack is Empty\n");
            return;
        }
        else
        {
            Node temp=top;
            System.out.println("Stack Elements (Top to Bottom):");
            while (temp!=null) {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
      /* Main Method */
      public static void main(String[] args) {
        StackLinkList stack = new StackLinkList();
        Scanner scanner = new Scanner(System.in);
        int choice, item;

        while (true) {
            System.out.println("\nPress:");
            System.out.println("1. Push Operation");
            System.out.println("2. Pop Operation");
            System.out.println("3. Peek Element");
            System.out.println("4. Stack Display");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice => ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Stack Item -> ");
                    item = scanner.nextInt();
                    stack.push(item);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.Display();
                    break;
                case 5:
                    System.out.println("Exiting Program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Please Enter a Valid Choice.");
            }
        }
    }
}

