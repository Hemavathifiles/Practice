package demo;

//Superclass
class Animal6 {
 String name = "Animal";
}

//Subclass
class Dog6 extends Animal6 {
 String name = "Dog";

 void displayNames() {
     System.out.println("Superclass name: " + super.name); // Accesses name from Animal
     System.out.println("Subclass name: " + name);    // Accesses name from Dog
 }
}

public class SuperFieldDemo {
 public static void main(String[] args) {
     Dog6 dog = new Dog6();
     dog.displayNames();
     // Output:
     // Superclass name: Animal
     // Subclass name: Dog
 }
}
