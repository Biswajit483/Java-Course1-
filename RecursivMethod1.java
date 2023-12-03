package Method;

public class RecursivMethod1 {
	public static void test(int a) {
		if(a==11) {
			return;
		}
		System.out.println(a);
		a++;
		test(a);
	}

	public static void main(String[] args) {
		test(1);
           
	}

}
