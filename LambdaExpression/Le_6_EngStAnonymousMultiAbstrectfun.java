package LambdaExpression;

public class Le_6_EngStAnonymousMultiAbstrectfun extends Le_6_StudentMultiAbstrect {
    public static void main(String[] args) {
        // Anonymous class implementing abstract methods
        Le_6_StudentMultiAbstrect ll = new Le_6_StudentMultiAbstrect() {
            @Override
            public void st6() { 
                System.out.println("st6() method implemented");
            }

            @Override
            void stfun6() {
                System.out.println("stfun6() method implemented");
            }
        };
        // Calling the methods
        ll.st6();
        ll.stfun6();

        // Accessing the public field
        ll.publicField = 10;
        ll.defaultField = 100;
        ll.protectedField = 1000;
        System.out.println("Public Field: " + ll.publicField);
        System.out.println("default Field: " + ll.defaultField);
        System.out.println("protected Field: " + ll.protectedField);
        // Calling the public method
        ll.publicMethod();
        ll.defaultMethod();
        ll.protectedMethod();
        Le_6_StudentMultiAbstrect.staticMethod();

        System.out.println("\n\nYha se Extends Kar Output he ");

        Le_6_EngStAnonymousMultiAbstrectfun.staticMethod();

        Le_6_EngStAnonymousMultiAbstrectfun lll = new Le_6_EngStAnonymousMultiAbstrectfun();
        lll.st6();
        lll.stfun6();

        // Accessing the public field
        lll.publicField = 20;
        lll.defaultField = 200;
        lll.protectedField = 2000;
        System.out.println("Public Field: " + lll.publicField);
        System.out.println("default Field: " + lll.defaultField);
        System.out.println("protected Field: " + lll.protectedField);
        // Calling the public method
        ll.publicMethod();
        ll.defaultMethod();
        ll.protectedMethod();
        Le_6_StudentMultiAbstrect.staticMethod();

    }

    @Override
    public void st6() {// kyo ki mene ye us class me public se difine kiya he he tho public se cal karnge 
        // TODO Auto-generated method stub
        System.out.println("st6() method implemented");
    }

    @Override
    void stfun6() {
        // TODO Auto-generated method stub
        System.out.println("stfun6() method implemented");
    }

}
