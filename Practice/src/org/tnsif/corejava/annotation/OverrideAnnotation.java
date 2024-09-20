package org.tnsif.corejava.annotation;

class Parent {
    void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    @Override
    void display() {  // This method overrides display() from Parent
        System.out.println("Child display");
    }
}
public class OverrideAnnotation
{
    public static void main(String[] args) {
        Child child = new Child();
        child.display();  // Output: Child display
    }
}

