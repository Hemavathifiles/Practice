package List;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        // Creating a stack to hold integers
        Stack<Integer> stack = new Stack<Integer>();

        // Push operation: Adding elements to the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        // Displaying the stack
        System.out.println("Stack after pushes: " + stack);

        // Peek operation: Looking at the top element without removing it
        System.out.println("Top element: " + stack.peek());

        // Pop operation: Removing elements from the stack
        System.out.println("Element popped: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Searching for an element in the stack
        int position = stack.search(2);
        if (position != -1) {
            System.out.println("Element 2 found at position: " + position);
        } else {
            System.out.println("Element 2 not found in the stack.");
        }
    }
}
