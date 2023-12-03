package Method;

public class PositionNum {
   public static void main(String[] args) {
	int num=0445234;
	
	int firstDigit=0;
	
	while(num>=0) {
		firstDigit=num%10;
		num=num/10;
		
	}
	System.out.println(firstDigit);
}
}
