
public class Dhoni {
	
	public static int powerName(int x,int n)
	{
	   int power=1;
	   for(int i=1;i<=n;i++)
	   {
		   power=power*x;
	   }
	   return power;
	}
	public static void main(String[] args) {
		int result=powerName(2,3);
		System.out.println(result);
	}

}
