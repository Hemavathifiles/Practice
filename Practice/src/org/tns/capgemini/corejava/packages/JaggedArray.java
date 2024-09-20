package org.tns.capgemini.corejava.packages;

public class JaggedArray {
    public static void main(String[] args) {
        // Step 1: Declare the jagged array
        int[][] studentsInGrades = new int[3][];

        // Step 2: Initialize the sub-arrays
        studentsInGrades[0] = new int[2]; // Grade 1 has 2 students
        studentsInGrades[1] = new int[3]; // Grade 2 has 3 students
        studentsInGrades[2] = new int[1]; // Grade 3 has 1 student

        // Step 3: Assign values to the elements
        studentsInGrades[0][0] = 10; // Grade 1, Student 1
        studentsInGrades[0][1] = 20; // Grade 1, Student 2

        studentsInGrades[1][0] = 30; // Grade 2, Student 1
        studentsInGrades[1][1] = 40; // Grade 2, Student 2
        studentsInGrades[1][2] = 50; // Grade 2, Student 3

        studentsInGrades[2][0] = 60; // Grade 3, Student 1


        // Iterating over the jagged array
    for (int i = 0; i < studentsInGrades.length; i++) { // Loop through each grade
         for (int j = 0; j < studentsInGrades[i].length; j++) { // Loop through each student in the grade
                System.out.println("Grade " + (i + 1) + ", Student " + (j + 1) + ": " + studentsInGrades[i][j]);
            }
        }
    }
}
