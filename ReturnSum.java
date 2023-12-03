package Array;

public class ReturnSum {
	public static int test(int[]a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
		sum=sum+a[i];	
		}
		return sum;
	}
	public static void main(String[] args) {
		int[]a= {1,2,34,1};
		int result=test(a);
		System.out.println(result);
	}
}
