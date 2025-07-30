package Array;
import java.util.Scanner;

public class MissingArrElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Arrray CapaCity ->");
        int z=0,y=0;
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter item 1 to Capacity But Capacity Do Not Above And Any Item Any Time-> ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
            
        }// 12 345678911

        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
            z+=arr[i];
        }
        System.out.println(size);
        int math=arr.length+1;
        System.out.println("gg---->"+math);
        int x=math*(math+1)/2;//11*(11+1)/2
        System.out.println("xxx---"+x);
        System.out.println("zzz---"+z);
        y=x-z;
        System.out.println("Missing Element ->"+y);
        sc.close();
    }
}
