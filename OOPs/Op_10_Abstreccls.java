abstract class Example {
    Example() {  
        System.out.println("Abstract Class Constructor");
    }
}

class SubExample extends Example {
    SubExample() {
        System.out.println("Child Class Constructor");
    }
}

public class Op_10_Abstreccls{
    public static void main(String[] args) {
     new SubExample(); // Abstract class ka constructor subclass ke through call hoga
    }
}
