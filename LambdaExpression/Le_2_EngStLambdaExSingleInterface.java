package LambdaExpression;

public class Le_2_EngStLambdaExSingleInterface {
    public static void main(String[] args) {
        // Using Lambda Expression to implement 'abstrectFunUse' method
        Le_2_StudentLemdaExSingleInterface le_1_Student = () -> System.out
                .println("This is a lambda expression for abstrectFunUse");

        // Calling the implemented lambda expression method
        le_1_Student.abstrectFunUseLem2(); // This will print "This is a lambda expression for abstrectFunUse"

        // Calling the default 'check' method from the interface
        le_1_Student.check2(); // This will print "Hello Check"

        // Calling the static method from the interface
        Le_2_StudentLemdaExSingleInterface.stcheck2(); // This will print "Interface Is Running"
    }
}
/* 
 * Lambda Expression for Functional Interface:
 * Lambda expression sirf un interfaces ke liye kaam karta hai jo functional
 * interfaces ho, yaani unmein ek hi abstract method hona chahiye.
 * 
 * 
 * Multiple Abstract Methods:
 * Aapke Le_1_Student interface mein multiple abstract methods hain
 * (abstrectFunUse() aur anotherAbstractFun()). Lambda expression ko ek
 * functional interface ke liye hi use kiya ja sakta hai, jisme sirf ek abstract
 * method ho.
 */

// Lambda expression ko aap functional interfaces, streams, method references,
// event handlers, aur concurrency (jaise threads) ke saath use kar sakte hain.
// Ye aapko concise aur efficient code likhne mein madad karta hai.