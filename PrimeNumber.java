package Method;

public class PrimeNumber {
	public static void main(String[] args) {
		int a = 1;
		int b = 10;
		while (a <= b) {
			int count = 0;
			for (int i = 1; i <= a; i++) {
				if (a % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(a);
			}
			a++;

		}

	}

}
