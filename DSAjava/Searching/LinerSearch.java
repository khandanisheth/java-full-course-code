package DSAjava.Searching;
import java.util.*;
public class LinerSearch {
    Scanner sc=new Scanner(System.in);
    LinerSearch(int []arr,int n)
    {
        int item;
        int flag=0;
        System.out.println("Enter Search item->");
        item=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(item==arr[i])
            {
                System.out.println("Search Is SuccessFully This Position"+i+"And Item ->"+item); 
                flag=1;
            } 
        }
        if(flag==0)
        {
            System.out.println("Search is UnSuccessFull");
        }
        else
        {
            System.out.println("Search Is SuccessFully This Position And Item ->"+item); 
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr;
        System.out.println("Enter Array Capacity ->");
        int n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter Arrar Item This Position 0 to->"+n);
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        new LinerSearch(arr,n);
        sc.close();
    }
}
