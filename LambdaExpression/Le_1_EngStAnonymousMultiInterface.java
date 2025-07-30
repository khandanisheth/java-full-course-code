package LambdaExpression;

public class Le_1_EngStAnonymousMultiInterface {
    public static void main(String[] args) {
        Le_1_StudentMultiInterFace le_1_Student = new Le_1_StudentMultiInterFace() {
            // Implementing the abstract method 'abstrectFunUse'
            public void abstrectFunUse1() {
                System.out.println("This Is A Interface Class Method Abstract");
            }

            // Implementing another abstract method 'anotherAbstractFun'
            public void anotherAbstractFun1() {
                System.out.println("This is another abstract method.");
            }
        };

        // Calling the check method from the interface
        le_1_Student.check1(); // This will print "Hello Check"

        // Calling the implemented abstract method 'abstrectFunUse'
        le_1_Student.abstrectFunUse1(); // This will print "This Is A Interface Class Method Abstract"

        // Calling another implemented abstract method 'anotherAbstractFun'
        le_1_Student.anotherAbstractFun1(); // This will print "This is another abstract method."

        // Calling the static method from the interface
        Le_1_StudentMultiInterFace.stcheck1(); // This will print "Interface Is Running"
    }
}
