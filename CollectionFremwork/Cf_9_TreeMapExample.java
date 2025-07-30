import java.util.TreeMap;

public class Cf_9_TreeMapExample {
    public static void main(String[] args) {

        //TreeMap<Integer, String> map = new TreeMap<>((a,b)->b-a); this are used tp Desending Order me sort
        // TreeMap banana
        TreeMap<Integer, String> map = new TreeMap<>();

        // Elements add karna
        map.put(3, "Teen");
        map.put(1, "Ek");
        map.put(2, "Do");
        map.put(5, "Paanch");
        map.put(4, "Chaar");
        //map.put(null, null);
       // map.put(null, "null"); //Do Not Access


        // TreeMap display karna
        System.out.println("TreeMap: " + map);

        // TreeMap Get Method
        System.out.println("Tree Map Get Method ->" + map.get(1));
        // Values ko nikal lene ke liye
        System.out.println("Tree Map Get Method ->" + map.get(Integer.valueOf(2)));

        // Key 3 ko remove karna
        map.remove(3);
        System.out.println(map);// Output: {1=Ek, 2=Do}

        boolean hasKey = map.containsKey(1);
        System.out.println(hasKey); // Output: true

        boolean hasValue = map.containsValue("Teen");
        System.out.println(hasValue);// Output: false

        // Minimum aur maximum key prapt karna
        System.out.println("Minimum key: " + map.firstKey());
        System.out.println("Maximum key: " + map.lastKey());

        // Submap prapt karna
        System.out.println("Submap (2 se 4): " + map.subMap(2, true, 4, true));
    }
}
