package demo;

//Base class
class Animal1 {
 // Method in the base class
 void eat() {
     System.out.println("Animals are eating.");
 }
}

//Intermediate class
class Mammal extends Animal1 {
 // Method in the intermediate class
 void sleep() {
     System.out.println("Mammal is sleeping.");
 }
}

//Derived class
class Dog1 extends Mammal {
 // Method in the derived class
 void bark() {
     System.out.println("Dog is barking.");
 }
}

public class Multilevel_Inheritance {
 public static void main(String[] args) {
     // Create an instance of the Dog class
     Dog1 dog = new Dog1();
     Mammal mam=new Mammal();
     
     // Call methods from the base and intermediate classes
     dog.eat();   // Output: Animal is eating.
     dog.sleep(); // Output: Mammal is sleeping.
     dog.bark();  // Output: Dog is barking.
 }
}
