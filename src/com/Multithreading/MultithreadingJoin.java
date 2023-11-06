

public class MultithreadingJoin {
	
    public static void main(String[] args) {
        // Create a thread for Alice
        Thread aliceThread = new Thread(() -> {
            System.out.println("Alice is working on her part...");
            try {
                Thread.sleep(2000); // Simulating some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Alice has finished her part.");
        });

        // Create a thread for Bob
        Thread bobThread = new Thread(() -> {
            System.out.println("Bob is waiting for Alice to finish...");
            try {
                aliceThread.join(); // Bob waits for Alice to finish
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Bob can now start his part.");
        });

        // Start both threads
        aliceThread.start();
        bobThread.start();
    }
}

