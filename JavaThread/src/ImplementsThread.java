class NewThread1 implements Runnable {
    Thread t;
    NewThread1() {
        t = new Thread(this);
        t.start();
    }
    // This is the entry point for the thread.
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}

public class ImplementsThread {
    public static void main(String[] args) throws Exception {
        new NewThread1();
        for(int i = 10; i > 0; i--) {
            System.out.println("Main Thread: " + i);
            Thread.sleep(1000);
        }
    }
}
