package Generics;

import java.util.*;

class Animal22 {
    public void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog22 extends Animal22 {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat22 extends Animal22 {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class UpperBound {
    public static void printAnimals(List<? extends Animal22> animals) {
        for (Animal22 animal : animals) {
            animal.makeSound(); // Works because each element is an Animal or subclass
        }
    }

    public static void main(String[] args) {
        List<Dog22> dogs = Arrays.asList(new Dog22());
        List<Cat22> cats = Arrays.asList(new Cat22());
        
        

        printAnimals(dogs); // Prints: Dog Dog
        printAnimals(cats); 
}
}