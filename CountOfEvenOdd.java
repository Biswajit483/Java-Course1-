package LevelPg1;

public class CountOfEvenOdd {
public static void main(String[] args) {
	int i=10;
	int evencount=0;
	int oddcount=0;
	while(i<=20)
	{
		if(i%2==0)
		{
			evencount++;
		}
		else
		{
			oddcount++;
		}
		i++;
	}
	System.out.println("even num count is:"+evencount);
	System.out.println("odd num count is:"+oddcount);

}
}
