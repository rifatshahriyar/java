class SharedClass3 {
    void doSomething() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " starts");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
            System.out.println(Thread.currentThread().getName() + " finishes");
        }
    }
}

class ThreadSyncBlock implements Runnable {
    SharedClass3 sharedClass;
    Thread t;

    public ThreadSyncBlock(SharedClass3 s, String name) {
        sharedClass = s;
        t = new Thread(this, name);
        t.start();
    }

    public void run() {
        sharedClass.doSomething();
    }
}

public class SynchronizedBlock {
    public static void main(String[] args) {
        SharedClass3 sharedObject = new SharedClass3();
        ThreadSyncBlock ob1 = new ThreadSyncBlock(sharedObject, "T1");
        ThreadSyncBlock ob2 = new ThreadSyncBlock(sharedObject, "T2");
        ThreadSyncBlock ob3 = new ThreadSyncBlock(sharedObject, "T3");
    }
}
