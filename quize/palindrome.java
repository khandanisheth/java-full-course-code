
public class palindrome {
    public static void main(String [] args)
    {
        int pnum=151;
        int onum=pnum;
        int reverse=0,remendir;
        while(pnum!=0) // 1 !=0
        {
            remendir=pnum%10; //  1
            reverse = reverse*10+remendir;// 111
            pnum /=10;// 1
        }


        if(onum== reverse)
        {
            System.out.println("palindrome Yes ");
        }

        else
        {
            System.err.println("palindrome NO");
        }
    }
}
