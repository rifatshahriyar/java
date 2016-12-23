package lecture5;

interface MyIFStatic {

    int getNumber();

    default String getString() {
        return "Default String";
    }

    // This is a static interface method.
    static int getDefaultNumber() {
        return 0;
    }
}

public class InterfaceStaticMethodTest {
    public static void main(String[] args) {
        System.out.println(MyIFStatic.getDefaultNumber());
    }
}
