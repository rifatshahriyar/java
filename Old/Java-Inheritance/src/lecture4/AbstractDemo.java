package lecture4;

abstract class S {
    // abstract method
    abstract void call();
    // concrete methods are still allowed in abstract classes
    void call2() {
        System.out.println("This is a concrete method");
    }
}

class T extends S {
    void call() {
        System.out.println("T's implementation of call");
    }
}

class AbstractDemo {
    public static void main(String args[]) {
        // S s = new S(); // S is abstract; cannot be instantiated
        T t = new T();
        t.call();
        t.call2();
    }
}
