package demo;



class MyClass2 {
    String color;
    int cost;
    String brand;

    // Parameterized constructor
    MyClass2(String color, int cost, String brand) {
        // Using the parameters to initialize instance variables
        this.color = color;
        this.cost = cost;
        this.brand = brand;
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        // Creating objects using the parameterized constructor
        MyClass2 obj1 = new MyClass2("White", 2000, "BMW");
        MyClass2 obj2 = new MyClass2("Black", 3000, "Audi");

        System.out.println(obj1.color + " " + obj1.cost + " " + obj1.brand);
        System.out.println(obj2.color + " " + obj2.cost + " " + obj2.brand);
    }
}

