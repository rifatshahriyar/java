public class ExceptionThrow {
    public static void f() {
        try {
            throw new NullPointerException("f");
        } catch (Exception e) {
            System.out.println("Inside catch of f()");
            throw e; //rethrow the exception
        }
    }

    public static void main(String args[]) {
        try {
            f();
        } catch (NullPointerException e) {
            System.out.println("Inside catch of main()");
        }
    }
}
	