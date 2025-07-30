import java.util.Stack;

public class Cf_7_Stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        
        // 🔹 1. Push Elements
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        stack.push("Mango");

        System.out.println("Stack: " + stack);

        // 🔹 1. Using For Loop
        System.out.println("Using for loop:");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();

        // 🔹 2. Using For-Each Loop
        System.out.println("Using for-each loop:");
        for (String item : stack) {
            System.out.print(item + " ");
        }
        System.out.println();

        // 🔹 3. Peek (Top element को देखना)
        System.out.println("Top Element (peek): " + stack.peek());

        // 🔹 4. Pop (Top element remove करना)
        System.out.println("Popped Element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // 🔹 5. Search (Element का index ढूंढना) this is a intex is 1 do not 0
        System.out.println("Position of 'Banana': " + stack.search("Banana"));

        // 🔹 6. Using While Loop & pop() (सिर्फ लास्ट में)
        System.out.println("Using while loop & pop:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        // 🔹 7. Check if Stack is empty
        System.out.println("Is stack empty? " + stack.empty());
    }
}
