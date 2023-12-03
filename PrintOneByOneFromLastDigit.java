package LevelPg1;

public class PrintOneByOneFromLastDigit {

	public static void main(String[] args) {
		int num=123;
		int ld;
		while(num>0)
		{
		ld=num%10;
		System.out.print(ld);
		num=num/10;
		}

	}

}
