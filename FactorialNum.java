package Method;

public class FactorialNum {
	public static int factorial(int num) {
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		int result=factorial(4);
		System.out.println(result);
	}

}
