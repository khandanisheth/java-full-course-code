package Exception;

import java.util.ArrayList;

public class E_4_TryCatch{
    public static void main(String[] args) {
        
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {2, 5, 0, 10, 0}; // Isme kuch elements zero hain
        ArrayList<Double> resultList = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            Double result = divede((double) arr1[i], (double) arr2[i]); // Convert int to double
            System.out.println(result);
            resultList.add(result);
        }
        // Output the result
        System.out.println("Division Result: " + resultList);
    }
    public static Double divede(Double a, Double b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
            return -.0; 
        }
    }
}
