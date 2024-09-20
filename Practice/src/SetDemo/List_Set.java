package SetDemo;


import java.util.ArrayList;
import java.util.HashSet;

public class List_Set {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        HashSet<String> fruits = new HashSet<>();
        
        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Cherry");
        System.out.println(fruits);
    }
}
