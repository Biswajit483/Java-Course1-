package Method;

public class PrintLastDigit {
	public static int test(int num){
		int ld=0;
		
		while(num>0) {
			int res=num%10;
			 ld=ld*10+res;
			 num=num/10;
			
		}
		return ld;
		
	}
	public static void main(String[] args) {
		int result=test(123);
		System.out.println(result);
	}
		
	
}
