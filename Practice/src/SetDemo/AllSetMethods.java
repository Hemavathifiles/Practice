package SetDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AllSetMethods {
    public static void main(String[] args) {
        // Create a HashSet
        Set<String> set = new HashSet<>();

        // 1. Adding elements to the set
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate, will not be added

        // Display the set
        System.out.println("Initial Set: " + set);

        // 2. Removing an element
        set.remove("Banana");
        System.out.println("Set after removing 'Banana': " + set);

        // 3. Checking if an element is present
        boolean containsCherry = set.contains("Cherry");
        System.out.println("Set contains 'Cherry': " + containsCherry);

        // 4. Getting the size of the set
        int size = set.size();
        System.out.println("Size of the set: " + size);

        // 5. Checking if the set is empty
        boolean isEmpty = set.isEmpty();
        System.out.println("Is the set empty? " + isEmpty);

        // 6. Clearing all elements from the set
        set.clear();
        System.out.println("Set after clearing: " + set);

        // 7. Checking if the set is empty after clearing
        isEmpty = set.isEmpty();
        System.out.println("Is the set empty after clearing? " + isEmpty);

        // Adding elements back to the set
        set.add("Date");
        set.add("Elderberry");

        // 8. Iterating over the elements of the set
        System.out.println("Iterating over the set:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

