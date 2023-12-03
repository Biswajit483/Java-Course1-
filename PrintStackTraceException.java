import javax.management.RuntimeErrorException;

public class PrintStackTraceException {
	public static void test()
	{
		int a=10;
		int b=0;
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		System.out.println("main()started");
		try {
			
		test();
		}
		catch(ArithmeticException e)
		{
		System.out.println("catch exception handled");
		e.printStackTrace();
		}
		System.out.println("main()ended");
		
	}

}
