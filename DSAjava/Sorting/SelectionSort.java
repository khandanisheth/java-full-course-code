package DSAjava.Sorting;

import java.util.Scanner;

public class SelectionSort {
    SelectionSort(int []arr,int n)
    {
        int loc,temp;
        for(int k=0;k<n-1;k++)
        {
            loc=min(arr,k,n);
            temp=arr[k];
            arr[k]=arr[loc];
            arr[loc]=temp;
        }
    }

    public int min(int []arr,int k,int n){
        int minimum=arr[k];
        int j,loc=k;
        for(j=k+1;j<n;j++)
        {
            if(minimum>arr[j]){
                minimum=arr[j];
                loc=j;
            }
        }
        return (loc);
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

        new SelectionSort(arr, n);

        System.out.println("Array Sorting");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
