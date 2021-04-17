public class StaticTest {
    static int a = 3, b;
    int c;

    {
        c = 10;
        System.out.println("Hello World");
    }

    static void f1(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        // System.out.println("c = " + c); // Error
    }
    int f2() {
        return a*b;
    }
    static {
        b = a*4;
        // c = b; // Error
    }
    public static void main(String[] args) {
        f1(42); // StaticTest.f1(84);
        System.out.println("b = " + b);
        //System.out.println("Area = " + f2());   // Error
        StaticTest st = new StaticTest();
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();

    }
}
