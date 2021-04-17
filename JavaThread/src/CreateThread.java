public class CreateThread {
    public static void main(String[] args) {
        CreateThread ct = new CreateThread();
        new Thread(ct::f1, "T1").start();
    }

    public void f1() {
        for(int i = 5; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
