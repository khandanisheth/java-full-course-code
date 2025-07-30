// Outer class
class Outer {
    @SuppressWarnings("unused")
    private int outerField;

    // Inner class
    class Inner {
        void innerMethod() {
            outerField = 10; // Inner class can access outer class fields
            System.out.println("Inner method");
        }
    }
}

// Sub-class
class SuperClass {
    protected void superClassMethod() {
        System.out.println("Super class method");
    }
}
// Super-class
class SubClass extends SuperClass {
    void subClassMethod() {
        superClassMethod(); // Sub-class can access protected method of super class
        System.out.println("Sub class method");
    }
}

 class Op_14_innerandSub_Class{
    public static void main(String[] args) {
        // Inner class example
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.innerMethod();

        // Sub-class example
        SubClass subClass = new SubClass();
        subClass.subClassMethod();
    }
}
