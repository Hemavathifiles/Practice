package Generics;

import java.util.*;

class Animal {
    public void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class BoundedElement {
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.makeSound(); // Works because each element is an Animal or subclass
        }
    }

    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(new Dog());
        List<Cat> cats = Arrays.asList(new Cat());

        printAnimals(dogs); // Prints: Bark Bark
        printAnimals(cats); // Prints: Meow Meow
    }
}

