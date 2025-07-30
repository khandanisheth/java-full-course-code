package LambdaExpression;

 interface Le_1_StudentMultiInterFace {
    void abstrectFunUse1(); // Abstract method

    void anotherAbstractFun1(); // Another abstract method

    default void check1() { // Default method
        System.out.println("Hello Check");
    }

    static void stcheck1() { // Static method
        System.out.println("Interface Is Running");
    }
}
