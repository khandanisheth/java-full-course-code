import java.util.*;
import java.util.concurrent.*;

enum Days {
    MONDAY, TUESDAY, WEDNESDAY
}

public class Cf_11_MapExamples {
    public static void main(String[] args) {
        // 1. SortedMap Example (TreeMap se implement hota hai)
        SortedMap<Integer, String> sortedMap = new TreeMap<>();
        sortedMap.put(2, "Python");
        sortedMap.put(1, "Java");
        System.out.println("SortedMap: " + sortedMap);

        // 2. NavigableMap Example (TreeMap se implement hota hai)
        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        navigableMap.put(2, "C++");
        navigableMap.put(1, "Java");
        System.out.println("NavigableMap (floor of 2): " + navigableMap.floorEntry(2));

        // 3. ConcurrentMap Example (ConcurrentHashMap se implement hota hai)
        ConcurrentMap<Integer, String> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put(1, "Java");
        concurrentMap.put(2, "GoLang");
        System.out.println("ConcurrentMap: " + concurrentMap);

        // 4. TreeMap Example (Sorted Map ka implementation)
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Rust");
        treeMap.put(1, "Java");
        treeMap.put(2, "Kotlin");
        System.out.println("TreeMap: " + treeMap);

        // 5. AbstractMap Example (HashMap ka object)
        AbstractMap<Integer, String> abstractMap = new HashMap<>();
        abstractMap.put(1, "Scala");
        abstractMap.put(2, "Swift");
        System.out.println("AbstractMap: " + abstractMap);

        // 6. ConcurrentHashMap Example
        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(1, "C");
        concurrentHashMap.put(2, "C++");
        System.out.println("ConcurrentHashMap: " + concurrentHashMap);

        // 7. EnumMap Example
        EnumMap<Days, String> enumMap = new EnumMap<>(Days.class);
        enumMap.put(Days.MONDAY, "Work");
        enumMap.put(Days.TUESDAY, "Meeting");
        System.out.println("EnumMap: " + enumMap);

        // 8. HashMap Example
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Python");
        hashMap.put(null, "Java"); // Null key allowed
        System.out.println("HashMap: " + hashMap);

        // 9. IdentityHashMap Example
        IdentityHashMap<String, String> identityMap = new IdentityHashMap<>();
        String key1 = new String("Key");
        String key2 = new String("Key"); // Different objects
        identityMap.put(key1, "C#");
        identityMap.put(key2, "Go"); // Dono alag treat honge
        System.out.println("IdentityHashMap: " + identityMap);

        // 10. LinkedHashMap Example
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(2, "JavaScript");
        linkedHashMap.put(1, "TypeScript");
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // 11. Hashtable Example
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "Ruby");
        hashtable.put(2, "PHP");
        System.out.println("Hashtable: " + hashtable);

        // 12. Properties Example
        Properties properties = new Properties();
        properties.setProperty("username", "admin");
        properties.setProperty("password", "1234");
        System.out.println("Properties (username): " + properties.getProperty("username"));
    }
}
/*
 * 4. Conclusion
 * SortedMap: TreeMap ka part hai, data sorted store hota hai.
 * NavigableMap: TreeMap ka navigation version, jo floor(), ceiling() jese
 * methods provide karta hai.
 * ConcurrentMap: Thread-safe maps ke liye ConcurrentHashMap ka interface.
 * TreeMap: Red-Black Tree pe based sorted Map.
 * AbstractMap: Base class for all maps.
 * ConcurrentHashMap: Thread-safe aur high-performance alternative to Hashtable.
 * EnumMap: Sirf Enum keys ke liye, sabse fast map.
 * HashMap: General-purpose, fast but not thread-safe.
 * IdentityHashMap: Reference-based comparison (== instead of .equals()).
 * LinkedHashMap: Insertion order maintain karta hai.
 * Hashtable: Thread-safe but slower than ConcurrentHashMap.
 * Properties: Configuration files ke liye String-based Map.
 */