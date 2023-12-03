package Method;

public class LargestPrimeNum {
	public static void main(String[] args) {
		int a=1;
		int b=10;
		int maxprime=0;
		while(a<=b) {
			int count=0;
			for(int i=1;i<=a;i++) {
				if(a%i==0) {
					count++;
				}
			}
			if(count==2) {
				maxprime=a;
			}
			a++;
		}
		System.out.println("maxprime is:"+maxprime);
		
		
		
		
	}
}
