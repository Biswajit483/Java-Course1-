package Array;

public class LargestNumber {
	public static void main(String[] args) {
		int []a= {10,20,30,40};
		int largest=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest) {
				largest=a[i];
			}
		}
		System.out.println("largest num is:"+largest);
		
	}

}
