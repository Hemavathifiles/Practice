package ComparableDemo;

import java.util.Arrays;

//Define the Person class that implements Comparable<Person>
public class Person implements Comparable<Person> {
 private String name;
 private int age;

 // Constructor
 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Implement the compareTo() method to compare by age
 @Override
 public int compareTo(Person other) {
     return Integer.compare(this.age, other.age);
 }

 // Override toString() to display person details
 @Override
 public String toString() {
     return name + " (" + age + ")";
 }

 public static void main(String[] args) {
     // Create some Person objects
     Person p1 = new Person("Alice", 30);
     Person p2 = new Person("Bob", 25);
     Person p3 = new Person("Charlie", 35);

     // Put them in an array
     Person[] people = { p1, p2, p3 };

     // Print the array before sorting
     System.out.println("Before sorting:");
     for (Person p : people) {
         System.out.println(p);
     }

     // Sort the array of Person objects
     Arrays.sort(people);

     // Print the array after sorting
     System.out.println("\nAfter sorting by age:");
     for (Person p : people) {
         System.out.println(p);
     }
 }
}
