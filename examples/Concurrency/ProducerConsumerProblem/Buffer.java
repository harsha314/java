package Concurrency.ProducerConsumerProblem;

class Buffer {
    private int data;
    private boolean empty = true;

    public synchronized void produce(int value) {
        while (!empty) {
            try {
                wait(); // Buffer is full, wait for the consumer to consume data
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        data = value;
        empty = false;
        System.out.println("Produced: " + value);
        notify(); // Notify the consumer that data is available
    }

    public synchronized int consume() {
        while (empty) {
            try {
                wait(); // Buffer is empty, wait for the producer to produce data
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int consumedData = data;
        empty = true;
        System.out.println("Consumed: " + consumedData);
        notify(); // Notify the producer that the buffer is empty
        return consumedData;
    }
}
