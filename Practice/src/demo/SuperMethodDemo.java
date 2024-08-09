package demo;


//Superclass
class Animal5 {
void makeSound() {
   System.out.println("Animal makes a sound.");
}
}

//Subclass 1
class Dog5 extends Animal5 {
@Override
void makeSound() {
   super.makeSound(); // Calls makeSound() from Animal
   System.out.println("Dog barks.");
}
}

public class SuperMethodDemo {
public static void main(String[] args) {
   Dog5 dog = new Dog5();
  
   
   // Calls the overridden method in each subclass
   dog.makeSound();
   // Output:
   // Animal makes a sound.
   // Dog barks.

  

}
}
