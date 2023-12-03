import java.util.Scanner;

public class Excep {

	public static void main(String[] args) {
		System.out.println("main()started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of a ");
		int a=sc.nextInt();
		System.out.println("enter values of b");
		int b= sc.nextInt();
		try
		{
		System.out.println(a/b);
		}
		catch(Exception e )
		{
			//System.out.println("don't devide a num by zero");
			System.out.println("Exception handled");
		}
		System.out.println("main()ended");
	
	}

}
