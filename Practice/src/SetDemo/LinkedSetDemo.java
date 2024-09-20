package SetDemo;

import java.util.LinkedHashSet;

public class LinkedSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Cherry");
        set.add("Banana");
        set.add("apple");

        System.out.println("LinkedHashSet: " + set);
    }
}

