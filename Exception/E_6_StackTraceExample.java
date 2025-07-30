package Exception;

public class E_6_StackTraceExample {
    public static void main(String[] args) {
        Student obj = new Student();
        System.out.println(obj); // `100` print karega

        int[] arr1 = { 10, 20, 30, 40, 50 };
        int[] arr2 = { 2, 5, 0, 10, 0 }; // Isme kuch elements zero hain

        for (int i = 0; i < arr1.length; i++) {
            int result = divide(arr1[i], arr2[i]); // `divede` ki jagah `divide`
            System.out.println("Result: " + result);
        }
    }

    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace(); // **Stack trace print karega**
            return -1;
        }
    }

}
