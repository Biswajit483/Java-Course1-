package Method;

public class DiseriumNum {
	public static int countNum(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;

		}
		return count;

	}

	public static int power(int x, int n) {
		int power = 1;
		for (int i = n; i >= 1; i--) {
			power = power * x;
		}
		return power;
	}

	public static void main(String[] args) {
		int num = 89;
		int num1 = num;
		int count = countNum(num);
		int sum = 0;
		int ld;
		int p;
		while (num > 0) {
			ld = num % 10;
			p = power(ld, count);
			count--;
			sum = sum + p;
			num = num / 10;

		}
		if (sum == num1) {
			System.out.println(num1 + "is a Diserium num");
		} else {
			System.out.println(num1 + "is not a Diserium num");

		}

	}

}
