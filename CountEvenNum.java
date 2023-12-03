package Array;

import java.security.DomainCombiner;

public class CountEvenNum {
	public static int countEven(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				count++;
			}

		}
		return count;

	}

	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5, 6 };
		int result = countEven(a);
		System.out.println(result);

	}
}
