package LevelPg1;

public class PerfectNo {
	public static void main(String[] args) {
		int i = 6;
		int a = 1;
		int sum = 0;
		while (i > a) {
			if (i % a == 0) {
				sum = sum + a;
			}
			a++;
		}
		if (sum == i) {
			System.out.println(i + "is a perfect num");
		} else {
			System.out.println(i + "is not a perfect num");

		}
	}

}
