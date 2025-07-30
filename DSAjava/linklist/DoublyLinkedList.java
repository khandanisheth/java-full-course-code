package DSAjava.linklist;

import java.util.Scanner;

public class DoublyLinkedList {
    class Node
    {
        int data;
        Node left;
        Node reight;
    }
    Node start =null;
    Node createNode()
    {
        Node temp=new Node();
        try (Scanner sc = new Scanner(System.in)) {
            temp.reight=null;
            System.out.println("Enter Node Item ->");
            temp.data=sc.nextInt();
        }
        temp.reight=null;
        return temp;
    }
    void InsertNodeFirstPosition()
    {
        Node n=createNode();
        if(start==null)
        {
            start=n;
        }
        else
        {
            start.reight=n;
            n.left=start;
            start=n;
        }
        System.out.println("New Node Successfully inserted at Start.");
    }
    void InsertNodeEndPosition()
    {
        Node tr;
        Node n=createNode();
        if(start==null)
        {
            start=n;
        }
        else
        {
            tr=start;
            while(tr.left!=null)
            {
                tr=tr.left;
            }
            tr.left=n;
            n.reight=tr;
        }
        System.out.println("New Node Successfully inserted at Ent.");
    }
    @SuppressWarnings("resource")
    void InsertNodeSpecifiedPosition()
    {
        int count=0,pos,i;
        Node n,tr;
        if(start==null)
        {
            InsertNodeEndPosition();
        }
        else
        {
            tr=start;
            while(tr!=null)
            {
                count++;
                tr=tr.left;
            }
            if(count<2)
            {
                InsertNodeEndPosition();
            }
            if(count>=2)
            {
                Scanner sc =new Scanner(System.in);
                System.out.println("Enter Node Position ! 2 T0"+count +"->");
                pos=sc.nextInt();
                if(pos<=1||count<pos)
                {
                    System.out.println("Please Valid Position ->");
                }
                else
                {
                    n=createNode();
                    tr=start;
                    for(i=1;i<pos-1;i++)
                    {
                        tr=tr.left;
                    }
                    n.reight=tr;
                    n.left=tr.left;
                    tr.left=n;
                    tr.left.reight=n;
                    System.out.println("New Node SuccessFully At %d Position ."+pos);
                }
            }
        }
    }

    void DeletedFirstNodePosition()
    {
        Node rel;
        if(start==null)
        {
            System.out.println("List is Empty !");
        }
        else
        {
            rel=start;
            System.out.println("Deleted Node ->"+rel.data);
            start=rel.left;
            if(start!=null)
                rel.reight=null;
            System.out.println("List First Node SuccessFully Deleted ");
        }
    }

    void DeletedEndNodePosition()
    {
        Node tr,rel;
        if(start==null)
        {
            System.out.println("List Is Empty !");
        }
        else if(start.left==null)
        {
            rel=start;
            System.out.println("Deleted Node ->"+rel.data);
            start=null;
            System.out.println("List End Node SuccessFully Deleted ");
        }
        else
        {
            tr=start;
            while(tr.left!=null)
            {
               
                tr=tr.left;
            }
            rel=tr;
            System.out.println("Deleted Node ->"+rel.data);
            tr.reight.left=null;
            System.out.println("List End Node SuccessFully Deleted ");
        }
    }   

    @SuppressWarnings("resource")
    void DeletedNodeSpecifiedPosition()
    {
        Node tr,rel;
        int count=0,pos,i;
        if(start==null)
        {
            System.out.println("List Is Empty !");
        }
        else
        {
            tr=start;
            while(tr!=null)
            {
                count++;
                tr=tr.left;
            }
            if(count<=2)
            {
                System.out.println("List Is Empty ->");
            }
            else
            {
                System.out.println("Enter Position Deletion Node ! 2 to"+(count-1)+"->");
                Scanner sc =new Scanner(System.in);
                pos=sc.nextInt();
                if(pos<=1||count<=pos)
                {
                    System.out.println("Do'Not Valid Position");
                }
                else
                {
                    tr=start;
                    for(i=1;i<pos-1;i++)
                    {
                        tr=tr.left;
                    }
                    rel=tr.left;
                    System.out.println("Deleted Node ->"+rel.data);
                    tr.left=rel.left;
                    rel.left.reight=tr;
                    System.out.println("The %d Position Node   SuccessFully Deleted ."+pos);
                }
            }
        }
    }

    void TraverseNodeList()
    {
        if (start == null) {
            System.out.println("List Is Empty!");
        } else {
            Node current = start;
            System.out.println("List Is All Items ->");
            while (current != null) {
                System.out.println(current.data);
                current = current.left;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        while (true) {
            System.out.println("\n ***---------------Doubly linked List -------------------*** \n");
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
                    doublyLinkedList.InsertNodeFirstPosition();
                    break;
                case 2:
                    doublyLinkedList.InsertNodeEndPosition();
                    break;
                case 3:
                    doublyLinkedList.InsertNodeSpecifiedPosition();
                    break;
                case 4:
                    doublyLinkedList.DeletedFirstNodePosition();
                    break;
                case 5:
                    doublyLinkedList.DeletedEndNodePosition();
                    break;
                case 6:
                    doublyLinkedList.DeletedNodeSpecifiedPosition();
                    break;
                case 7:
                    doublyLinkedList.TraverseNodeList();
                    break;
                case 8:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Sorry || Invalid Choice.\n");
            }
        }
    }
}