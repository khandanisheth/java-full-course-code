package Array;
public class ArrayReverser {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        // Print the original array
        System.out.println("Original array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int start=arr.length;;
        System.out.print("\n\n ");
        for(int i=start-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}