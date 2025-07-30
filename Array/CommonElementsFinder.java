package Array;
public class CommonElementsFinder {
    public static void main(String[] args) {
        int a[] = {1, 7, 9, 8, 4, 5};
        int b[] = {3, 8, 7, 4, 9, 6};
        int commonElements[];  // Array to store the common elements
        
        int maxSize = Math.min(a.length, b.length);
        commonElements = new int[maxSize];  // Initialize the common elements array
        
        int count = 0;  // Counter to keep track of the number of common elements
        
        // Compare elements of arrays a and b
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    commonElements[count] = a[i];
                    count++;
                    break;  // Exit the inner loop after finding a common element
                }
            }
        }
        
        // Print the common elements
        System.out.println("Common elements:");
        for (int k = 0; k < count; k++) {
            System.out.println(commonElements[k]);
        }
    }
}
