public class HappYNumber  
{     
    //isHappyNumber() will determine whether a number is happy or not  
    public static int isHappyNumber(int num){  
        int rem = 0, sum = 0;  
          
        //Calculates the sum of squares of digits  100
        while(num > 0){  // 1
            rem = num%10;   //  0
            sum = sum + (rem*rem);   // 0
            num = num/10;  // 1
        }  
        return sum;  
    }  
      
    public static void main(String[] args) {  
        int num = 82;  // 1
        int result = num;  // 2
          
        while(result != 1 && result != 4){   // 3
            result = isHappyNumber(result);   // 4 68  100 
        }  
          
        //Happy number always ends with 1  
        if(result == 1)  
            System.out.println(num + " is a happy number");  
        //Unhappy number ends in a cycle of repeating numbers which contains 4  
        else if(result == 4)  
            System.out.println(num + " is not a happy number");     
    }  
}  