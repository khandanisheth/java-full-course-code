import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionVsCollectionsExample {
    public static void main(String[] args) {
        // Collection interface example
        List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("cherry");
        myList.add("b");
        System.out.println("Collection: " + myList);

        // Collections class example
        Collections.sort(myList); // Sort the list
        System.out.println("Sorted List: " + myList);
    }
}
