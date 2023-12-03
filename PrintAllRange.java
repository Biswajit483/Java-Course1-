package Method;

import java.util.Iterator;

import LevelPg1.ForLoop;

public class PrintAllRange {
	public static void test(int a, int b) {
		int sum=0;
		for (int i = a; i <= b; i++) {
			sum=sum+i;
			//System.out.println(i);
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		test(10, 20);
	}

}
