interface Drawable {
    int x = 10; // Ye automatically public static final hoga

    void draw(); // Abstract method

    default void dk() { // ✅ Default method
        System.out.println("This is a default method Parent");
    }

    static void dkk() { // ✅ Static method
        System.out.println("This is a static method Parents");
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    public void dk() { // ✅ Correct override
        System.out.println("This is a default method Circle Child Class");
    }

    static void dkk() { // ✅ Static method in Circle
        System.out.println("This is a static method Circle");
    }
}

public class Op_16_Interface {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Circle c = new Circle();

        r.draw();  // Output: Drawing a Rectangle
        r.dk();    // Output: This is a default method

        c.draw();  // Output: Drawing a Circle
        c.dk();    // Output: This is a default method Circle Child Class

        // Static methods ko class ya interface ke naam se call karna chahiye
        Drawable.dkk();  // ✅ Interface ka static method
        Circle.dkk();    // ✅ Circle class ka static method

        // Lamda Expression
        
        Drawable drawable=() -> { System.out.println("hello"); };
        drawable.draw();
    }
}
/*
 * Interface ke variables class level per hote hain (static) aur object banane
 * ki zaroorat nahi hoti.
 * Unko sirf Interface ke naam se access kiya jata hai (Test.x).
 * Unka value change nahi kiya ja sakta (final)
 */