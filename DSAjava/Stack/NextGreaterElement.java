package DSAjava.Stack;
public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 10, 8};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int nextGreater = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    nextGreater = arr[j];
                    break;
                }
            }
            System.out.println(arr[i] + " → " + nextGreater);
        }
    }
}
