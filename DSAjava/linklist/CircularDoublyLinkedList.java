package DSAjava.linklist;

import java.util.Scanner;

public class CircularDoublyLinkedList {
    class Node {
        int data;
        Node left;
        Node right;
    }

    Node start = null;

    Node createNode() {
        Node temp = new Node();
        try (Scanner sc = new Scanner(System.in)) {
            temp.right = null;
            System.out.println("Enter Node Item ->");
            temp.data = sc.nextInt();
        }
        temp.left = null;
        return temp;
    }

    void InsertNodeFirstPosition() {
        Node n = createNode();
        if (start == null) {
            start = n;
            n.left = start;
            n.right = start;
        } else {
            n.right = start;
            n.left = start.left;
            start.left.right = n;
            start.left = n;
            start = n;
        }
        System.out.println("New Node Successfully inserted at Start.");
    }

    void InsertNodeEndPosition() {
        Node n = createNode();
        if (start == null) {
            start = n;
            n.left = start;
            n.right = start;
        } else {
            n.right = start;
            n.left = start.left;
            start.left.right = n;
            start.left = n;
        }
        System.out.println("New Node Successfully inserted at End.");
    }

    void InsertNodeSpecifiedPosition() {
        int count = 0, pos, i;
        Node n, tr;
        if (start == null) {
            InsertNodeEndPosition();
        } else {
            tr = start;
            while (tr.right != start) {
                count++;
                tr = tr.right;
            }
            count++; // Counting the last node
            if (count < 2) {
                InsertNodeEndPosition();
            } else {
                try (Scanner sc = new Scanner(System.in)) {
                    System.out.println("Enter Node Position ! 2 TO " + count + " ->");
                    pos = sc.nextInt();
                }
                if (pos <= 1 || count < pos) {
                    System.out.println("Please Enter a Valid Position.");
                } else {
                    n = createNode();
                    tr = start;
                    for (i = 1; i < pos - 1; i++) {
                        tr = tr.right;
                    }
                    n.right = tr.right;
                    n.left = tr;
                    tr.right.left = n;
                    tr.right = n;
                    System.out.println("New Node Successfully Inserted at Position " + pos + ".");
                }
            }
        }
    }

    void DeleteNodeFirstPosition() {
        if (start == null) {
            System.out.println("List is Empty !");
        } else {
            Node rel = start;//1
            System.out.println("Deleted Node -> " + rel.data);//2
            start = rel.right;//3
            start.left = rel.left;//4
            rel.left.right = start;//5
            
            System.out.println("List First Node Successfully Deleted.->"+rel.data);
        }
    }

    void DeleteNodeEndPosition() {
        if (start == null) {
            System.out.println("List is Empty !");
        } else if (start.right == start) {
            System.out.println("Deleted Node -> " + start.data);
            start = null;
            System.out.println("List End Node Successfully Deleted.");
        } else {
            Node tr = start;
            while (tr.right != start) {
                tr = tr.right;
            }
            Node rel = tr;
            System.out.println("Deleted Node -> " + rel.data);
            tr.left.right = start;
            start.left = tr.left;
            System.out.println("List End Node Successfully Deleted.");
        }
    }

    void DeleteNodeSpecifiedPosition() {
        int count = 0, pos, i;
        if (start == null) {
            System.out.println("List is Empty !");
        } else {
            Node tr = start;
            while (tr.right != start) {
                count++;
                tr = tr.right;
            }
            count++; // Counting the last node
            if (count <= 2) {
                System.out.println("List Is Empty !");
            } else {
                System.out.println("Enter Position of Node to Delete! 2 to " + count + " ->");
                @SuppressWarnings("resource")
                Scanner sc = new Scanner(System.in);
                pos = sc.nextInt();
                if (pos <= 1 || count < pos) {
                    System.out.println("Invalid Position!");
                } else {
                    tr = start;
                    for (i = 1; i < pos; i++) {
                        tr = tr.right;
                    }
                    Node rel = tr;
                    System.out.println("Deleted Node -> " + rel.data);
                    tr.left.right = tr.right;
                    tr.right.left = tr.left;
                    System.out.println("Node at Position " + pos + " Successfully Deleted.");
                }
            }
        }
    }

    void TraverseNodeList() {
        if (start == null) {
            System.out.println("List Is Empty!");
        } else {
            Node current = start;
            System.out.println("List Contains the Following Items ->");
            do {
                System.out.println(current.data);
                current = current.right;
            } while (current != start);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();

        while (true) {
            System.out.println("\n ***---------------Circular Doubly Linked List -------------------*** \n");
            System.out.println("Press:");
            System.out.println("1. Insert Node First Position");
            System.out.println("2. Insert Node End Position");
            System.out.println("3. Insert Node Specified Position");
            System.out.println("4. Delete First Node Position");
            System.out.println("5. Delete End Node Position");
            System.out.println("6. Delete Node Specified Position");
            System.out.println("7. Traverse Node List");
            System.out.println("8. Exit.");
            System.out.print("Enter Your Choice => ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    cdll.InsertNodeFirstPosition();
                    break;
                case 2:
                    cdll.InsertNodeEndPosition();
                    break;
                case 3:
                    cdll.InsertNodeSpecifiedPosition();
                    break;
                case 4:
                    cdll.DeleteNodeFirstPosition();
                    break;
                case 5:
                    cdll.DeleteNodeEndPosition();
                    break;
                case 6:
                    cdll.DeleteNodeSpecifiedPosition();
                    break;
                case 7:
                    cdll.TraverseNodeList();
                    break;
                case 8:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice.\n");
            }
        }
    }
}
