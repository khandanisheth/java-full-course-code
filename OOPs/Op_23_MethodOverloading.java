class Display {
    // Method with (int, String)
    void show(int a, String b) {
        System.out.println("Int: " + a + ", String: " + b);
    }

    // Overloaded method with (String, int)
    void show(String b, int a) {
        System.out.println("String: " + b + ", Int: " + a);
    }
}

public class Op_23_MethodOverloading {
    public static void main(String[] args) {
        Display obj = new Display();
        obj.show(100, "Hello");   // Calls first method
        obj.show("World", 200);   // Calls second method
    }
}
