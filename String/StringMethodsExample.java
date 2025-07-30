public class StringMethodsExample {
    public static void main(String[] args) {
        // 🔹 1. Creating a String
        String str = "  Hello Java  ";

         // 🔹 . trim() → Removes extra spaces from the beginning and end
         System.out.println("No Trimmed: '" + str + "'"); // Output: 'Hello Java'


        // 🔹 2. length() → Returns the length of the string (including spaces)
        System.out.println("Length: " + str.length()); // Output: 14

        // 🔹 3. trim() → Removes extra spaces from the beginning and end
        System.out.println("Trimmed: '" + str.trim() + "'"); // Output: 'Hello Java'

        // 🔹 4. toUpperCase() → Converts to uppercase
        System.out.println("Uppercase: " + str.toUpperCase()); // Output: "  HELLO JAVA  "

        // 🔹 5. toLowerCase() → Converts to lowercase
        System.out.println("Lowercase: " + str.toLowerCase()); // Output: "  hello java  "

        // 🔹 6. charAt(index) → Returns the character at the specified index
        System.out.println("Character at index 2: " + str.charAt(2)); // Output: 'H'

        // 🔹 7. substring(start, end) → Extracts part of the string
        System.out.println("Substring (2 to 7): " + str.substring(2, 7)); // Output: "Hello"

        // 🔹 8. contains("text") → Checks if string contains a specific text
        System.out.println("Contains 'Java': " + str.contains("Java")); // Output: true

        // 🔹 9. startsWith("text") → Checks if string starts with given text
        System.out.println("Starts with '  Hell': " + str.startsWith("  Hell")); // Output: true

        // 🔹 10. endsWith("text") → Checks if string ends with given text
        System.out.println("Ends with 'Java  ': " + str.endsWith("Java  ")); // Output: true

        // 🔹 11. equals("text") → Compares strings (case-sensitive)
        System.out.println("Equals '  Hello Java  ': " + str.equals("  Hello Java  ")); // Output: true

        // 🔹 12. equalsIgnoreCase("text") → Compares strings (ignores case)
        System.out.println("Equals Ignore Case '  hello java  ': " + str.equalsIgnoreCase("  hello java  ")); // Output: true

        // 🔹 13. replace(old, new) → Replaces characters or words
        System.out.println("Replace 'Java' with 'World': " + str.replace("Java", "World")); // Output: "  Hello World  "

        // 🔹 14. indexOf("text") → Finds index of first occurrence of a substring
        System.out.println("Index of 'Java': " + str.indexOf("Java")); // Output: 8

        // 🔹 15. lastIndexOf("text") → Finds index of last occurrence of a substring
        System.out.println("Last Index of 'a': " + str.lastIndexOf('a')); // Output: 10

        // 🔹 16. isEmpty() → Checks if string is empty
        System.out.println("Is Empty: " + str.isEmpty()); // Output: false

        // 🔹 17. isBlank() (Java 11+) → Checks if string is empty or contains only spaces
        System.out.println("Is Blank: " + str.isBlank()); // Output: false

        // 🔹 18. split("regex") → Splits string into an array based on given regex
        String[] words = str.trim().split(" "); // Splitting by space
        System.out.println("Split words:");
        for (String word : words) {
            System.out.println(word); // Output: "Hello" and "Java"
        }

        // 🔹 19. join("delimiter", elements...) → Joins elements with a separator
        String joinedStr = String.join("-", "Apple", "Banana", "Cherry");
        System.out.println("Joined String: " + joinedStr); // Output: "Apple-Banana-Cherry"

        // 🔹 20. toCharArray() → Converts string into a character array
        char[] charArray = str.toCharArray();
        System.out.print("Character Array: ");
        for (char c : charArray) {
            System.out.print(c + " "); // Output: ' ', ' ', 'H', 'e', 'l', 'l', 'o', ' ', 'J', 'a', 'v', 'a', ' '
        }
        System.out.println(); // New line

        // 🔹 21. compareTo("text") → Compares two strings lexicographically
        System.out.println("Compare 'Hello' and 'Java': " + "Hello".compareTo("Java")); // Negative if first is smaller

        // 🔹 22. concat("text") → Concatenates two strings
        System.out.println("Concatenated: " + str.concat(" Programming")); // Output: "  Hello Java   Programming"

        // 🔹 23. intern() → Moves string to String Pool
        String newStr = new String("Hello").intern();
        System.out.println("Interned equals: " + ("Hello" == newStr)); // Output: true (same reference in String Pool)

        // 🔹 24. format() → Formats the string
        String formattedStr = String.format("My name is %s and I am %d years old.", "Danish", 25);
        System.out.println("Formatted String: " + formattedStr); // Output: "My name is Danish and I am 25 years old."
    }
}
