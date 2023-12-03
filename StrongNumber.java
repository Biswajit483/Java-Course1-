package Method;

public class StrongNumber {
	public static int factorial(int a) {
		int fact=1;
		for(int i=a;i>=1;i--) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		int num=145;
		int num1=num;
		int fact;
		int sum=0;
		int ld;
		while(num>0)//145>0
		{
			ld=num%10;//5
			fact=factorial(ld);
			sum=sum+fact;//120+24+1
			num=num/10;
		}
		if(sum==num1)
		{
			System.out.println(num1+"is a strong num");
		}
		else
		{
			System.out.println(num1+"is not a strong num");
		}

	}

}
