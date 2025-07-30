import java.util.*;
public class sterprint 
{
    // Pattern 1: Decreasing asterisks
    static void Increasing(int s)
    {
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                if(i>j)
                {
                    System.out.print("*");
                }
            }
             System.out.print("\n");
        }
    }
     // Pattern 2: Increasing spaces and Decreasing asterisks
    static void Decreasing(int s)
    {
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < s; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Pattern 3:Pyramid  Pattern 
    static void Pyramid(int s)
    {
        for (int i = 1; i <= s; i++) {
            // Print spaces
            for (int j = 1; j <= s - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void Pyramidloweruper(int x)
    {
        
        // Upper half of the star pattern
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower half of the star pattern
        for (int m = 1; m <= x; m++) {
            for (int n = 1; n < m; n++) {
                System.out.print(" ");
            }
            for (int o = 1; o <= x + 1 - m; o++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    } 
    public static void main(String[] args) 
    {

        System.out.println("Press \n Pattern 1: Increasing asterisks niche \n Pattern 2: Increasing spaces and Decreasing asterisks");
        System.out.println(" Pattern 3:Pyramid  Pattern \n Pattern 4:Pyramid  Pattern Lower and Upper");
        System.out.println("Enter Your Choice -> ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int s=0;

        System.out.println("Enetr Number of Star ->");
        s=sc.nextInt();
        switch (key) {
            case 1:
                Increasing(s);
                break;
            case 2:
                Decreasing(s);
                break;
            case 3:
                Pyramid(s);
                break;
            case 4:
                Pyramidloweruper(s);
                break;
            default:
                System.out.println("/n Choice Is Invalid \n");
                break;
        }
        sc.close();
    
    }
}
/* 
 Pattern 1:Increasing asterisks niche
 * 1.if(i>j)
*
**
***
****
*****
******
1        
22       
333      
4444     
55555    
666666   
7777777  
88888888 
999999999
0
01
012
0123
01234
012345
0123456
01234567
012345678


2 if(i<j)
*********
******** 
*******  
******   
*****    
****     
***      
**       
*    
123456789
23456789 
3456789  
456789   
56789    
6789     
789      
89       
9    

000000000
11111111 
2222222  
333333   
44444    
5555     
666      
77       
8 




Pattern 2: Increasing spaces and Decreasing asterisks


0123456789
 123456789
  23456789
   3456789
    456789
     56789
      6789
       789
        89
         9


0000000000
 111111111
  22222222
   3333333
    444444
     55555
      6666
       777
        88
         9

**********
 *********
  ********
   *******
    ******
     *****
      ****
       ***
        **
         *
         


Pattern 3:Pyramid  Pattern  

         *    
        ***   
       *****  
      ******* 
     *********
    ***********
   *************
  ***************
 *****************
*******************

         1
        222
       33333
      4444444
     555555555
    66666666666
   7777777777777
  888888888888888
 99999999999999999
10101010101010101010



Pattern 4:Pyramid  Pattern Lower and Upper
   *    
  * *   
 * * *  
* * * * 
* * * *
 * * *
  * *
   *
 */