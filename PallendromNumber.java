package Method;

public class PallendromNumber {
	public static void main(String[] args) {
		int num=121;
		int num1=num;
		int ld ;
		int rev=0;
		while(num>0) {
			ld=num%10;
			rev=rev*10+ld;
			
			//System.out.println(ld);
			num=num/10;
		}
		if(rev==num1) {
			System.out.println(num1+"is a pallendrom num");
		}
		else {
			System.out.println(num1+"is not a pallendrom num");
		}
	}

}
