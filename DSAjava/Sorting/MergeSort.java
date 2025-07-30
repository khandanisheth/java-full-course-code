package DSAjava.Sorting;

import java.util.Scanner;

public class MergeSort {
    public void mergesort(int []arr,int si,int ei)
    {
        if(si<ei)
        {
            int mid=si+(ei-si)/2;
            mergesort(arr, si, mid);
            mergesort(arr,mid+1, ei);
            conquer(arr,si,mid,ei);
        }
    }
    public void conquer(int []arr,int si,int mid,int ei)
    {
        int []div=new int[ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid&&idx2<=ei)
        {
            if(arr[idx1]<=arr[idx2])
            {
                div[x++]=arr[idx1++];
            }
            else
            {
                div[x++]=arr[idx2++];
            }
        }
        while(idx1<=mid)
        {
            div[x++]=arr[idx1++];
        }
        while(idx2<=ei)
        {
            div[x++] = arr[idx2++];
        }
        for (int i = 0, j = si; i < div.length; i++, j++) {
            arr[j] = div[i];
        }
    }
    public static void main(String[] args) {
        MergeSort qs=new MergeSort();
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

        qs.mergesort(arr,0, n-1);

        System.out.println("Array Sorting");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
