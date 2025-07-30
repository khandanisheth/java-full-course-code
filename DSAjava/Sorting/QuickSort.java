package DSAjava.Sorting;

import java.util.Scanner;

/* 
 * 1.Pivit
 * 2PArtion
 */

public class QuickSort {
    public void quicksor(int []arr,int si,int ei)
    {
        if(si<ei)
        {
            int pivit=partition(arr,si,ei);
            quicksor(arr,si,pivit-1);
            quicksor(arr,pivit+1,ei);
        }
    }

    public int partition(int []arr,int si,int ei)
    {
        int pivit=arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++)
        {
            if(arr[j]<pivit)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[ei];
        arr[ei]=temp;
        return i;

    }
    public static void main(String[] args) {
        QuickSort qs=new QuickSort();
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

        qs.quicksor(arr,0, n-1);

        System.out.println("Array Sorting");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }   
}
