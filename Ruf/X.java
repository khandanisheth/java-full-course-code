import java.util.*;
import java.io.*;

public class X {
    public static int[] copyAndReverse(int[] arr, int n) {
        int[] COPY_ARR = new int[n];
        int j = 0;
        for (int i = n - 1; i >= 0; i--) {
            COPY_ARR[j] = arr[i];
            j++;
        }

        return COPY_ARR;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
        copyAndReverse(arr, n);
        // Reverse array ko store karein
        int[] reversedArr = copyAndReverse(arr, n);

        // Reverse array print karein
        for (int i = 0; i < n; i++) {
            System.out.print(reversedArr[i] + " ");
        }
    }
}
