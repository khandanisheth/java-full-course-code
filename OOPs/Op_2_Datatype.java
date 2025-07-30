
public class Op_2_Datatype {
  public static void main(String[] args) {
    int int_var = 1234567899;
    boolean bool_var = true;
    char char_var = 'A';
    float float_var = 3.123456789f;
    double blr = 34;
    byte byte_var = 125;
    long long_var = 52697235;
    short short_var = 55;

    // now print them.
    System.out.println("Integer value : " + int_var);
    System.out.println("Boolean value : " + bool_var);
    System.out.println("Character value : " + char_var);
    System.out.println("Float value : " + float_var);
    System.out.println("Byte value : " + byte_var);
    System.out.println("double value : " + blr);
    System.out.println("long value : " + long_var * 2);
    System.out.println("short_var value : " + short_var * 2);
    /*
     * हालाँकि अगर आप ASCII values से familiar हैं तो आप किसी character value की
     * ASCII भी assign कर सकते हैं।
     */
    // * link => https://www.javatpoint.com/java-ascii-table */
    // define char variables with ASCII value.
    char char_var1 = 67, char_var2 = 72, char_var3 = 74;
    System.out.println(char_var1);
    System.out.println(char_var2);
    System.out.println(char_var3);
  }
}