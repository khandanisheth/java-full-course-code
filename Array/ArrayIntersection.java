package Array;
public class ArrayIntersection {
    public static void main(String[] args) {
        int a[] = { 1, 7, 9, 8, 4, 5 };
        int b[] = { 3, 8, 7, 4, 9, 6 };
        int n = Math.min(a.length, b.length);
        int commanarr[] = new int[n];
        int commonIndex = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] == b[j]) {
                    commanarr[commonIndex] = a[i];
                    commonIndex++;
                }
            }
        }

        for (int i = 0; i < commonIndex; i++) {
            System.out.println(commanarr[i]);
        }
    }
}
/*
 * Java advantages of array
 * Code Optimization (less code)
 * Random Access
 * Easy to traverse data
 * Easy to manage data
 * Easy to understand.
 */