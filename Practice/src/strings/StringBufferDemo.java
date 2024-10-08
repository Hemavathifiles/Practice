package strings;

public class StringBufferDemo {
    public static void main(String[] args) {
        // Create a StringBuffer instance with initial content
        StringBuffer buffer = new StringBuffer("Start\n");

        // Create the first thread
        Thread thread1 = new Thread(() -> {
        	buffer.append("Message from Thread 1\n");
        });

        // Create the second thread
        Thread thread2 = new Thread(() -> {
            buffer.append("Message from Thread 2\n");
        });

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();//This means "wait here until thread1 is done."
            thread2.join();//This means "wait here until thread2 is done."
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // toString -convert object into string representation
        System.out.println("Final StringBuffer Content:\n" + buffer.toString());
    }
}
