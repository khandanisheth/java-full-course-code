import java.util.LinkedList;

public class Cf_3_Linkedlist{
    public static void main(String[] args) {
        // Creating a LinkedList of integers
        LinkedList<Integer> linkedList = new LinkedList<>();
        // add(E e)
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(22);
        //linkedList.set(0, 9);
        // add(int index, E element
        linkedList.add(1, 15);// add 1 index
        System.out.println("LinkedList: " + linkedList);
        // addAll(Collection<E> c)
        LinkedList<Integer> otherList = new LinkedList<>();
        otherList.add(40);
        otherList.add(50);
        linkedList.addAll(otherList);// es method se last me value add hoti he 
        System.out.println("LinkedList: " + linkedList);

        // addAll(int index, Collection<E> c)
        LinkedList<Integer> additionalList = new LinkedList<>();
        additionalList.add(100);
        additionalList.add(200);
        linkedList.addAll(3, additionalList);// and index ke sath ye index value wise add kar sakthe he 
        System.out.println("LinkedList: " + linkedList);
        
        // clone()
        //✅ Backup banane ke liye – Agar aapko kisi list ka backup lena ho aur usme changes karne ho bina original list ko affect kiye.
        // ✅ Copy banane ke liye – Kisi list ki duplicate copy banani ho bina manually sare elements ko copy kiye.
        @SuppressWarnings("unchecked")
        LinkedList<Integer> clonedList = (LinkedList<Integer>) linkedList.clone();
        
        // contains(Object o)
        boolean contains20 = linkedList.contains(20);

        // Display the result of contains()
        System.out.println("Contains '20': " + contains20);

        // get(int index)
        int elementAtIndex2 = linkedList.get(2);
        // Display the element at index 2
        System.out.println("Element at index 2: " + elementAtIndex2);

        // indexOf(Object o)
        int indexOf30 = linkedList.indexOf(30);

        // lastIndexOf(Object o)
        int lastIndexOf40 = linkedList.lastIndexOf(40);

        // remove(int index)
        linkedList.remove(1);

        // remove(Object o)
        linkedList.remove(Integer.valueOf(30));
        // Display the index of 30
        System.out.println("Index of '30': " + indexOf30);

        // removeFirst()
        linkedList.removeFirst();

        // removeLast()
        linkedList.removeLast();

        // set(int index, E element)
        linkedList.set(0, 5);

        // size()
        int sizeOfList = linkedList.size();

        // toArray()
        Object[] array = linkedList.toArray();

        // Display the modified LinkedList
        System.out.println("Modified LinkedList: " + linkedList);

        // Display the cloned LinkedList
        System.out.println("Cloned LinkedList: " + clonedList);
        // Display the last index of 40
        System.out.println("Last index of '40': " + lastIndexOf40);

        // Display the size of the LinkedList
        System.out.println("Size of LinkedList: " + sizeOfList);

        // Display the LinkedList as an array
        System.out.println("LinkedList as array: " + array);
    }
}
