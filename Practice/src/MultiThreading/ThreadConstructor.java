package MultiThreading;

// Task classes
class BoilWater implements Runnable {
    @Override
    public void run() {
        System.out.println("Boiling water...");
    }
}

class ToastBread implements Runnable {
    @Override
    public void run() {
        System.out.println("Toasting bread...");
    }
}

class FryEggs implements Runnable {
    @Override
    public void run() {
        System.out.println("Frying eggs...");
    }
}

public class ThreadConstructor {
    public static void main(String[] args) {
        // 1. Using the basic constructor
        // Note: Basic constructor does not support setting Runnable after creation
        // Use other constructors for proper functionality
        Thread thread1 = new Thread(() -> System.out.println("Default Runnable Task..."));
        thread1.setName("BasicThread");
        thread1.start(); // Starts the thread

        // 2. Using Thread(String name) constructor
        Thread thread2 = new Thread("ToasterThread") {
            public void run() {
                System.out.println("Toasting bread...");
            }
        };
        thread2.start(); // Starts the thread
        thread2.start();

        // 3. Using Thread(Runnable r) constructor
        Thread thread3 = new Thread(new FryEggs()); // Create a thread with a Runnable task
        thread3.setName("FryEggsThread");
        thread3.start(); // Starts the thread

        // 4. Using Thread(Runnable r, String name) constructor
        Thread thread4 = new Thread(new BoilWater(), "BoilWaterThread"); // Create a thread with Runnable and name
        thread4.start(); // Starts the thread
    }
}
