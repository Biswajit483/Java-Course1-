package LevelPg1;

public class LargestOfThreeNum {
	public static void main(String[] args) {
		int a=5;
		int b=10;
		int c=15;
		if(a>b && a>c)
		{
			System.out.println(a+"is largest num");
		}
		else if(b>c)
		{
			System.out.println(b+"is largest num");
		}
		else
		{
			System.out.println(c+"is largest num");
		}
	}

}
