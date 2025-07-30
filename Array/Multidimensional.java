package Array;
public class Multidimensional{
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{2,4,5},{4,4,5}};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
// public class Multidimensional {
//     public static void main(String[] args) {
//         int arr[][] = {{1, 2}, {2, 1}, {9, 8}, {8, 9}};
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println(); // Add a new line after each row
//         }
//     }
// }
