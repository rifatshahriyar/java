class SharedClass2 {
    synchronized void doSomething() {
        System.out.println(Thread.currentThread().getName() + " starts");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println(Thread.currentThread().getName() + " finishes");
    }
}

class ThreadSyncMethod implements Runnable {
    SharedClass2 sharedClass;
    Thread t;

    public ThreadSyncMethod(SharedClass2 s, String name) {
        sharedClass = s;
        t = new Thread(this, name);
        t.start();
    }

    public void run() {
        sharedClass.doSomething();
    }
}

public class SynchronizedMethod {
    public static void main(String[] args) {
        SharedClass2 sharedObject = new SharedClass2();
        ThreadSyncMethod ob1 = new ThreadSyncMethod(sharedObject, "T1");
        ThreadSyncMethod ob2 = new ThreadSyncMethod(sharedObject, "T2");
        ThreadSyncMethod ob3 = new ThreadSyncMethod(sharedObject, "T3");
    }
}
