package Generics;

import java.util.*;

public class LowerBound {

    // Method to add elements to a list
    public static void addNumbers(List<? super Integer> list) {
        list.add(1);  // Adding Integer is allowed
        list.add(2);  // Adding Integer is allowed
        // list.add(3.14); // Compilation error: cannot add Double (not a superclass of Integer)
    }

    // Method to print elements from a list
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        // Using a list of Integer
        List<Integer> integerList = new ArrayList<>();
        addNumbers(integerList);
        printList(integerList); // Output: 1 2

       
    }
}
