package LevelPg1;

public class CountOfOddNum {
	public static void main(String[] args) {
		int i = 1;
		int count = 0;
		while (i <= 10) {
			if (i % 2 == 1) {

//				System.out.println(i);
				count++;
			}
			i++;
		}
		System.out.println(count);
	}

}
