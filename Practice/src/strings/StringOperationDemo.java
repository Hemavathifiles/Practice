package strings;

public class StringOperationDemo {
    public static void main(String[] args) {
        // Initialize strings for demonstration
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "   Java Programming   ";
        String str4 = "Replace this text";
        String str5 = "apple,banana,orange";

        // 1. Concatenation
        // Using + operator
        String concatenated1 = str1 + " " + str2;
        // Using concat() method
        String concatenated2 = str1.concat(" ").concat(str2);
        System.out.println("Concatenation using + operator: " + concatenated1);
        System.out.println("Concatenation using concat() method: " + concatenated2);


        // 2. Substring Extraction
        // Extracting a substring from index 3 to the end
        String substring = str3.substring(3);
        // Extracting a substring from index 3 to 10
        String substringRange = str3.substring(3, 10);
        System.out.println("Substring from index 3: '" + substring + "'");
        System.out.println("Substring from index 3 to 10: '" + substringRange + "'");

        // 3. Replacement
        // Replacing "this text" with "the new text"
        String replacedString = str4.replace("this text", "the new text");
        System.out.println("Replaced string: " + replacedString);

        // 4. Splitting
        // Splitting the string by comma
        String[] fruits = str5.split(",");
        System.out.println("Fruits split by comma:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 5. Trimming
        // Removing leading and trailing whitespace
        String trimmedString = str3.trim();
        System.out.println("Trimmed string: '" + trimmedString + "'");

        // 6. Case Conversion
        // Converting to lowercase
        String lowerCaseStr = str1.toLowerCase();
        // Converting to uppercase
        String upperCaseStr = str1.toUpperCase();
        System.out.println("Lowercase version of str1: " + lowerCaseStr);
        System.out.println("Uppercase version of str1: " + upperCaseStr);
    }
}
