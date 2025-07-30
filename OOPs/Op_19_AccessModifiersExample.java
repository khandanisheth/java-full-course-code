// AccessModifiersExample.java
 class AccessModifiersExample {
    public int publicField;
    protected int protectedField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("Public method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    void defaultMethod() {
        System.out.println("Default method");
    }

    private void privateMethod() {
        System.out.println("Private method");
    }

    public static void main(String[] args) {
        AccessModifiersExample example = new AccessModifiersExample();

        example.publicField = 10;
        example.protectedField = 20;
        example.defaultField = 30;
        example.privateField = 40;

        System.out.println("Public field: " + example.publicField);
        System.out.println("Protected field: " + example.protectedField);
        System.out.println("Default field: " + example.defaultField);
        System.out.println("Private field: " + example.privateField);

        example.publicMethod();
        example.protectedMethod();
        example.defaultMethod();
        example.privateMethod();
    }
}
