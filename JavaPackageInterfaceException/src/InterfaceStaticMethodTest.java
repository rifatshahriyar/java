interface MyIFStatic {
    int getNumber();

    default String getString() {
        return "Default String";
    }

    // This is a static interface method (introduced in Java 8)
    // not inherited by either an implementing class or a subinterface.
    static int getDefaultNumber() {
        return 0;
    }
}

public class InterfaceStaticMethodTest {
    public static void main(String[] args) {
        System.out.println(MyIFStatic.getDefaultNumber());
    }
}
