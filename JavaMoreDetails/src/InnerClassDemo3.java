class Outer3
{
    int outer_x = 100;

    void test() {
        for (int i = 0; i < 5; i++) {
            class Inner {
                void display() {
                    System.out.println(outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}

public class InnerClassDemo3 {
    public static void main(String[] args) {
        Outer3 outer = new Outer3();
        outer.test();
    }
}
