package TwoDArray;

import java.util.Scanner;

public class TwoDArrayCustom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scan.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = scan.nextInt();

        int[][] multidimensionalArray = new int[rows][columns];

        // Prompt the user to enter values for each element in the array
        System.out.println("Enter the values for the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter value for element [" + i + "][" + j + "]: ");
                multidimensionalArray[i][j] = scan.nextInt();
            }
        }

        // Print the 2D array
        System.out.println("Two-Dimensional Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(multidimensionalArray[i][j] + " ");
            }
            System.out.println();
        }

        scan.close();
    }
}
