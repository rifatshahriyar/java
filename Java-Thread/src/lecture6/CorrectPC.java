package lecture6;

class QC {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        if(!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        System.out.println("Got: " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        if(valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("Put: " + n);
        notify();
    }
}

class ProducerC implements Runnable {
    QC q;

    ProducerC(QC q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    public void run() {
        int i = 0;
        while(true) {
            q.put(i++);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }
}

class ConsumerC implements Runnable {
    QC q;

    ConsumerC(QC q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        while(true) {
            q.get();
        }
    }
}

public class CorrectPC {
    public static void main(String[] args) {
        QC q = new QC();
        new ProducerC(q);
        new ConsumerC(q);
        System.out.println("Press Control-C to stop.");
    }
}
