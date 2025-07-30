package Array;
public class ArrayMerger {
    public static void main(String[] args) {
        int arr[] = {4, 9, 8, 3, 6, 7, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int evenarr[];
        int oddarr[];
        int evenoddarr[];
        int n = arr.length;// l
        evenarr = new int[n];
        oddarr = new int[n];
        evenoddarr = new int[n];
        int i, o = 0, e = 0,sumeven = 0, oddsum = 0, evenoddarrsum = 0;

        for (i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenarr[e] = arr[i];
                sumeven += arr[i];
                e++;
            } else {
                oddarr[o] = arr[i];
                oddsum += arr[i];
                o++;
            }
        }

        /* Even Array Element Number */
        System.out.println("Even Array Element Number:");
        for (i = 0; i < e; i++) {
            System.out.print(evenarr[i] + " ");
        }
        System.out.println("Array Even Sum: " + sumeven);

        /* Odd Array Element Number */
        System.out.println("\nODD Array Element Number:");
        for (i = 0; i < o; i++) {
            System.out.print(oddarr[i] + " ");
        }
        System.out.println("Array Odd Sum: " + oddsum);

        System.out.println("\n\nTotal Array Merge Single Array First Even And Odd:");
        for (i = 0; i < e; i++) {
            evenoddarr[i] = evenarr[i];
        }
        for (i = 0; i < o; i++) {
            evenoddarr[i + e] = oddarr[i];
        }

        for (i = 0; i < o + e; i++) {
            evenoddarrsum+=evenoddarr[i];
            System.out.print(evenoddarr[i] + " ");
        }
        System.out.print("Array All Sum: " + evenoddarrsum);
    }
}
