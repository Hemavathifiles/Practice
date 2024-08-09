package demo;

//Superclass
class Animal2 {
 // Method in the superclass
 void eat() {
     System.out.println("Animal is eating.");
 }
}

//Subclass 1
class Dog2 extends Animal2 {
 // Method specific to Dog class
 void bark() {
     System.out.println("Dog is barking.");
 }
}

//Subclass 2
class Cat extends Animal2 {
 // Method specific to Cat class
 void meow() {
     System.out.println("Cat is meowing.");
 }
}

//Subclass 3
class Elephant extends Animal2 {
 // Method specific to Elephant class
 void trumpet() {
     System.out.println("Elephant is trumpeting.");
 }
}

public class Hierarchical_Inheritance{
 public static void main(String[] args) {
     // Create instances of each subclass
     Dog2 dog = new Dog2();
     Cat cat = new Cat();
     Elephant elephant = new Elephant();
     
     // Call methods from the superclass
     dog.eat();      // Output: Animal is eating.
     cat.eat();      // Output: Animal is eating.
     elephant.eat(); // Output: Animal is eating.
     
     // Call methods specific to each subclass
     dog.bark();      // Output: Dog is barking.
     cat.meow();      // Output: Cat is meowing.
     elephant.trumpet(); // Output: Elephant is trumpeting.
 }
}
