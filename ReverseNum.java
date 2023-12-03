package advancejavapg;

import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int a=sc.nextInt();
		int rev=0;
		int ld;
		while(a>0) {
			ld=a%10;
			rev=rev*10+ld;
			a=a/10;
		}
		System.out.println(rev);
	}

}
