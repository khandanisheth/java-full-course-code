package DSAjava;


import java.util.Scanner;

public class ArrayInsertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Array Capacity -> ");
        int n = sc.nextInt();
        
        int[] arr = new int[n + 1]; // Extra space for insertion
        
        System.out.println("Enter Array Elements -> ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Before Insertion Array Elements -> ");
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "] -> " + arr[i]);
        }
        
        insert(arr, n, sc);
        
        System.out.println("After Insertion Array Elements -> ");
        for (int i = 0; i <= n; i++) {
            System.out.println("arr[" + i + "] -> " + arr[i]);
        }
        
        sc.close();
    }
    
    public static void insert(int[] arr, int n, Scanner sc) {
        System.out.println("Enter Position and Item -> ");
        int pos = sc.nextInt();
        int item = sc.nextInt();
        
        if (pos < 0 || pos > n) {
            System.out.println("Invalid Position!");
            return;
        }
        
        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = item;
    }
}