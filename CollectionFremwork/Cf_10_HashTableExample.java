import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Cf_10_HashTableExample {
    public static void main(String[] args) {
        // Hashtable banaiye
        Hashtable<Integer, String> map = new Hashtable<>();

        // Data add karo
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");
        map.put(8, "Apple");
        map.put(6, "Banana");
        map.put(4, "Mango");
        //map.put(null, null); do not Support

        // Print karo Hashtable
        System.out.println(map); // Output: {1=Apple, 2=Banana, 3=Mango}

        // Ek key ki value get karo
        System.out.println("Key 2 ki value: " + map.get(2)); // Output: Key 2 ki value: Banana

        // Key exist karti hai ya nahi check karo
        System.out.println("Key 3 exist karti hai? " + map.containsKey(3)); // Output: true

        // Value exist karti hai ya nahi check karo
        System.out.println("Mango exist karta hai? " + map.containsValue("Mango")); // Output: true

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        System.out.println("Entries in the HashTable:");
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        // Key-value pair delete karo
        map.remove(1);
        System.out.println("After removing key 1: " + map); // Output: {2=Banana, 3=Mango}
    }
}
