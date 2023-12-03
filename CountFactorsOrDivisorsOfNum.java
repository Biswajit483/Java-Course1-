ackage advancejavapg;

public class CountFactorsOrDivisorsOfNum {
public static void main(String[] args) {
	int a=7;
	int count=0;
	for(int i=1;i<=a;i++) {
		if(a%i==0) {
			count++;
		}
		
	}
	System.out.println(count);
	
}
}
