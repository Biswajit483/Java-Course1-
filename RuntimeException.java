import java.util.Scanner;

public class RuntimeException {
	public static void main(String[] args) {
		System.out.println("main()started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int a= sc.nextInt();
		System.out.println("enter b num");
		int b=sc.nextInt();
		try {
			
		
		System.out.println(a/b);
		}
		catch(Runtimeexception e)
		{
			
		}
		
	}

}
