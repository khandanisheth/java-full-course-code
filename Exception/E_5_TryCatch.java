package Exception;

public class E_5_TryCatch {
    public static void main(String[] args) {
        Student obj = new Student();
        /*
         * Kya Ho Raha Hai?
         * Student obj = new Student(); → Object create ho raha hai.
         * System.out.println(obj);
         * Java internally call karta hai → obj.toString()
         * Tumhare override wale toString() me return String.valueOf(a); hai.
         * a = 100 hai, to String.valueOf(100) "100" return karega.
         * "100" print hoga.
         */
        System.out.println(obj);// This is Check Ki ese kese java.lang.ArithmeticException: / by zero = print
                                // kara

        int[] arr1 = { 10, 20, 30, 40, 50 };
        int[] arr2 = { 2, 5, 0, 10, 0 }; // Isme kuch elements zero hain

        for (int i = 0; i < arr1.length; i++) {
            int result = divede(arr1[i], arr2[i]); // Convert int to double
            System.out.println(result);
        }
    }

    public static int divede(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
            return -1;
        }
    }
}
