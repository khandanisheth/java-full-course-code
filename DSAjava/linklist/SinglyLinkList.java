package DSAjava.linklist;

import java.util.Scanner;

public class SinglyLinkList {
    class Node {
        int data; // data
        Node link; // addresh
    }

    Node start = null; // strat pointer
    Scanner sc = new Scanner(System.in);

    Node creaNode() {
        Node temp = new Node();
        System.out.print("Enter Node Item => ");
        temp.data = sc.nextInt();
        temp.link = null;
        return temp;
    }

    void InsertBeginning() {
        Node n;
        n = creaNode();
        if (start == null) {
            start = n;
        } else {
            n.link = start;
            start = n;
        }
        System.out.println(" Insert Beginning Node Singliy Link List Node Is ->" + n.data);
    }

    void InsertEnd() {
        Node n, tr;
        n = creaNode();
        if (start == null) {
            start = n;
        }
        else{
            tr = start;
            while (tr.link != null) {
                tr = tr.link;
            }
            tr.link = n;
        }
        System.out.println(" Insert End Node Singliy Link List Node Is ->");
    }

    void InsertSpecifiedPosition()
    {
        Node tr,n;
        int count=0,pos,i;
        if(start==null)
        {
            InsertEnd();
            System.out.println("The List Is 2 Less Than Node.");
        }
        else
        {
            tr=start;
            while(tr!=null)
            {
                count++;
                tr=tr.link;
            }
            if(count<2)
            {
                InsertEnd();
                System.out.println("The List Is 2 Less Than Node.");
            }
            if(count>=2)
            {
                System.out.print("Enter Position Node Of 2 to " + count + " => ");
                pos=sc.nextInt();
                if(pos<=1||count<pos)
                {
                    System.out.println("Sorry || Please Valid Position.");
                }
                else
                {
                    tr=start;
                    n=creaNode();
                    for(i=1;i<pos-1;i++)
                    {
                        tr=tr.link;
                    }
                    n.link=tr.link;
                    tr.link=n;
                    System.out.println("New Node Successfully at Position " + pos + ".");
                }
            }
        }
    }

    void deleteFirstNodePosition() {
        Node remove;
        if (start == null) {
            System.out.println("Deletion is Not Possible List is Empty");
        } else {
            remove = start;
            System.out.println("Deleted Node -> " + remove.data);
            start = start.link;
            System.out.println("Deletion is Successfully First Node.");
        }
    }

    void deleteEndNodePosition() {
        Node tr = null, remove;
        if (start == null) {
            System.out.println("Deletion is Not Possible List is Empty");
        } else if (start.link == null) {
            remove = start;
            System.out.println("Deleted Node -> " + remove.data);
            start = null;
            System.out.println("Deletion is Successfully End Node.");
        } else {
            remove = start;
            while (remove.link != null) {
                tr = remove;
                remove = remove.link;
            }

            System.out.println("Deleted Node -> " + remove.data);
            tr.link = null;
            System.out.println("Deletion is Successfully End Node.");
        }
    }

    void deleteNodeSpecifiedPosition() {
        Node tr, n;
        int count = 0, pos, i;
        if (start == null) {
            System.out.println("Deletion is Not Possible List is Empty");
        } else {
            tr = start;
            while (tr != null) {
                count++;
                tr = tr.link;
            }
            if (count < 2) {
                System.out.println("Deletion is Not Possible List is 1 Node");
            } else {
                System.out.print("Enter Deletion Node Position Between 2 And " + count + " -> ");
                
                System.out.print("Enter Position -> ");
                
                pos = sc.nextInt();
                
                if (pos <= 1 && count <= pos) {
                    System.out.println(
                            "Sorry || InValid Position || Your Position " + pos + " Minimum(3) and Max (3++).");
                } else {
                    n = start;
                    for (i = 0; i < pos - 1; i++) {
                        tr = n;
                        n = n.link;
                    }
                    n = tr.link;
                    System.out.println("Deleted Item -> " + n.data);
                    tr.link = n.link;
                    System.out.println("Deletion Is Successfully Position -> " + pos);
                }
            }
        }
    }

    void Reverselist() {
        if (start == null || start.link == null) {
            System.out.println("List Is Do ' Not Reverselist");
        } else {
            Node prNod = start; //500
            Node currNode = start.link;
            while (currNode != null) {//1
                Node nextnode = currNode.link;//2
                currNode.link = prNod;//3

                // Update
                prNod = currNode;//4
                currNode = nextnode;//5
            }
            start.link = null;
            start = prNod;

            System.out.println("List Is Reverselist");
        }
    }

    void traverseNodeList() {
        Node tr;
        if (start == null)
            System.out.println("Sorry || List Is Empty.");
        else {
            tr = start;
            System.out.println("All List Node Item =>");
            while (tr != null) {
                System.out.print(tr.data + "\t");
                tr = tr.link;
            }
        }
    }

    public static void main(String[] args) {
        SinglyLinkList ll = new SinglyLinkList();
        
            int choice;
            while (true) {
                System.out.println("\nPress:");
                System.out.println("1. Insert Node First Position");
                System.out.println("2. Insert Node End Position");
                System.out.println("3. Insert Node Specified Position");
                System.out.println("4. Delete First Node Position");
                System.out.println("5. Delete End Node Position");
                System.out.println("6. Delete Node Specified Position");
                System.out.println("7. Linklist is Reverse ");
                System.out.println("8. Traverse Node List");
                System.out.println("9. Exit");
                System.out.print("Enter Your Choice => ");
                choice = ll.sc.nextInt();
                switch (choice) {
                    case 1:
                        ll.InsertBeginning();
                        break;
                    case 2:
                        ll.InsertEnd();
                        break;
                    case 3:
                        ll.InsertSpecifiedPosition();
                        break;
                    case 4:
                        ll.deleteFirstNodePosition();
                        break;
                    case 5:
                        ll.deleteEndNodePosition();
                        break;
                    case 6:
                        ll.deleteNodeSpecifiedPosition();
                        break;
                    case 7:
                        ll.Reverselist();
                        break;
                    case 8:
                        ll.traverseNodeList();
                        break;
                    case 9:
                    ll.sc.close();
                        System.exit(0);
                    default:
                        System.out.println("Sorry || Invalid Choice.");
                }
            }
        }
    
}
