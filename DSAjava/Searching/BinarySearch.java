package DSAjava.Searching;
import java.util.Scanner;

public class BinarySearch 
{
    public static int binarySearch(int[] arr, int n, int item) {
        int lb = 0;
        int ub = n - 1;
        while (ub >= lb) {
            int mid = lb + (ub - lb) / 2;
            if (item == arr[mid]) {
                System.out.printf("Element Successfully Found at Index: %d => %d\n", mid, item);
                return 1;
            } else if (item > arr[mid]) {
                lb = mid + 1;
            } else {
                ub = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Capacity => ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter Array Elements =>");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Elements =>");
        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d] => %d\n", i, arr[i]);
        }

        System.out.print("Enter Item for Search => ");
        int item = sc.nextInt();

        int flag = binarySearch(arr, n, item);

        if (flag == 0) {
            System.out.println("Search Unsuccessful");
        } else {
            System.out.println("Search Successful");
        }
        sc.close();
    }
}
