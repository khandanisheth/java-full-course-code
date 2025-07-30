package Array;
class fact{
    // Constector me return type nhi hota he 
  public static int ffact(int f)
    {
         if(f==0)
        {
            return 1;
        }
        else
        {
            return f*ffact(f-1);
        }
    }
}

public class factoreal {
     public static void main(String[] args) {
        //fact f=new fact();
        System.out.println( fact.ffact(5));
    }
    
}


