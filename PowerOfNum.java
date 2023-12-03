package LevelPg1;

public class PowerOfNum {
	public static void main(String[] args) {
		int x=2;
		int n=3;
		int power=1;
		for(int i=n;i>=1;i--)
		{
			power=power*x;
		}
		System.out.println(power);
	}

}
