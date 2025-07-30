import java.util.Vector;
import java.util.Iterator;

public class Cf_6_Vector{
    public static void main(String[] args) {
        // 🔹 1. Vector बनाना
        Vector<Integer> vector = new Vector<>();

        // 🔹 2. Elements Add करना
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(null);
        System.out.println("Vector Elements: " + vector);

        // 🔹 3. Index पर element Insert करना
        vector.add(1, 15);
        System.out.println("After inserting 15 at index 1: " + vector);

        // 🔹 4. दूसरा Collection जोड़ना
        Vector<Integer> newVector = new Vector<>();
        newVector.add(50);
        newVector.add(60);
        vector.addAll(newVector);
        System.out.println("After adding another Vector: " + vector);

        // 🔹 5. Element को Access करना
        System.out.println("Element at index 2: " + vector.get(2));

        // 🔹 6. Element को Replace करना
        vector.set(2, 25);
        System.out.println("After replacing index 2 with 25: " + vector);

        // 🔹 7. Element को Remove करना
        vector.remove(3);  // Index से Remove
        vector.remove(Integer.valueOf(50));  // Value से Remove
        System.out.println("After removing elements: " + vector);

        // 🔹 8. Contains Method
        System.out.println("Vector contains 30? " + vector.contains(30));

        // 🔹 9. Size & Capacity
        System.out.println("Size of Vector: " + vector.size());
        System.out.println("Capacity of Vector: " + vector.capacity());

        // 🔹 10. First and Last Element
        System.out.println("First Element: " + vector.firstElement());
        System.out.println("Last Element: " + vector.lastElement());

        // 🔹 11. Index of Element
        System.out.println("Index of 20: " + vector.indexOf(20));

        // 🔹 12. Clone Method
        @SuppressWarnings("unchecked")
        Vector<Integer> clonedVector = (Vector<Integer>) vector.clone();
        System.out.println("Cloned Vector: " + clonedVector);

        // 🔹 13. Iterating Vector (Using Iterator)
        System.out.print("Vector Elements using Iterator: ");
        Iterator<Integer> it = vector.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 🔹 14. Clear Vector
        vector.clear();
        System.out.println("After clearing Vector: " + vector);
        System.out.println("Is Vector Empty? " + vector.isEmpty());
    }
}
