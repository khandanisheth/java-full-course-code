public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;
        
        int i = 0; // Pointer to track unique elements
        
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) { // New unique element found
                i++;
                arr[i] = arr[j]; // Update position
            }
        }
        
        return i + 1; // New length of the array
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3};
        int newLength = removeDuplicates(arr);
        
        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
