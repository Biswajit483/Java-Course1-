






















































package UserInput;

public class Practice {
	public static int countNum(int num) {
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
			
			
		}
		return count;
	}
	public static int powerNum(int x,int n) {
		int power=1;
		for(int i=1;i<=n;i++) {
			power=power*x;
		}
		return power;
	}
	public static void main(String[] args) {
	int num=371;
	int num1=num;
	int ld;
	int count=countNum(num);
	int p;
	int sum=0;
	while(num>0) {
		ld=num%10;
		p=powerNum(ld,count);
		sum=sum+p;
		num=num/10;
		
	}	
	if(sum==num1) {
		System.out.println(num1+"amstrong num");
	}
	else {
		System.out.println(num1+" is not amstrong num");

	}
	}

}
