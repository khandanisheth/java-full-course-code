import java.util.*;

public class Cf_8_HashMapMethodsExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<>();

        // 🔹 put() - Key-Value Add
        hmap.put(1, "Apple");
        hmap.put(2, "Banana");
        hmap.put(3, "Cherry");
        hmap.put(4, "Mango");
        hmap.put(null, null);

        System.out.println("HashMap: " + hmap);  // Output: {1=Apple, 2=Banana, 3=Cherry, 4=Mango}

        // 🔹 get() - Key ka Value Fetch
        System.out.println("Get key 2: " + hmap.get(2));  // Output: Banana

        // 🔹 containsKey() - Key check karega
        System.out.println("Contains key 3? " + hmap.containsKey(3));  // Output: true

        // 🔹 containsValue() - Value check karega
        System.out.println("Contains value 'Grapes'? " + hmap.containsValue("Grapes"));  // Output: false

        // 🔹 remove() - Key-Value remove karega
        hmap.remove(3);
        System.out.println("After removing key 3: " + hmap);  // Output: {1=Apple, 2=Banana, 4=Mango}

        // 🔹 keySet() - Sirf Keys print karega
        System.out.println("Keys: " + hmap.keySet());  // Output: [1, 2, 4]

        // 🔹 values() - Sirf Values print karega
        System.out.println("Values: " + hmap.values());  // Output: [Apple, Banana, Mango]

        // 🔹 entrySet() - Key-Value pairs print karega
        for (Map.Entry<Integer, String> entry : hmap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

         // 🔹 Key Set ke saath for-each loop
         System.out.println("Using for-each loop with keySet():");
         for (Integer key : hmap.keySet()) {
             System.out.println("Key: " + key + ", Value: " + hmap.get(key));
         }

        // 🔹 size() - HashMap ka size return karega
        System.out.println("Size of HashMap: " + hmap.size());  // Output: 3

        // 🔹 replace() - Key ka Value Replace karega
        hmap.replace(2, "Blueberry");
        System.out.println("After replace key 2: " + hmap);  // Output: {1=Apple, 2=Blueberry, 4=Mango}

        // 🔹 putIfAbsent() - Agar key nahi hai toh add karega
        hmap.putIfAbsent(5, "Grapes");
        System.out.println("After putIfAbsent(5, Grapes): " + hmap);

        // 🔹 isEmpty() - Check karega ki HashMap empty hai ya nahi
        System.out.println("Is HashMap empty? " + hmap.isEmpty());  // Output: false

    

        // 🔹 clear() - HashMap ke saare elements delete karega
        hmap.clear();
        System.out.println("After clear: " + hmap);  // Output: {}
    }
}
