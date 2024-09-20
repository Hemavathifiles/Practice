package SetDemo;

import java.util.TreeSet;

public class TreeSetDemo{
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Cherry");
        set.add("Banana");
        set.add("Apple");

        System.out.println("TreeSet: " + set);
    }
}
