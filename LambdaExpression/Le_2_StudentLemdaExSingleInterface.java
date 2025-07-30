package LambdaExpression;

public interface Le_2_StudentLemdaExSingleInterface {
    void abstrectFunUseLem2(); // Abstract method

    default void check2() { // Default method
        System.out.println("Hello Check");
    }

    static void stcheck2() { // Static method
        System.out.println("Interface Is Running");
    }
}
