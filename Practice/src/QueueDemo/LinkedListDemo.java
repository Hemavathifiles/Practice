package QueueDemo;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Create a queue using LinkedList
    	LinkedList<Integer> queue = new LinkedList<>();
        
        // Add elements to the queue
        queue.add(10);  // Add 10 to the queue
        queue.add(20);  // Add 20 to the queue
        queue.add(30);  // Add 30 to the queue
        
        // Peek at the front element without removing it
        System.out.println("Front element (using peek): " + queue.peek());  // Outputs 10
        
        // Poll: Remove and return the front element
        System.out.println("Removed element (using poll): " + queue.poll());  // Outputs 10
        
        // Peek again to see the new front element
        System.out.println("New front element (using peek): " + queue.peek());  // Outputs 20
        
        // Remove and print the rest of the elements
        System.out.println("Removed element (using poll): " + queue.poll());  // Outputs 20
        System.out.println("Removed element (using poll): " + queue.poll());  // Outputs 30
        
        // Check if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty());  // Outputs true
    }
}
