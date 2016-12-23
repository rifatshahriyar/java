package lecture5;

public class TestException3
{
	public static void f() throws Exception {
		int a = 10;
		int b = 0;
		int c = a/b;
	}

	public static void main(String args[])
	{
		try {
			f();		
		} catch(Exception e) {
			System.out.println (e);
            e.printStackTrace();
		}
		System.out.println("Hello World");
	}
}	
		
