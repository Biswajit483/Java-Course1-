package advancejavapg;

public class PrimeNum1 {
	public static void main(String[] args) {
		int i=11;
		int count=0;
		for(int a=i;a>=1;a--) {
			if(i%a==0) {
				count++;
			}
			
			
		}
		if(count==2) {
			System.out.println(i+"prime num");
		}else {
			System.out.println(i+"not prime num");

		}

}
}
