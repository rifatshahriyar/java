class SharedClass {
    void doSomething() {
        System.out.println(Thread.currentThread().getName() + " starts");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println(Thread.currentThread().getName() + " finishes");
    }
}

class ThreadNoSync implements Runnable {
    SharedClass sharedClass;
    Thread t;

    public ThreadNoSync(SharedClass s, String name) {
        sharedClass = s;
        t = new Thread(this, name);
        t.start();
    }

    public void run() {
        sharedClass.doSomething();
    }
}

public class NonSynchronized {
    public static void main(String[] args) {
        SharedClass sharedObject = new SharedClass();
        ThreadNoSync ob1 = new ThreadNoSync(sharedObject, "T1");
        ThreadNoSync ob2 = new ThreadNoSync(sharedObject, "T2");
        ThreadNoSync ob3 = new ThreadNoSync(sharedObject, "T3");
    }
}
