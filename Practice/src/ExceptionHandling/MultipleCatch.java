package ExceptionHandling;

public class MultipleCatch{
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            //System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException

            int result = 10 / 0; // This will throw ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
