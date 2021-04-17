class OuterStaticInner {

    private int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display(this);
    }
    // this is a static nested class
    static class Inner {
        void display(OuterStaticInner outer) {
            System.out.println(outer.outer_x);
        }
    }
}

public class StaticNestedClassDemo {
    public static void main(String[] args) {
        OuterStaticInner outer = new OuterStaticInner();
        outer.test();
        OuterStaticInner.Inner x = new OuterStaticInner.Inner();
        x.display(outer);
    }
}