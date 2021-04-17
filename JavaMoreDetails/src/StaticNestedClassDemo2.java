class OuterStaticInner2 {

    private int outer_x = 100;
    static int static_x = 200;

    // this is a static nested class
    static class Inner {
        int inner_x = 100;

        void print() {
            // System.out.println(outer_x);
            System.out.println(static_x);
            System.out.println(inner_x);
        }
    }
}

public class StaticNestedClassDemo2 {
    public static void main(String[] args) {
        OuterStaticInner2.Inner x = new OuterStaticInner2.Inner();
        x.print();
    }
}