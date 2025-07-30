class OP_3_Operators {
  public static void main(String[] args) {
    int a = 7;
    int b = 89;
    // here = is a assignment operator.
    System.out.println(a + b);
    // add then assign.
    int a1 = 1234;
    a1 += 10;
    System.out.println(a1);
    // devide 100 by 2 and assign.
    a1 /= 2;
    System.out.println("Quotient : " + a1);
    // get module deviding 50 by 11 then assign.
    a1 %= 10;
    System.out.println("Modulas : " + a1);
    /* vJava Incrementing-Decrementing Operators */
    ++a;
    System.out.println("before increment : " + a);
    a++;
    System.out.println("After increment : " + a);
    // decrement by 1
    a--;
    System.out.println("After decrement : " + a);
    
  }
}