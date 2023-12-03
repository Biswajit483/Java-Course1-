
public class Except {
	public static void test()//called method
	{
		int a=10;
		int b=0;
		System.out.println(a/b);

	}
	public static void main(String[] args)//calling method 
	{
		System.out.println("main()started");
		try
		{
		test();
		}
		catch(Exception e)
		{
			System.out.println("exception handled");
			e.printStackTrace();
		}
		System.out.println("main()ended");
	}
}
