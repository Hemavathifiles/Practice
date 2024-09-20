public class LogicalDemo {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 20;

        // Logical AND
        System.out.println("(a > b) && (b < c): " + ((a > b) && (b < c)));

        // Logical OR
        System.out.println("(a > b) || (b > c): " + ((a > b) || (b > c)));

        // Logical NOT
        System.out.println("!(a > b): " + !(a > b));
    }
}
