package DSAjava.linklist;

import java.util.Scanner;

public class CircularLinkedList {
    class Node{
        int data;
        Node link;
    }
    Scanner sc=new Scanner(System.in);
    Node last=null;
    Node creatNode()
    {
        Node temp=new Node();
        System.out.println("Enter Node Item ->");
        temp.data=sc.nextInt();
        temp.link=null;
        return temp;
    }
    void CircularInsertFirstNode()
    {
        Node n=creatNode();
        if(last==null)
        {
            last=n;
            last.link=n;
        }
        else
        {
            n.link=last.link;
            last.link=n;
        }
        System.out.println("New Node Is SuccessFully Insert Beginning Node Item -!");
    }
    void CircularInsertEndNode()
    {
        Node n=creatNode();
        if(last==null)
        {
            last=n;
            last.link=n;
        }
        else
        {
            n.link=last.link;
            last.link=n;
            last=n;
        }
        System.out.println("New Node Is SuccessFully Insert End Node Item -!");
    }
    void CircularInsertSpecifiedPositionNode()
    {
        Node tr,n;
        int count=0,i,pos;
        if(last==null)
        {
            CircularInsertEndNode();
        }
        else
        {
            tr=last;
            while(tr.link!=last)
            {
                count++;
                tr=tr.link;
            }
            if(count<2)
            {
                CircularInsertEndNode();
            }
            if(count>=2)
            {
                System.out.println("Enter Position This List ->");
                pos=sc.nextInt();
                if(pos<=1&&count<=pos)
                {
                    System.out.println("Position Is Un Valid ->");
                }
                else
                {
                    tr=last;
                    n=creatNode();
                    for(i=0;i<pos-1;i++)
                    {
                        tr=tr.link;
                    }
                    n.link=tr.link;
                    tr.link=n;
                    System.out.println("New Node SuccessFully At %d Position ."+pos);
                }
            }
        }
    }
    void CircularDeleteFirstNode()
    {
        Node rel;
        if(last==null)
        {
            System.out.println("Deletion is Not Possible");
        }
        else
        {
            rel=last.link;
            System.out.println("Deleted Node First -> "+rel.data);
            if(last==last.link)
            {
                last=null;
            }
            last.link=rel.link;
            System.out.println("First Node Delete SuccessFully Item -");
        }
    }
    void CircularDeletedEndNode()
    {
        Node rel,tr;
        if(last==null)
        {
            System.out.println("Deletion is Not Possible");
        }
        else
        {
            rel=last;
            System.out.println("Deleted Node End -> "+rel.data);
            if(last==last.link)
            {
                last=null;
            }
            else
            {
                tr=last.link;
                while(tr.link!=last)
                {
                    tr=tr.link;
                }
                tr.link=last.link;
                last=tr;
            }
        }
    }
    void CircularDeleteSpecifiedPositionNode()
    {
        Node tr,rel;
        int count=0,i,pos;
        if(last==null)
        {
            System.out.println("Deletion Is Not Possible");
        }
        else
        {
            tr=last;
            while(tr.link!=last)
            {
                count++;
                tr=tr.link;
            }
            if(count<=2)
            {
                System.out.println("Deletion Is Not Possible");
            }
            else
            {
                System.out.print("Enter Deletion Node Position Between 2 And " + (count - 1) + " -> ");
                System.out.println("Enter Postion ->");
                pos=sc.nextInt();
                if(pos<=1||count<=pos)
                {
                    System.out.println("Postion Is UnValid ->");
                }
                else
                {
                    rel=last;
                    for (i = 0; i < pos; i++) {
                        tr = rel;
                        rel = rel.link;
                    }
                    System.out.println("Deleted Item -> " + rel.data);
                    tr.link = rel.link;
                    rel = null; // Free the memory occupied by the deleted node
                    System.out.println("Deletion IS Successfully Position -> " + pos);
                }
            }
        }
    }
    void CircularTreverse()
    {
        Node tr;
        if(last==null)  
        {
            System.out.println("List Is Empty !");
        }
        else
        {
            tr=last.link;
            System.out.println("List Is All Item ->");
            do
            {
                System.out.print(tr.data+" ");
                tr=tr.link;
            }while(tr!=last.link);
        }
    }

    public static void main(String[] args) {
        int choice;
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        while (true) {
            System.out.println("\nPress:");
            System.out.println("1. Circular Insert First.");
            System.out.println("2. Circular Insert End Node.");
            System.out.println("3. Circular Insert Specified Position Node.");
            System.out.println("4. Circular Delete First.");
            System.out.println("5. Circular Delete End Node.");
            System.out.println("6. Circular Delete Specified Position Node.");
            System.out.println("7. Circular Traverse.");
            System.out.println("8. Exit.");
            System.out.print("Enter Your Choice => ");
            choice = circularLinkedList.sc.nextInt();

            switch (choice) {
                case 1:
                    circularLinkedList.CircularInsertFirstNode();
                    break;
                case 2:
                    circularLinkedList.CircularInsertEndNode();
                    break;
                case 3:
                    circularLinkedList.CircularInsertSpecifiedPositionNode();
                    break;
                case 4:
                    circularLinkedList.CircularDeleteFirstNode();
                    break;
                case 5:
                    circularLinkedList.CircularDeletedEndNode();
                    break;
                case 6:
                    circularLinkedList.CircularDeleteSpecifiedPositionNode();
                    break;
                case 7:
                    circularLinkedList.CircularTreverse();
                    break;
                case 8:
                    circularLinkedList.sc.close();
                    System.exit(0);
                default:
                    System.out.println("Sorry || Please Choice Is False -?\n");
            }
        }
    }
}