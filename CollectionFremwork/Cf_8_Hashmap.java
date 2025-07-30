import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cf_8_Hashmap{
    public static void main(String[] args) {
        // Creating a HashMap with key as Integer and value as String
        HashMap<Integer, String> hashMap = new HashMap<>();

        // put(key, value)
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Orange");
        hashMap.put(4, "Mango");
        hashMap.put(null, null);
        //hashMap.put(null, null);
        System.out.println(hashMap);
        // putIfAbsent(key, value)
        hashMap.putIfAbsent(5, "Pineapple");
        hashMap.putIfAbsent(1, "Cherry"); // Will not add, as key 1 is already present

        // get(key)
        String valueForKey3 = hashMap.get(3);
        System.out.println(hashMap.get(2));

        // containsKey(key)
        boolean containsKey4 = hashMap.containsKey(4);

        // containsValue(value)
        boolean containsValueMango = hashMap.containsValue("Mango");

        // keySet()
        Set<Integer> keys = hashMap.keySet();

        // values()
        System.out.println("Values in the HashMap:");
        for (String value : hashMap.values()) {
            System.out.println(value);
        }

        // entrySet()
        Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();
        System.out.println("Entries in the HashMap:");
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // remove(key)
        String removedValue = hashMap.remove(2);

        // replace(key, newValue)
        hashMap.replace(4, "Grapes");
        

        // replace(key, oldValue, newValue)
        hashMap.replace(3, "Orange", "Watermelon");

        // clear()
        hashMap.clear();

        // Display the HashMap
        System.out.println("HashMap after operations: " + hashMap);

        // Display the value for key 3
        System.out.println("Value for key 3: " + valueForKey3);

        // Display if the key 4 is present
        System.out.println("Contains key 4? " + containsKey4);

        // Display if the value "Mango" is present
        System.out.println("Contains value 'Mango'? " + containsValueMango);

        // Display the keys in the HashMap
        System.out.println("Keys in the HashMap: " + keys);

        // Display the removed value for key 2
        System.out.println("Removed value for key 2: " + removedValue);

        // Display the HashMap after replacing key 4
        System.out.println("HashMap after replacing key 4: " + hashMap);

        // Display the HashMap after replacing key 3
        System.out.println("HashMap after replacing key 3: " + hashMap);


        HashMap<Integer,String> list=new HashMap<>();
        list.put(1,"Dk");
        list.put(2,"SK");
        list.put(5,"Jk");
        list.put(4,"vk");
       

        for(int i:list.keySet())
        {
           System.out.println(i+" : "+list.get(i));
        }
        for (Map.Entry<Integer,String> entry2 : list.entrySet()) {
            System.out.print(entry2.getKey());
            System.out.print(":");
            System.out.print(entry2.getValue());
            System.out.println();
        }

        String valuelist3 = list.get(3);
        System.out.println(valuelist3);

        boolean search=list.containsKey(1);
        boolean search1 = list.containsValue("vk");
        System.out.println(search);
        System.out.println(search1);

        String removedlist = list.remove(2);
        System.out.println(removedlist);
        list.replace(4,"Watermelon");
        System.out.println(list);

        System.out.println(list.size());
    }
}
