class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered A.foo");
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println(name + " trying to call B.last");
        b.last();
    }

    synchronized void last() {
        System.out.println("Inside A.last");
    }

}

class B {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered B.bar");
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println(name + " trying to call A.last");
        a.last();
    }

    synchronized void last() {
        System.out.println("Inside B.last");
    }
}

public class Deadlock implements Runnable {
    A a;
    B b;
    Thread t;

    Deadlock() {
        a = new A();
        b = new B();
        Thread.currentThread().setName("Main Thread");
        t = new Thread(this, "Racing Thread");
    }

    void deadlockStart() {
        t.start();
        a.foo(b);
        System.out.println("Back in Main Thread");
    }

    public void run() {
        b.bar(a);
        System.out.println("Back in Racing Thread");
    }

    public static void main(String[] args) {
        Deadlock deadlock = new Deadlock();
        deadlock.deadlockStart();
    }

}
