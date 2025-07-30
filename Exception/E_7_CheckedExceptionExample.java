package Exception;

import java.io.*;

public class E_7_CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("test.txt"); // Checked Exception
            BufferedReader br = new BufferedReader(file);
            System.out.println(br.readLine());
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found! " + e);
        } catch (IOException e) {
            System.out.println("Error: Cannot read file! " + e);
        }
    }
}
/*
 * 2. Checked Exceptions (Handled at Compile-Time)
 * Kya hoti hain?
 * Ye exceptional conditions hoti hain jo compile-time pe check hoti hain, par
 * agar properly handle ki jayein (try-catch ya throws) to code compile ho jata
 * hai.
 */