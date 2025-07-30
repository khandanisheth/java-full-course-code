package DSAjava.Tree;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeArr {

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    class BinaryTrees {
        int idx = -1;

        Node buildNode(int[] root) {// check root yes or no 
            idx++;
            if (root[idx] == -1) {
                return null;
            }

            Node newNode = new Node(root[idx]);
            newNode.left = buildNode(root);
            newNode.right = buildNode(root);
            return newNode;
        }
    }

    void preorder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }

    void Levelorder(Node node)
    {
        if(node==null)
        {
            return ;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        q.add(null);//Line Break
        while(!q.isEmpty())
        {
            Node currNode=q.remove();
            if(currNode==null)
            {
            System.out.println();

            if(q.isEmpty())
            {
                break;
            }
            else
            {
                q.add(null);
            }
            }
            else
            {
                System.out.print(currNode.data);
                if(currNode.left!=null)
                {
                    q.add(currNode.left);
                }
                if(currNode.right!=null)
                {
                    q.add(currNode.right);
                }
            }
        }
    }

    int CountodNode(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        int leftnode=CountodNode(node.left);
        int reightnode=CountodNode(node.right);
        return leftnode+reightnode+1;

    }

    int SumofNode(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        int sumleft=SumofNode(node.left);
        int sumreight=SumofNode(node.right);
        return sumleft+sumreight+node.data;
    }

    int HeightofTree(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        int leftheight=HeightofTree(node.left);
        int reightheight=HeightofTree(node.right);
        int Height=Math.max(leftheight, reightheight)+1;
        return Height;
    }

    int Dimeter(Node node)//Time Complexcity O(N2)
    {
        if(node==null)
        {
            return 0;
        }
        int dai1=Dimeter(node.left);
        int dai2=Dimeter(node.right);
        int dai3=HeightofTree(node.left)+HeightofTree(node.right)+1;
        return Math.max(dai3, Math.max(dai1, dai2));
    }

    class Daim
    {
        int ht;
        int daim;
        Daim(int ht,int daim)
        {
            this.ht=ht;
            this.daim=daim;
        }
    }

    Daim Daimeterfun(Node node)
    {
        if(node==null)
        {
            return new Daim(0, 0);
        }

        Daim left=Daimeterfun(node.left);
        Daim reight=Daimeterfun(node.right);
        int Height=Math.max(left.ht, reight.ht);

        int Daim1 = left.daim;
        int Daim2 = reight.daim;
        int Daim3 = left.ht + reight.ht + 1;

        int mydaim = Math.max(Math.max(Daim1, Daim2), Daim3);
 
        Daim may = new Daim(Height, mydaim);
        return may;
    }

    public static void main(String[] args) {
        BinaryTreeArr bt = new BinaryTreeArr();

        //int[] arr;
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter the number of nodes in the tree: ");
        //int n = sc.nextInt();
       // arr = new int[n];
        System.out.println("Enter the Tree Node values: ");
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, 8, -1, -1, 9, -1, -1};
        BinaryTreeArr.BinaryTrees BT = bt.new BinaryTrees();
        Node root = BT.buildNode(nodes);

        System.out.println("Press:");
        System.out.println("1. PreOrder Traversal");
        System.out.println("2. InOrder Traversal");
        System.out.println("3. PostOrder Traversal");
        System.out.println("4. Tree Of LevalOrder");
        System.out.println("5. Count Of Node Tree");
        System.out.println("6. Coun Of Node Of Sum Tree");
        System.out.println("7. Height Of Tree ->");
        System.out.println("8. Binery Tree Daimeter ->");
        System.out.println("9. Exit");
        System.out.print("Enter Your Choice -> ");

        int choice = sc.nextInt();
        while (true) {
            switch (choice) {
                case 1:
                    System.out.print("PreOrder Traversal: ");
                    bt.preorder(root);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("InOrder Traversal: ");
                    bt.inorder(root);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("PostOrder Traversal: ");
                    bt.postorder(root);
                    System.out.println();
                    break;
                case 4:
                    bt.Levelorder(root);
                    break;
                case 5:
                    System.out.println(bt.CountodNode(root));
                    break;
                case 6:
                    System.out.println(bt.SumofNode(root));
                    break;
                case 7:
                    System.out.println(bt.HeightofTree(root));
                case 8:
                    System.out.println(bt.Dimeter(root));
                case 9:
                    System.exit(0);
                default:
                    System.out.println("***************----------------Wrong Choice----------------*************");
            }
            System.out.print("Enter Your Choice -> ");
            choice = sc.nextInt();

            sc.close();
        }
        
    }
}
