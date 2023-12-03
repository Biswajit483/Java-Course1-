package Array;

import java.util.Scanner;

public class IntegerArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int a=sc.nextInt();
		System.out.println("enter the a number");
		int[]b=new int[a];
		for(int i=0;i<a;i++) {
			b[i]=sc.nextInt();
		}
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		
	}

}
