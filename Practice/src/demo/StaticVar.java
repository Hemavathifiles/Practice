package demo;

public class StaticVar {
    // Static variables for shared information
   

    // Instance variables for individual mobile details
     String name;
     double price;
    public static String category="Smart Phone";

    // Constructor to initialize instance variables
    public StaticVar(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Method to display mobile details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Category: " + category);
       
    }

    public static void main(String[] args) {
        // Creating instances of Mobile
    	StaticVar mobile1 = new StaticVar("IPHONE", 299.99);
       StaticVar mobile2 = new StaticVar("REDMI", 399.99);
       

        // Displaying details of each mobile
        System.out.println("Mobile 1 Details:");
        mobile1.displayDetails();
        
        System.out.println("\nMobile 2 Details:");
        mobile2.displayDetails();

        System.out.println(StaticVar.category);
       
    }
}
