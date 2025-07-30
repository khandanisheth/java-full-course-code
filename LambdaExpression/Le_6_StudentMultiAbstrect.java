package LambdaExpression;

 abstract class Le_6_StudentMultiAbstrect {
    public abstract void st6();
    abstract void stfun6();

    public int publicField;
    protected int protectedField;
    int defaultField;

    public void publicMethod() {
        System.out.println("Public method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    void defaultMethod() {
        System.out.println("Default method");
    }
    static void staticMethod()
    {
        System.out.println("Static method");
    }
}
