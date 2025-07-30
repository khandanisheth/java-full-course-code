// ✅ Unchecked Exceptions Ki Pehchaan:
// ✔️ Compile-Time pe error nahi dete.
// ✔️ RuntimeException class ya uske subclasses se extend hote hain.
// ✔️ Agar exception aayegi to program crash ho sakta hai.
// ✔️ Inhe handle karna optional hota hai (try-catch laga sakte hain, par zaroori nahi).
package Exception;

public class E_8_UncheckedExceptions{
    public static void main(String[] args)throws Exception{
        try {
            int a = 10, b = 0;
            int result = a / b; // ❌ Unchecked Exception
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            throw new ArithmeticException(
                "Error"
            );
        }
        System.out.println("Program executed successfully!");
    }
}
