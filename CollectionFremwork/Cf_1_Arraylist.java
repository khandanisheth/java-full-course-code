import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// // String  Comparator
// class StringLengthCompretor implements Comparator<String> {
//   @Override
//   public int compare(String s1, String s2) {
//     return 0;
//   }
// }

// // String Comparator
// class IntegerLengthCompretor implements Comparator<Integer> {
//   @Override
//   public int compare(Integer i1, Integer i2) {
//     return 0;
//   }
// }

public class Cf_1_Arraylist{
  public static void main(String[] args) {
    // Creating an ArrayList of strings
    ArrayList<String> arrayList = new ArrayList<>(2);
    System.out.println(arrayList.size());
    // add(Object o)
    arrayList.add("Apple");
    arrayList.add("Banana");
    arrayList.add("Orange");
    arrayList.add("Mango");
    arrayList.add(null);
    System.out.println(arrayList);
    // add(int index, Object element)
    arrayList.add(2, "Grapes");
    arrayList.set(2, "khan");

    // addAll(Collection C)
    List<String> fruitsToAdd = Arrays.asList("Pineapple", "Watermelon");
    arrayList.addAll(fruitsToAdd);

    // addAll(int index, Collection C)
    List<String> moreFruits = Arrays.asList("Kiwi", "Pear");
    arrayList.addAll(3, moreFruits);

    // clone()
    @SuppressWarnings("unchecked")
    ArrayList<String> clonedList = (ArrayList<String>) arrayList.clone();

    // contains(Object o)
    boolean containsApple = arrayList.contains("Apple");

    // get(int index)
    String fruitAtIndex3 = arrayList.get(3);

    // indexOf(Object O)
    int indexOfBanana = arrayList.indexOf("Banana");

    // isEmpty()
    boolean isEmpty = arrayList.isEmpty();

    // lastIndexOf(Object O)
    int lastIndexOfGrapes = arrayList.lastIndexOf("Grapes");

    // remove(int index)
    arrayList.remove(1);

    // remove(Object o)
    arrayList.remove("Mango");

    // removeAll(Collection c)
    List<String> fruitsToRemove = Arrays.asList("Pineapple", "Kiwi");
    arrayList.removeAll(fruitsToRemove);

    // size()
    int sizeOfArrayList = arrayList.size();

    // toArray()
    Object[] fruitsArray = arrayList.toArray();

    // trimToSize()
    arrayList.trimToSize();

    // Display the modified ArrayList
    System.out.println("Modified ArrayList: " + arrayList);

    // Display the cloned ArrayList
    System.out.println("Cloned ArrayList: " + clonedList);

    // Display the result of contains()
    System.out.println("Contains 'Apple': " + containsApple);

    // Display the element at index 3
    System.out.println("Element at index 3: " + fruitAtIndex3);

    // Display the index of 'Banana'
    System.out.println("Index of 'Banana': " + indexOfBanana);

    // Display if the ArrayList is empty
    System.out.println("Is ArrayList empty? " + isEmpty);

    // Display the last index of 'Grapes'
    System.out.println("Last index of 'Grapes': " + lastIndexOfGrapes);

    // Display the size of the ArrayList
    System.out.println("Size of ArrayList: " + sizeOfArrayList);

    // Display the ArrayList as an array
    System.out.println("ArrayList as array: " + Arrays.toString(fruitsArray));

    System.out.println("Integer Type Operation Array List");
    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) {
      // if (i % 2==0) {
      list.add(i); // Add the element to the ArrayList
      // System.out.println(list.get(i/2)); // Retrieve and print the element
      // }
    }
    System.out.println(list);
    for (int number : list) {
      if (number % 2 != 0) {
        list2.add(number);
      }
    }
    System.out.println(list2);
    // Elelment get(intdex);
    int x = list2.get(3);
    // Elelment set(intdex,value);
    System.out.println(x);
    list2.set(2, 65);
    System.out.println(list2);
    System.out.println();
    System.out.println(list.size());
    System.out.println(list2.size());

    list.remove(2);
    list.remove(1);

    list2.remove(3);
    list2.remove(2);

    System.out.println(list);

    System.out.println(list2);
    /* Srting Order */
    Collections.sort(list);
    Collections.sort(list2);
  }
}
