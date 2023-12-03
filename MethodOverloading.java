package UserInput;

public class MethodOverloading {
	public static void test()
	{
		System.out.println("hii");
	}
	public static void test(int a) {
		System.out.println("hello");
	}
public static void main(String[] args) {
	System.out.println("main()started");
	test();
	test(3);
}
}

