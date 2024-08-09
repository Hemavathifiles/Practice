package strings;


public class StringBuilderDemo {
    public static void main(String[] args) {
        // Create a StringBuilder instance with initial content
        StringBuilder sb = new StringBuilder("Initial Value");

        // Append strings to the StringBuilder
        sb.append(" - Appended"); // Adds " - Appended" to the end
        sb.append(" - Again");    // Adds " - Again" to the end

        // Insert a string at a specific position
        sb.insert(15, " [Inserted]"); // Inserts " [Inserted]" at index 15

        // Replace a substring with a new string
        sb.replace(16, 27, "[Replaced]"); // Replaces the substring from index 16 to 27 with "[Replaced]"

        // Delete a substring within the given range
        sb.delete(25, 35); // Deletes the substring from index 25 to 35

        // Reverse the entire string
        sb.reverse(); // Reverses the entire string

        // Print the final result
        System.out.println("Final StringBuilder Result: " + sb.toString()); // Outputs the final string
    }
}

