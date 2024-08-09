package demo;

//Define the interface
interface Vehicle {
 // Abstract methods (implicitly public and abstract)
 void start();
 void stop();

 // Variables in an interface are final and static by default
 int MAX_SPEED = 120;  // Maximum speed of any vehicle, initialized once
}

//Implement the interface in a class
class Car5 implements Vehicle {
 private String model;

 // Constructor
 public Car5(String model) {
     this.model = model;
 }

 // Provide implementation for the start method
 public void start() {
     System.out.println("Car " + model + " is starting.");
 }

 // Provide implementation for the stop method
 public void stop() {
     System.out.println("Car " + model + " is stopping.");
 }
}

//Another class implementing the same interface
class Bike implements Vehicle {
 private String type;

 // Constructor
 public Bike(String type) {
     this.type = type;
 }

 // Provide implementation for the start method
 public void start() {
     System.out.println("Bike " + type + " is starting.");
 }

 // Provide implementation for the stop method
 public void stop() {
     System.out.println("Bike " + type + " is stopping.");
 }
}

//Main class to demonstrate the concept
public class InterfaceDemo {
 public static void main(String[] args) {
     // You cannot instantiate the interface itself
     // Vehicle vehicle = new Vehicle(); // This line would cause an error

     // Instantiate classes that implement the interface
     Vehicle car = new Car5("Toyota Corolla");
     Vehicle bike = new Bike("Mountain Bike");

     // Call the methods for Car
     car.start();  // Output: Car Toyota Corolla is starting.
     car.stop();   // Output: Car Toyota Corolla is stopping.

     // Call the methods for Bike
     bike.start();  // Output: Bike Mountain Bike is starting.
     bike.stop();   // Output: Bike Mountain Bike is stopping.

     // Access the constant variable from the interface
     System.out.println("Maximum speed for vehicles: " + Vehicle.MAX_SPEED);  // Output: Maximum speed for vehicles: 120
 }
}
