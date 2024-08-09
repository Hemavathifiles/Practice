package demo;

class Student8 {
    String name;
    int age;

    // Constructor
    public Student8(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student information
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ArrayOfObject {
    public static void main(String[] args) {
        // Create an array of Student objects
        Student8[] students = new Student8[3];

        // Initialize the array with Student objects
        students[0] = new Student8("Alice", 20);
        students[1] = new Student8("Bob", 22);
        students[2] = new Student8("Charlie", 21);

        // Display information for each student
        for (Student8 student : students) {
            student.display();
            System.out.println(students);
        }
    }
}
