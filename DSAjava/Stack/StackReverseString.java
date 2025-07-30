package DSAjava.Stack;

import java.util.Stack;

public class StackReverseString {
    
    public static String reverseString(String str)
    {
        Stack<Character> stack = new Stack<>();
        // Push all characters to stack
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }
        System.out.println(str);

        StringBuffer reversed=new StringBuffer();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }


        return reversed.toString();
    }
    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverseString(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}
