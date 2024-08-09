package MultiThreading;



public class ErrorDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = add(a, b); // Logical error: Calling subtract instead of add
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
    }

    public static int add
    (int x, int y) {
        return x - y; // This method subtracts instead of adding
    }
}


