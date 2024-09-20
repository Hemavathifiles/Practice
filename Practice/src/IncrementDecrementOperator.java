
public class IncrementDecrementOperator {
    public static void main(String[] args) {
        int a = 10;

        // Post-increment
        System.out.println("a++: " + a++);  // Prints first, then increments
        System.out.println("After post-increment, a: " + a);

        // Pre-increment
        System.out.println("++a: " + ++a);  // Increments first, then prints

        // Post-decrement
        System.out.println("a--: " + a--);  // Prints first, then decrements
        System.out.println("After post-decrement, a: " + a);

        // Pre-decrement
        System.out.println("--a: " + --a);  // Decrements first, then prints
    }
}
