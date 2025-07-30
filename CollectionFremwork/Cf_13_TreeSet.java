import java.util.TreeSet;

public class Cf_13_TreeSet {
    public static void main(String[] args) {
        TreeSet<String> tset = new TreeSet<>();

        // ✅ 1. Add Elements
        tset.add("Banana");
        tset.add("Apple");
        tset.add("Cherry");
        tset.add("Mango");
        tset.add("Grapes");
        tset.add("Banana");
        // tset.add(null); //do not allow

        System.out.println("TreeSet (Sorted Order): " + tset); // 🔹 Sorted Output

        // ✅ 2. Remove Elements
        tset.remove("Banana");
        System.out.println("After Removing 'Banana': " + tset);
        tset.add("Banana");

        // ✅ 3. Search Element (contains)
        boolean isPresent = tset.contains("Apple");
        System.out.println("Is 'Apple' present? " + isPresent);

        // ✅ 4. Get First and Last Element
        System.out.println("First Element: " + tset.first());
        System.out.println("Last Element: " + tset.last());

        // ✅ 5. Get Subset (HeadSet, TailSet, SubSet)
        System.out.println("Elements before 'Mango': " + tset.headSet("Mango"));
        System.out.println("Elements from 'Mango' onwards: " + tset.tailSet("Mango"));
        System.out.println("Subset from 'Apple' to 'Mango': " + tset.subSet("Apple", "Mango"));

        // ✅ 6. Reverse Order
        System.out.println("Descending Order: " + tset.descendingSet());

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

        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println(set.higher(15)); // Output: 20 (Greater than 15)
        System.out.println(set.lower(25));  // Output: 20 (Less than 25)
        System.out.println(set.ceiling(20));// Output: 20 (Greater or Equal to 20)
        System.out.println(set.floor(25));  // Output: 20 (Less or Equal to 25)

    }
}
