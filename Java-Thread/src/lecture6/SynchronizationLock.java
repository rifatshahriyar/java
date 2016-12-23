package lecture6;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

class CallMe3 {
    Lock lock = new ReentrantLock();
     void call(String msg) {
         lock.lock();
         System.out.print("[" + msg);
         try {
            Thread.sleep(1000);
         } catch (InterruptedException e) {
            System.out.println("Interrupted");
         }
         System.out.println("]");
         lock.unlock();
     }
}

class Caller3 implements Runnable {
    String msg;
    CallMe3 target;
    Thread t;

    public Caller3(CallMe3 c, String s) {
        target = c;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        target.call(msg);
    }
}

public class SynchronizationLock {
    public static void main(String[] args) {
        CallMe3 target = new CallMe3();
        Caller3 ob1 = new Caller3(target, "Hello");
        Caller3 ob2 = new Caller3(target, "Synchronized");
        Caller3 ob3 = new Caller3(target, "World");
    }
}
