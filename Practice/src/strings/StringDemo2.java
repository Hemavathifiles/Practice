package strings;

public class StringDemo2 {
    public static void main(String[] args) {
        // Creating a String
        String s1 = "Hello"; // s1 points to the string "Hello"

        // Creating another reference to the same String object
        String s2 = s1; // s2 also points to the string "Hello"

        // Attempting to change s1
        s1 = "World"; // s1 now points to a new string "World"
        s1="hema";

        // s1 now refers to the new string "World"
        // s2 still refers to the original string "Hello"
        System.out.println("s1: " + s1); // Output: s1: World
        System.out.println("s2: " + s2); // Output: s2: Hello
    }
}
