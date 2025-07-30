public class StringBuilderDemo {
    public static void main(String[] args) {
        // Initializing a StringBuilder with a starting string
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Initial StringBuilder: " + sb);

        // 1. append() - Adding strings to the existing StringBuilder
        sb.append(" World");
        System.out.println("After append: " + sb);

        // 2. insert() - Inserting a string at a specific position
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        // 3. replace() - Replacing a portion of the string with another string
        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb);

        // 4. delete() - Deleting a portion of the string
        sb.delete(5, 10);
        System.out.println("After delete: " + sb);

        // 5. reverse() - Reversing the string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 6. capacity() - Getting the current capacity of the StringBuilder
        int capacity = sb.capacity();
        System.out.println("Current capacity: " + capacity);

        // 7. ensureCapacity() - Ensuring the capacity is at least a certain size
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());

        // 8. charAt() - Accessing a specific character
        char ch = sb.charAt(0);
        System.out.println("Character at index 0: " + ch);

        // 9. length() - Getting the length of the StringBuilder
        int length = sb.length();
        System.out.println("Length of StringBuilder: " + length);

        // 10. setLength() - Setting the length of the StringBuilder
        sb.setLength(5);
        System.out.println("After setting length to 5: " + sb);
    }
}
