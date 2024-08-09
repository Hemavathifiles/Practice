package demo;

class MyClass {
    
    String color;
    int cost;
    String Brand;
    }


public class ConstructorDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass(); 
        System.out.println(obj.color +"  "+obj.cost+"  "+obj.Brand);// Calls the default constructor
    }
}
