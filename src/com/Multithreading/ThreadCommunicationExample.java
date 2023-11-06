

public class ThreadCommunicationExample {
    public static void main(String[] args) {
        Message message = new Message();

        Thread producerThread = new Thread(new Producer(message));
        Thread consumerThread = new Thread(new Consumer(message));

        producerThread.start();
        consumerThread.start();
    }
}

class Message {
    private String content;
    private boolean empty = true;

    // Producer puts a message
    public synchronized void put(String content) {
        while (!empty) {
            try {
                wait(); // Wait if the message is not consumed yet
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.content = content;
        empty = false;
        notify(); // Notify the consumer that a message is available
    }

    // Consumer retrieves a message
    public synchronized String get() {
        while (empty) {
            try {
                wait(); // Wait if there's no message to consume
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        empty = true;
        notify(); // Notify the producer that the message has been consumed
        return content;
    }
}

class Producer implements Runnable {
    private Message message;

    public Producer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String[] messages = {"Message 1", "Message 2", "Message 3"};
        for (String msg : messages) {
            message.put(msg);
            System.out.println("Produced: " + msg);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer implements Runnable {
    private Message message;

    public Consumer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            String msg = message.get();
            System.out.println("Consumed: " + msg);
        }
    }
}
