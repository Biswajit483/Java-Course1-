package UserInput;

import java.util.Scanner;

public class AddOfTwoNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=a+b;
		System.out.println("sum of two num is:"+sum);
	}

}
