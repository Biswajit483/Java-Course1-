package advancejavapg;

import java.util.Scanner;

public class GreatestNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int n=sc.nextInt();
		int ld;
		int max=0;
		while(n>0) {
			ld=n%10;
			if(ld>max) {
				max=ld;
				
			}
			
		
		n=n/10;
	}
	System.out.println(max);
				
	}

}
