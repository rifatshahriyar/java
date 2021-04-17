package lecture5;

public class TestException1
{
	public static void main(String args[]) {
		int a = 10, b = 0;
		int c = a/b; // ArithmeticException: / by zero
        System.out.println(a);
		System.out.println(b);
		System.out.println(c);
        String s = null;
        System.out.println(s.length()); // NullPointerException
    }
}	
