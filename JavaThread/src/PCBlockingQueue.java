import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class ProducerB implements Runnable {
    BlockingQueue queue;

    ProducerB(BlockingQueue queue, String name) {
        this.queue = queue;
        new Thread(this, name).start();
    }

    public void run() {
        int i = 0;
        try {
            while (true) {
                queue.put(i++);
                System.out.println(Thread.currentThread().getName() + " produces: " + (i-1));
            }
        } catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

class ConsumerB implements Runnable {
    BlockingQueue queue;

    ConsumerB(BlockingQueue queue, String name) {
        this.queue = queue;
        new Thread(this, name).start();
    }

    public void run() {
        try {
            while (true) {
                System.out.println(Thread.currentThread().getName() + " consumes: " + queue.take());
            }
        } catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

public class PCBlockingQueue {
    public static void main(String[] args) {
        BlockingQueue queue = new ArrayBlockingQueue(1);
        new ProducerB(queue, "Producer");
        new ConsumerB(queue, "Consumer");
        System.out.println("Press Control-C to stop.");
    }
}
