package ConcurrencyDemo;

class MyTask extends Thread {
    public void run() {
        System.out.println("Task is running in a separate thread.");
    }
}

public class ConcurrencyDemo {
    public static void main(String[] args) {
        MyTask task = new MyTask();  // Creating a new thread (waiter)
        task.start();  // Starting the thread (waiter begins serving a table)
        
        System.out.println("Main thread is doing its own work.");
    }
}

