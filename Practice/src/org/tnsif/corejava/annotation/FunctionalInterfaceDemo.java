package org.tnsif.corejava.annotation;

@FunctionalInterface
interface MyFunctionalInterface {
    void execute();
   // Single abstract method
}

public class FunctionalInterfaceDemo{
    public static void main(String[] args) {
        MyFunctionalInterface functionalInterface = () -> System.out.println("Executing functional interface method");
        functionalInterface.execute();  // Output: Executing functional interface method
    }
}
