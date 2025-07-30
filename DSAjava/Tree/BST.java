package DSAjava.Tree;

public class BST {
    class Node
    {
        int data;
        Node left,reight;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.reight=null;
        }
    }

    /* 1. Insert Time complexity: O(log n)  */
    Node Insertdata(Node node,int val)
    {
        if(node==null)
        {
            node=new Node(val);
            return node;
        }
        if(node.data>val)
        {
            node.left=Insertdata(node.left, val);
        }
        else
        {
            node.reight=Insertdata(node.reight, val);
        }
        return node;
    }

    void Inorder(Node node)
    {
        if(node!=null)
        {
            Inorder(node.left);
            System.out.print(node.data+"\t");
            Inorder(node.reight);
        }
    }
     /* Insert Time complexity: O(log n)  */


    /* 2. Searc Time complexity: O(log n)  */
    boolean Search(Node node,int val)
    {
        if(node==null)
        {
            return false;
        }
        if(node.data>val)
        {
            return Search(node.left, val);
        }
        else if(node.data==val)
        {
            return true;
        }
        else
        {
            return Search(node.reight, val);
        }
    }
    /* Searc Time complexity: O(log n)  */

    /* 3. Delete Time complexity: O(log n)  */

    Node Delete(Node node,int val)
    {
        if(node.data>val)
        {
             node.left=Delete(node.left, val);
        }
        else if(node.data<val)
        {
         node.reight=Delete(node.reight, val);
        }
        else
        {
            //case 1 leaf Node Deleted 
            if(node.left==null&&node.reight==null)
            {
                return null;
            }
            //case 2 :  1 Childer delettede 
            if(node.left==null)
            {
                return node.reight;
            }
            if(node.reight==null)
            {
                return node.left;
            }

            //case 3 : Both childe 
            Node icc=inordercese(node.reight);
            node.data=icc.data;
            node.reight=Delete(node.reight,icc.data);
        }
        return node;
    }
    Node inordercese(Node node)
    {
        while(node.left==null)
        {
            node=node.left;
        }
        return node;
    }
    /* Delete Time complexity: O(log n)  */

    /* 4. Node x TO Node Y REnge  */
    void renge(Node node,int x,int y)
    {
        if(node==null)
        {
            return;
        }
        if(node.data>=x && node.data<=y)
        {
            renge(node.left, x, y);
            System.out.print      (node.data+" -> ");
            renge(node.reight, x, y);
        }
        else if(node.data>=y)
        {
            renge(node.left, x, y);
        }
        else
        {
            renge(node.reight, x, y);
        }
    }
    public static void main(String[] args) {
        BST bst=new BST();
        int arr[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i<arr.length;i++)
        {
            root=bst.Insertdata(root, arr[i]);
        }
        bst.Inorder(root);
        System.out.println();
        if(bst.Search(root, 6))
        {
            System.out.println("Search is SuccessFully Search Item");
        }
        else
        {
            System.out.println("Search Is UnSuccessFully");
        }
        
        bst.Delete(root, 1);
        bst.Inorder(root);
        System.out.println();
        bst.renge(root, 8, 11);
    }
}
