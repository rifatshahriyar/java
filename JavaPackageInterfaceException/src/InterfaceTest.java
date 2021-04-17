interface Callback {
    void call(int param);
}

class Client implements Callback {
    public void call(int p) {
        System.out.println("call method called with " + p);
    }
    public void f() {
        System.out.println("simple method, not related with Callback");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        // Error, Callback is abstract, can't be instantiated
        // Callback c = new Callback();
        // Can't instantiate an interface directly
        Client client = new Client();
        client.call(42);
        client.f();
        // Accessing implementations through Interface reference
        Callback cb = new Client();
        cb.call(84);
        // cb.f(); Error, no such method in Callback
    }
}
