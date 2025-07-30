

public class Op_9_NonStatic{
    // 1️⃣ Static variable (shared among all objects)
    static String staticMessage = "This is a static property.";
    // 2️⃣ Non-static variable (separate for each object)
    String nonStaticMessage = "This is a non-static property.";

    // 3️⃣ Static method
    static void staticMethod() {
        System.out.println("Inside static method.");
    }

    // 4️⃣ Non-static method
    void nonStaticMethod() {
        System.out.println("Inside non-static method.");
    }

    // 5️⃣ Accessing Static Members Inside Non-Static Method
    void accessStaticFromNonStatic() {
        System.out.println("👉 Accessing Static Members Inside Non-Static Method:");
        // ✅ Static members can be accessed directly
        System.out.println(staticMessage); // Direct access
        staticMethod(); // Direct access
        // ✅ OR using class name
        System.out.println(Op_9_NonStatic.staticMessage);
        Op_9_NonStatic.staticMethod();
    }

    // 6️⃣ Accessing Non-Static Members Inside Static Method
    static void accessNonStaticFromStatic() {
        System.out.println("\n👉 Accessing Non-Static Members Inside Static Method:");
        // ❌ Non-static members CANNOT be accessed directly inside a static method
        // System.out.println(nonStaticMessage); // This will give an error
        // ✅ We need to create an object of class Op_9_NonStatic
        Op_9_NonStatic obj = new Op_9_NonStatic();
        System.out.println(obj.nonStaticMessage); // Accessing via object
        obj.nonStaticMethod(); // Calling non-static method via object
    }

    // 7️⃣ Accessing Non-Static Members Inside Non-Static Method
    void accessNonStaticFromNonStatic() {
        System.out.println("\n👉 Accessing Non-Static Members Inside Non-Static Method:");
        // ✅ Using simple
        System.out.println(nonStaticMessage);
        nonStaticMethod();

        // ✅ Using object
        Op_9_NonStatic obj = new Op_9_NonStatic();
        System.out.println(obj.nonStaticMessage);
        obj.nonStaticMethod();
        // ✅ Using "this" keyword (Recommended for Clarity)
        System.out.println(this.nonStaticMessage);
        this.nonStaticMethod();
    }

    // Main Method
    public static void main(String[] args) {
        // Creating an object to call non-static methods
        Op_9_NonStatic obj = new Op_9_NonStatic();
        // Calling all the test methods
        obj.accessStaticFromNonStatic();
        Op_9_NonStatic.accessNonStaticFromStatic();
        obj.accessNonStaticFromNonStatic();
    }
}

/*
 * class Main {
 * static int a=1;
 * int x=33;
 * Main()
 * {
 * a++;
 * x++;
 * }
 * static void stmet()
 * {
 * System.out.println("st met");//1
 * System.out.println("Static var ->"+a);//4
 * Main o=new Main();//5 34
 * System.out.println("non var ->"+o.x);//34
 * }
 * void nmet()
 * {
 * System.out.println("non var ->"+x);
 * System.out.println("static var ->"+a);
 * System.out.println("n met");
 * }
 * public static void main(String[] args) {
 * 
 * Main o1=new Main();//2 34
 * Main o2=new Main();//3 34
 * Main o3=new Main();//4 34
 * Main.stmet();
 * o1.nmet();
 * o2.nmet();
 * Main.a=99;
 * o3.nmet();
 * }
 * }
 */