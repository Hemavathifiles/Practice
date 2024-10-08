package demo;

class Person3 {
    String name;
    int age;

    // Constructor with no parameters
    public Person3() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor with one parameter (name)
    public Person3(String name) {
        this.name = name;
        this.age = 0;
    }

    // Constructor with two parameters (name and age)
    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Person3 person1 = new Person3();                // Calls constructor with no parameters
        Person3 person2 = new Person3("John");          // Calls constructor with name
        Person3 person3 = new Person3("Alice", 25);     // Calls constructor with name and age

        person1.display();  // Output: Name: Unknown, Age: 0
        person2.display();  // Output: Name: John, Age: 0
        person3.display();  // Output: Name: Alice, Age: 25
    }
}
