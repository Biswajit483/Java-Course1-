package UserInput;

import java.util.Scanner;

public class PrintRangeNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("print the range in bet"+a+"and"+b+"are:");
		for(int i=a;i<=b;i++) {
			System.out.println(i);
		}
	}

}
