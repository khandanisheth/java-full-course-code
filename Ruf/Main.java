// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

public class Main {
    static int r=-1;
    static int f=-1;
    public static void enQueue(int []arr,int n,Scanner sc)
    {
        if((r+1)%n==f)
        {
            System.out.println("Over"); 
        }
        else{
            System.out.print("Enter Queue Item -> ");
            int item = sc.nextInt();
            r=(r+1)%n;
            arr[r]=item;
            if(f==-1)
            {
                f=0;
            }
        }
    }

    public static void deQueue(int []arr,int n)
    {
        if((r+1)%2==f)
        {
            System.out.println("Under"); 
        }
        else{
           int item=arr[f];
           System.out.println(item);
           if(f==r)
           {
            f=r=-1;
           }
           else
           {
            f=(f+1)%n;
           }
        }
    }

    public static void de(int []arr,int n)
    {
        if(f==-1)
        {
            System.out.println("Under"); 
        }
        else{
            int i = f;
            while (true) {
                System.out.print(arr[i] + " ");
                if (i == r) break;
                i = (i + 1) % n;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       
    }
}