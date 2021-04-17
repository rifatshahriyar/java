class Buffer {
    int value;

    synchronized int consume() {
        System.out.println(Thread.currentThread().getName() + " consumes: " + value);
        return value;
    }

    synchronized void produce(int value) {
        this.value = value;
        System.out.println(Thread.currentThread().getName() + " produces: " + this.value);
    }
}

class Producer implements Runnable {
    Buffer buffer;

    Producer(Buffer buffer, String name) {
        this.buffer = buffer;
        new Thread(this, name).start();
    }

    public void run() {
        int i = 0;
        while (true) {
            buffer.produce(i++);
        }
    }
}

class Consumer implements Runnable {
    Buffer buffer;

    Consumer(Buffer buffer, String name) {
        this.buffer = buffer;
        new Thread(this, name).start();
    }

    public void run() {
        while (true) {
            buffer.consume();
        }
    }
}

public class IncorrectPC {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        new Producer(buffer, "Producer");
        new Consumer(buffer, "Consumer");
        System.out.println("Press Control-C to stop.");
    }
}
