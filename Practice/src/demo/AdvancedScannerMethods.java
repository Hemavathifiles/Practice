package demo;

import java.util.Scanner;

public class AdvancedScannerMethods {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Prompt and read input from the user
        System.out.println("Enter some data (you can enter numbers and text):");

        // Read and process the input
        while (scanner.hasNext()) { // Check if there is another token
            if (scanner.hasNextInt()) { // Check if the next token is an integer
                int intValue = scanner.nextInt();
                System.out.println("Read an integer: " + intValue);
            } else if (scanner.hasNextDouble()) { // Check if the next token is a double
                double doubleValue = scanner.nextDouble();
                System.out.println("Read a double: " + doubleValue);
            } else if (scanner.hasNextLine()) { // Check if there is another line
                String line = scanner.nextLine();
                System.out.println("Read a line: " + line);
            } else {
                // Handle other types of input or unknown cases
                System.out.println("Unknown input type");
                scanner.next(); // Consume the next token
            }
        }

        // Close the Scanner
        scanner.close();
    }
}
