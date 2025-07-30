package Array;
import java.util.Arrays;

public class ArrSort
{
    public static void main(String[] args) {
        int[] arr=new int[]{9,8,6,4,1,2,7,5,3};

        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
}