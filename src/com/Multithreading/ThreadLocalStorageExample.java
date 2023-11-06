

public class ThreadLocalStorageExample {
    // Create a ThreadLocal variable to store thread-specific data
    private static ThreadLocal<Integer> threadLocalValue = ThreadLocal.withInitial(() -> 0);

    public static void main(String[] args) {
        // Create and start multiple threads
        Thread thread1 = new Thread(() -> {
            // Set a thread-specific value
            threadLocalValue.set(1);
            System.out.println("Thread 1: ThreadLocal Value = " + threadLocalValue.get());
        });

        Thread thread2 = new Thread(() -> {
            // Set a different thread-specific value
            threadLocalValue.set(2);
            System.out.println("Thread 2: ThreadLocal Value = " + threadLocalValue.get());
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Access the ThreadLocal value in the main thread
        System.out.println("Main Thread: ThreadLocal Value = " + threadLocalValue.get());

        // Remove the ThreadLocal value for the current thread
        threadLocalValue.remove();
    }
}

