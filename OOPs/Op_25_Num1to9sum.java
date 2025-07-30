public class Op_25_Num1to9sum {
     Op_25_Num1to9sum(int n)
    {
        int sum=0,sum1=0,tsum=0;
        for(int i=0;i<=10;i++)
        {
           
                tsum=tsum+n%10;
            


            if(n%2==0)
            {//Even sum
                sum=sum+n%10;
            }
            else
            {//odd sum 
                sum1=sum1+n%10;
            }
            n/=10;
        }
        System.out.println("Total sum ->"+tsum);
        System.out.println("Even sum ->"+sum);
        System.out.println("Odd sum ->"+sum1);
    }
    public static void main(String[] args) 
    {
        int s=123456789;
        new Op_25_Num1to9sum(s);
    }
}
