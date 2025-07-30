package DSAjava;
import java.util.Scanner;

public class Deletion_3 {
    public static void delete(int arr[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            int pos,item;
            System.out.println("Enter Array Deleted (1)position->");
            pos=sc.nextInt();
            item=arr[pos];
            System.out.println("Dleted Item This ->"+item);
            for(int i=pos;i<arr.length-1;i++)
            {
                arr[i]=arr[i+1];
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={8,5,6,4,6,22,11,24};
        System.out.print("Array All Element ->\n");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        } 
        System.out.println("\n");
        delete(arr);
        System.out.println("\n Array delete After Elelment ->");
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
