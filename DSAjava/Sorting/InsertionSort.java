package DSAjava.Sorting;

import java.util.Scanner;

public class InsertionSort {
    public void insertsort(int []arr,int n)
    {
        int item=0,j;
        for(int i=1;i<n;i++)
        {
            item=arr[i];
            j=i-1;
            while(j>=0&&item<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=item;
        }
    }
    public static void main(String[] args) {
        InsertionSort is=new InsertionSort();
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

        is.insertsort(arr, n);

        System.out.println("Array Sorting");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
