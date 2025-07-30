import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Creating a HashSet of strings
        Set<String> set = new HashSet<>();

        // add(element)
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Mango");

        // addAll(collection)
        Set<String> otherSet = new HashSet<>();
        otherSet.add("Pineapple");
        otherSet.add("Grapes");
        set.addAll(otherSet);

        // clear()
        set.clear();

        // add elements again after clearing
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Mango");

        // contains(element)
        boolean containsBanana = set.contains("Banana");

        // containsAll(collection)
        Set<String> checkSet = new HashSet<>();
        checkSet.add("Apple");
        checkSet.add("Mango");
        boolean containsAll = set.containsAll(checkSet);

        // isEmpty()
        boolean isEmpty = set.isEmpty();

        // iterator()
        System.out.println("Elements in the set:");
        for (String element : set) {
            System.out.println(element);
        }

        // remove(element)
        boolean removed = set.remove("Orange");

        // removeAll(collection)
        Set<String> removeSet = new HashSet<>();
        removeSet.add("Banana");
        removeSet.add("Mango");
        boolean allRemoved = set.removeAll(removeSet);

        // retainAll(collection)
        Set<String> retainSet = new HashSet<>();
        retainSet.add("Apple");
        retainSet.add("Banana");
        boolean retained = set.retainAll(retainSet);

        // size()
        int setSize = set.size();

        // toArray()
        Object[] setArray = set.toArray();

        // Display the set
        System.out.println("Set after operations: " + set);

        // Display the result of contains(element)
        System.out.println("Contains 'Banana': " + containsBanana);

        // Display the result of containsAll(collection)
        System.out.println("Contains all elements: " + containsAll);

        // Display if the set is empty
        System.out.println("Is set empty? " + isEmpty);

        // Display if 'Orange' was removed
        System.out.println("Removed 'Orange'? " + removed);

        // Display if all elements were removed
        System.out.println("All elements removed? " + allRemoved);

        // Display if elements were retained
        System.out.println("Elements retained? " + retained);

        // Display the size of the set
        System.out.println("Size of the set: " + setSize);

        // Display the set as an array
        System.out.println("Set as array: " + java.util.Arrays.toString(setArray));











         /*// Creating a HashSet of integers
         Set<Integer> set = new HashSet<>();

         // add(element)
         set.add(10);
         set.add(20);
         set.add(30);
         set.add(40);
 
         // addAll(collection)
         Set<Integer> otherSet = new HashSet<>();
         otherSet.add(50);
         otherSet.add(60);
         set.addAll(otherSet);
 
         // clear()
         set.clear();
 
         // add elements again after clearing
         set.add(10);
         set.add(20);
         set.add(30);
         set.add(40);
 
         // contains(element)
         boolean contains20 = set.contains(20);
 
         // containsAll(collection)
         Set<Integer> checkSet = new HashSet<>();
         checkSet.add(20);
         checkSet.add(30);
         boolean containsAll = set.containsAll(checkSet);
 
         // isEmpty()
         boolean isEmpty = set.isEmpty();
 
         // iterator()
         System.out.println("Elements in the set:");
         for (Integer element : set) {
             System.out.println(element);
         }
 
         // remove(element)
         boolean removed = set.remove(30);
 
         // removeAll(collection)
         Set<Integer> removeSet = new HashSet<>();
         removeSet.add(10);
         removeSet.add(40);
         boolean allRemoved = set.removeAll(removeSet);
 
         // retainAll(collection)
         Set<Integer> retainSet = new HashSet<>();
         retainSet.add(20);
         retainSet.add(60);
         boolean retained = set.retainAll(retainSet);
 
         // size()
         int setSize = set.size();
 
         // toArray()
         Object[] setArray = set.toArray();
 
         // Display the set
         System.out.println("Set after operations: " + set);
 
         // Display the result of contains(element)
         System.out.println("Contains '20': " + contains20);
 
         // Display the result of containsAll(collection)
         System.out.println("Contains all elements: " + containsAll);
 
         // Display if the set is empty
         System.out.println("Is set empty? " + isEmpty);
 
         // Display if '30' was removed
         System.out.println("Removed '30'? " + removed);
 
         // Display if all elements were removed
         System.out.println("All elements removed? " + allRemoved);
 
         // Display if elements were retained
         System.out.println("Elements retained? " + retained);
 
         // Display the size of the set
         System.out.println("Size of the set: " + setSize);
 
         // Display the set as an array
         System.out.println("Set as array: " + java.util.Arrays.toString(setArray));*/
     
    }
}
