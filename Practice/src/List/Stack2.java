package List;

/*How search Works:
The search method returns the 1-based position from the top of the stack.
If the element is at the top of the stack, search returns 1.
If the element is the second from the top, search returns 2, and so on.
If the element is not found, it returns -1.*/


import java.util.Stack;

public class Stack2 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);  // Bottom element, index 0
        stack.push(20);  // Middle element, index 1
        stack.push(30);  // Top element, index 2

        // Accessing by index (0-based indexing)
        System.out.println("Element at index 0: " + stack.get(0)); // Outputs 10
        System.out.println("Element at index 1: " + stack.get(1)); // Outputs 20
        System.out.println("Element at index 2: " + stack.get(2)); // Outputs 30

        // Searching (1-based indexing)
        System.out.println("Position of 30 from top: " + stack.search(30)); // Outputs 1
        System.out.println("Position of 20 from top: " + stack.search(20)); // Outputs 2
        System.out.println("Position of 10 from top: " + stack.search(10)); // Outputs 3
    }
}
