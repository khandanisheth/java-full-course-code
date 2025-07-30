import java.util.LinkedHashSet;

public class Cf_14_LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> tset = new LinkedHashSet<>();
        // ✅ 1. Add Elements
        tset.add("Banana");
        tset.add("Apple");
        tset.add("Cherry");
        tset.add("Mango");
        tset.add("Grapes");
        tset.add("Banana");
        tset.add(null);

        System.out.println("TreeSet (Sorted Order): " + tset); // 🔹 Sorted Output

        // ✅ 2. Remove Elements
        tset.remove("Banana");
        System.out.println("After Removing 'Banana': " + tset);
        tset.add("Banana");

        // ✅ 3. Search Element (contains)
        boolean isPresent = tset.contains("Apple");
        System.out.println("Is 'Apple' present? " + isPresent);

        // ✅ 4. Get First and Last Element
        // System.out.println("First Element: " + tset.first()); Do not Allow
        // System.out.println("Last Element: " + tset.last());

        // ✅ 5. Get Subset (HeadSet, TailSet, SubSet)
        // System.out.println("Elements before 'Mango': " + tset.headSet("Mango"));
        // System.out.println("Elements from 'Mango' onwards: " +
        // tset.tailSet("Mango")); Do not Allow
        // System.out.println("Subset from 'Apple' to 'Mango': " + tset.subSet("Apple",
        // "Mango"));

        // ✅ 6. Reverse Order
        // System.out.println("Descending Order: " + tset.descendingSet()); this is are
        // not use

        // ✅ 7. Iterate using For-Each
        System.out.println("Iterating over TreeSet:");
        for (String fruit : tset) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // ✅ 8. Size of TreeSet
        System.out.println("Size of TreeSet: " + tset.size());

        // ✅ 9. Check if Empty
        System.out.println("Is TreeSet empty? " + tset.isEmpty());

        // ✅ 10. Clear All Elements
        tset.clear();
        System.out.println("TreeSet after clear(): " + tset);

        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        set1.retainAll(set2);
        System.out.println(set1); // Output: [2, 3]
    }
}
