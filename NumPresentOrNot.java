package Array;

public class NumPresentOrNot {
	public static void main(String[] args) {
		int[]a= {23,45,27,17};
		int count=0;
		int ld;
		for(int i=0;i<a.length;i++) {
			ld=a[i]%10;
			if(ld==7) {
				count++;
			}
			a[i]=a[i]/10;
		}
		if(count>0) {
			System.out.println("7 is present");
		}
		else {
			System.out.println("7 is not present");

		}
	}

}
