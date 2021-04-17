class ThreadSyncBlock2 implements Runnable {
    SharedClass sharedClass;
    Thread t;

    public ThreadSyncBlock2(SharedClass s, String name) {
        sharedClass = s;
        t = new Thread(this, name);
        t.start();
    }

    public void run() {
        synchronized (sharedClass) {
            sharedClass.doSomething();
        }
    }
}

public class SynchronizedBlock2 {
    public static void main(String[] args) {
        SharedClass sharedObject = new SharedClass();
        ThreadSyncBlock2 ob1 = new ThreadSyncBlock2(sharedObject, "T1");
        ThreadSyncBlock2 ob2 = new ThreadSyncBlock2(sharedObject, "T2");
        ThreadSyncBlock2 ob3 = new ThreadSyncBlock2(sharedObject, "T3");
    }
}
