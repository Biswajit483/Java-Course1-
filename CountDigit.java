package UserInput;

import java.util.Scanner;

public class CountDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int count=0;
		
		int num=sc.nextInt();
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println("count total num of digit are:"+count);
			
	}

}
