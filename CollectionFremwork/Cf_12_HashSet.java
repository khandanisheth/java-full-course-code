import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**🔹 Set ke Features:
Duplicate elements allowed nahi hote.
Insertion order maintain nahi hota (except LinkedHashSet).
Null values store ki ja sakti hain (but only one null value).
Different implementations available hain:
HashSet (Fast, but unordered)
LinkedHashSet (Maintains insertion order)
TreeSet (Sorted order me store karta hai) */
public class Cf_12_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(null);

        System.out.println(hashSet);// do not duplicate value stroe

        HashSet<Integer> set = new HashSet<>();
        set.addAll(hashSet);// this is use other set add
        System.out.println(set);

        set.add(10);
        set.add(20);
        set.add(30);
        // int a = set.get(2); // ❌ ERROR: HashSet does not support get(index)

        // ✅ HashSet ko List me Convert kiya
        List<Integer> list = new ArrayList<>(set);

        // ✅ Ab index ke basis par element le sakte hain
        int a = list.get(2);
        System.out.println("Element at index 2: " + a);

        for (int i : set)// set value print
        {
            System.out.println(i);
        }

        set.remove(1);
        System.out.println(set);

        System.out.println(set.size());
        // ✅ Search Element in HashSet
        int searchElement = 20;
        if (set.contains(searchElement)) {
            System.out.println(searchElement + " found in the HashSet!");
        } else {
            System.out.println(searchElement + " not found in the HashSet!");
        }

       // System.out.println("Descending Order: " + set.descendingSet());

        HashSet<Integer> chckSet=new HashSet<>();
        chckSet.add(10);
        chckSet.add(20);
        chckSet.add(30);
        chckSet.add(40);
        chckSet.add(60);
        chckSet.add(90);
        chckSet.add(null);
        chckSet.add(null);
        System.out.println(chckSet);
    }
}
