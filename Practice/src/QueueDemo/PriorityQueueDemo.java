package QueueDemo;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // Create a PriorityQueue for integers
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // Add elements to the queue
        pq.offer(30);  // Add 30
        pq.offer(10);  // Add 10
        pq.offer(20);  // Add 20
        pq.offer(40);  // Add 40
        
        // The queue internally sorts the numbers as 10, 20, 30, 40
        
        // Retrieve and remove elements from the queue
        System.out.println(pq);
        System.out.println(pq.poll());  // Outputs 10 (the smallest number)
        System.out.println(pq);
        System.out.println(pq.poll());  // Outputs 20 (the next smallest number)
        System.out.println(pq);
        System.out.println(pq.poll());  // Outputs 30
        System.out.println(pq);
        System.out.println(pq.poll());  // Outputs 40
        System.out.println(pq);
    }
}
