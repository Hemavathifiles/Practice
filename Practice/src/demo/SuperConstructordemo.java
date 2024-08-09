package demo;

//Superclass
class Animal7 {
 Animal7() {
     System.out.println("Animal constructor");
 }
}

//Subclass
class Dog7 extends Animal7 {
 Dog7() {
     super(); // Calls Animal's constructor
     System.out.println("Dog constructor");
 }
}

public class SuperConstructordemo {
 public static void main(String[] args) {
     Dog7 dog = new Dog7();
     // Output:
     // Animal constructor
     // Dog constructor
 }
}
