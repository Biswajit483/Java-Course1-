
public class Pkl1 {
	public static int factorial(int a)
	{
		int fact=1;
		for(int i=a;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
		
	}

	public static void main(String[] args) {
		int num=145;
		int num1=num;
		int sum=0;
		int fact;
		int ld;
		while(num>0)
		{
			ld=num%10;
			fact=factorial(ld);
			sum=sum+fact;
			num=num/10;
		}
		if(sum==num1)
		{
			System.out.println(num1+"strong num");
		}
		else
		{
			System.out.println(num1+"is not strong num");

		}
	}

}
