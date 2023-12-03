package Array;

public class LowerCaseChar {
	public static void lowerCase(char[]a) {
		for(int i=0;i<a.length;i++) {
			if(a[i]>='a' && a[i]<='z') {
				System.out.println(a[i]);
			}
		}
		
	}
	public static void main(String[] args) {
		char[]a= {'a','B','Z','D','e'};
		lowerCase(a);
	}
}
