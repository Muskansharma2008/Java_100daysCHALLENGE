class MyThread extends Thread {
    public void run() {
        try {
            System.out.println("Thread is running...");

            Thread.sleep(2000);

            System.out.println("Thread is awake.");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Day61_ThreadLifecycle {
    public static void main(String[] args) throws InterruptedException {

        MyThread t = new MyThread();

        // NEW state
        System.out.println("After creation: " + t.getState());

        // Start the thread
        t.start();

        // TIMED_WAITING state
        Thread.sleep(500);
        System.out.println("During sleep: " + t.getState());

        // Wait for the thread to finish
        t.join();

        // TERMINATED state
        System.out.println("After completion: " + t.getState());
    }
}