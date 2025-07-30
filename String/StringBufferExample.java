public class StringBufferExample {
    public static void main(String[] args) {
        // Initializing a StringBuffer
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Initial String: " + sb);

        // 1. append() - Adding strings to the existing StringBuffer
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

        // 6. capacity() - Getting the current capacity of the StringBuffer
        int capacity = sb.capacity();
        System.out.println("Current Capacity: " + capacity);

        // 7. ensureCapacity() - Ensuring the capacity is at least a certain size
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());

        // 8. charAt() - Accessing a specific character
        char ch = sb.charAt(0);
        System.out.println("Character at index 0: " + ch);

        // 9. length() - Getting the length of the StringBuffer
        int length = sb.length();
        System.out.println("Length of StringBuffer: " + length);

        // 10. setLength() - Setting the length of the StringBuffer
        sb.setLength(5);
        System.out.println("After setting length to 5: " + sb);

        StringBuffer capacitySB = new StringBuffer();
        System.out.println(capacitySB.capacity()); // Output: 16
    }
}

/*
 * 
 * 
 * Key Features of StringBuffer:
 * 
 * Mutable: StringBuffer objects mutable hote hain, yani aap unke content ko
 * directly modify kar sakte hain bina naye objects banaye.
 * Thread-Safe: StringBuffer synchronized hoti hai, iska matlab hai ki yeh
 * thread-safe hai. Multiple threads se ek hi StringBuffer object pe safely
 * operations perform kiye ja sakte hain.
 * Performance: StringBuffer efficient hoti hai jab aapko multiple string
 * manipulations karni ho, kyunki yeh ek hi object me changes kar sakti hai bina
 * naye objects banaye.
 * 
 * 
 * 
 * Important Points:
 * 
 * Synchronized: StringBuffer synchronized hoti hai, jo isse StringBuilder se
 * slower banata hai in a single-threaded environment, lekin thread-safe banata
 * hai in a multi-threaded environment.
 * Default Capacity: Default StringBuffer object ka initial capacity 16 hoti
 * hai. Agar aap isme zyada data append karte hain, to yeh automatically apni
 * capacity double kar leti hai plus 2 (i.e., old capacity * 2 + 2).
 * Performance: Jab aapko single-threaded environment me kaam karna ho aur
 * synchronization ki zaroorat na ho, to StringBuilder prefer kiya jata hai,
 * kyunki yeh faster hota hai.
 */