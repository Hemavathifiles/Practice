package demo;



// Concrete class implementing the Greeting interface
class GreetingImpl implements Greeting {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}

public class FunctionalInterface {
    public static void main(String[] args) {
        // Instantiate the concrete class
        Greeting greeting = new GreetingImpl();

        // Use the implemented method
        greeting.sayHello("Alice");  // Output: Hello, Alice!
    }
}
