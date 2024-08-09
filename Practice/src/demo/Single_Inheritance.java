package demo;

//Superclass
class Animal {
 // Field
 String name = "Animal";

 // Method
 void eat() {
     System.out.println(name + " is eating.");
 }
}

//Subclass
class Dog extends Animal {
 // Method specific to Dog class
 void bark() {
     System.out.println(name + " is barking.");
 }
}

public class Single_Inheritance  {
 public static void main(String[] args) {
     // Create an instance of the Dog class
     Dog dog = new Dog();

     // Call methods from the superclass
     dog.eat(); // Output: Animal is eating.

     // Call method from the subclass
     dog.bark(); // Output: Animal is barking.
 }
}


