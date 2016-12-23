package lecture5;

public class TestException5
{
    public static void main(String args[])
    {
        int a = 10, b = 0, c = 0;
        try {
            c = a / b;
        } catch(ArithmeticException e1) {
            System.out.println(e1);
        } catch(NullPointerException e2) {
            System.out.println(e2);
        } finally {
            // finally block will always execute
            System.out.println ("In Finally");
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
