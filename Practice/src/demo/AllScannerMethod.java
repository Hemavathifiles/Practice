package demo;

import java.util.Scanner;

public class AllScannerMethod {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Prompt and read the user's name (String)
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt and read the user's age (int)
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Prompt and read the user's height in meters (float)
        System.out.print("Enter your height in meters: ");
        float height = scanner.nextFloat();

        // Prompt and read if the user is a student (boolean)
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        // Clear the scanner buffer before reading a line
        //scanner.nextLine();

        // Prompt and read the user's favorite quote (String)
        System.out.print("Enter your favorite quote: ");
        String favoriteQuote = scanner.nextLine();
        scanner.nextLine();

        // Prompt and read the user's favorite hobby (String)
        // Changed to nextLine() to allow for spaces in the hobby
        System.out.print("Enter your favorite hobby: ");
        String hobby = scanner.nextLine();

        // Prompt and read the user's daily reading time in minutes (byte)
        System.out.print("Enter your daily reading time in minutes: ");
        byte readingTime = scanner.nextByte();

        // Prompt and read the user's GPA (double)
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        // Prompt and read the user's number of siblings (short)
        System.out.print("Enter the number of siblings you have: ");
        short siblings = scanner.nextShort();

        // Prompt and read the user's annual income in dollars (long)
        System.out.print("Enter your annual income : ");
        long income = scanner.nextLong();

        // Display the entered information
        System.out.println("\nUser Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        System.out.println("Student: " + isStudent);
        System.out.println("Favorite Quote: " + favoriteQuote);
        System.out.println("Hobby: " + hobby);
        System.out.println("Daily Reading Time: " + readingTime + " minutes");
        System.out.println("GPA: " + gpa);
        System.out.println("Siblings: " + siblings);
        System.out.println("Annual Income: $" + income);

        // Close the Scanner
        scanner.close();
    }
}
