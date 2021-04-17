package lecture6;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class ProducerB implements Runnable {
    BlockingQueue q;

    ProducerB(BlockingQueue q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    public void run() {
        int i = 0;
        try {
            while (true) {
                q.put(i++ + "");
                System.out.println("Put: " + (i-1));
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

class ConsumerB implements Runnable {
    BlockingQueue q;

    ConsumerB(BlockingQueue q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        try {
            while (true) {
                System.out.println("Got: " + q.take());
            }
        } catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

public class PCBlockingQueue {
    public static void main(String[] args) {
        BlockingQueue q = new ArrayBlockingQueue(1);
        new ProducerB(q);
        new ConsumerB(q);
        System.out.println("Press Control-C to stop.");
    }
}
