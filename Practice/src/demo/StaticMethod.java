package demo;

 class MathUtils {
    // Static method to calculate the square of a number
    public static int square(int number) {
        return number * number;
    }

    // Static method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        // Calling static methods using the class name
        int result1 = MathUtils.square(5);
        int result2 = MathUtils.add(3, 7);

        System.out.println("Square of 5: " + result1);
        System.out.println("Sum of 3 and 7: " + result2);
    }
}
