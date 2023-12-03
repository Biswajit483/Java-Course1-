import java.util.Scanner;
public class Practice1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int num=sc.nextInt();
		int sum=0;
		//int a=1;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println(num+"is a perfect num");
		}
		else
		{
			System.out.println(num+"is not a perfect num");

		}
		
	}

}
