package List;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();
        
        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Cherry");
        
        
        // Access elements
        System.out.println("First fruit: " + fruits.get(0));  // Output: Apple
        
        // Modify an element
        fruits.set(1, "Blueberry");
        
        // Remove an element
        fruits.remove("Cherry");
        
        // Check if an element exists
        if (fruits.contains("Apple")) {
            System.out.println("Apple is in the list.");
        }
        
        // Print all elements using a for-each loop
        System.out.println("Fruits in the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        // Get the size of the ArrayList
        System.out.println("Number of fruits: " + fruits.size());
        
        // Clear all elements
        fruits.clear();
        System.out.println("List cleared. Number of fruits: " + fruits.size());
    }
}
