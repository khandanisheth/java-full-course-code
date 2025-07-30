package DSAjava.Sorting;
import java.util.Scanner;
public class BubbleSort {
    BubbleSort(int []arr,int n)
    {
        int item;
        for(int pass=0;pass<n-1;pass++)
        {
            for(int j=0;j<n-pass-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    item=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=item;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr;
        System.out.println("Enter Array Capacity ->");
        int n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter Array Item ->");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array UnSorting");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

        new BubbleSort(arr, n);

        System.out.println("Array Sorting");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

        sc.close();
    }    
}
