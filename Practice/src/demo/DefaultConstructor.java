package demo;


class MyClass1 {
    String color;
    int cost;
    String brand;

    // Default constructor
    MyClass1() {
        // Assigning default values
        color = "Pink";
        cost = 2000000;
        brand = "BMW";
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        // Creating an object using the default constructor
        MyClass1 obj = new MyClass1();
        System.out.println(obj.color + " " + obj.cost + " " + obj.brand);
    }
}
