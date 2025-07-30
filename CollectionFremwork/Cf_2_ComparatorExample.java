import java.util.*;

public class Cf_2_ComparatorExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 1, 9, 3, 7);

        // Ascending Order (Default Sorting)
        Collections.sort(numbers);
        System.out.println("Ascending Order: " + numbers);

        // Descending Order (Comparator ke sath)
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b - a; // Reverse order
            }
        });
        System.out.println("Descending Order: " + numbers);
    }
}
