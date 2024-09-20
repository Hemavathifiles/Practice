package org.tnsif.corejava.annotation;

import java.util.Arrays;

class VarargsExample {
    @SafeVarargs
    private final <T> void printItems(T... items) {
        Arrays.stream(items).forEach(System.out::println);
    }

    public static void main(String[] args) {
        VarargsExample example = new VarargsExample();
        example.printItems("Hello", "World", "!");  // Output: Hello World !
    }
}
