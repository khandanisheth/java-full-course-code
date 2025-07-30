import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// String Comparator: Strings ko unki lambai ke aadhar par descending order me sort karega
class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s2.length() - s1.length();
    }
}

// Integer Comparator: Integers ko descending order me sort karega
class IntegerLengthComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        return i2 - i1;
    }
}

public class Cf_2_MakeComparator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> listword = new ArrayList<>();

        // Integers add karna
        list.add(9);
        list.add(6);
        list.add(7);
        list.add(18);
        list.add(3);
        list.add(1);
        list.add(13);
        list.add(31);
        list.add(19);

        // Strings add karna
        listword.add("apple");
        listword.add("banana");
        listword.add("kiwi");
        listword.add("orange");
        listword.add("mango");

        // Bina sorting ke print karna
        System.out.println("Bina Sorting Ke Integer ArrayList -> " + list);
        Collections.sort(list);
        System.out.println("Ascending Order Me Sorted Integer ArrayList -> " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Order Me Sorted Integer ArrayList -> " + list);

        System.out.println("\nBina Sorting Ke String ArrayList -> " + listword);
        Collections.sort(listword);
        System.out.println("Ascending Order Me Sorted String ArrayList -> " + listword);
        Collections.sort(listword, Collections.reverseOrder());
        System.out.println("Descending Order Me Sorted String ArrayList -> " + listword);

        System.out.println("\n----- Custom Comparator Sorting -----\n");

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> listword1 = new ArrayList<>();
        // Integers add karna
        list1.add(9);
        list1.add(6);
        list1.add(7);
        list1.add(18);
        list1.add(3);
        list1.add(1);
        list1.add(13);
        list1.add(31);
        list1.add(19);

        // Strings add karna
        listword1.add("apple");
        listword1.add("banana");
        listword1.add("kiwi");
        listword1.add("orange");
        listword1.add("mango");
        // Custom comparator se sorting
        System.out.println("Bina Sorting Ke Integer ArrayList -> " + list1);
        list1.sort(new IntegerLengthComparator());
        System.out.println("Integer Length Comparator Sorted ArrayList -> " + list1);

        System.out.println("Bina Sorting Ke String ArrayList -> " + listword1);
        listword1.sort(new StringLengthComparator());
        System.out.println("String Length Comparator Sorted ArrayList -> " + listword1);
    }
}
