package Method;

public class RecursivMethod2 {
	public static void test(int a,int b) {
		if(a>b) {
			return;
		}
		if(a%2==0) {
			System.out.println(a);
		}
		a++;
		test(a,b);
		
	}
	public static void main(String[] args) {
		test(10,20);
	}

}
