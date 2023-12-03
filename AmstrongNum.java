
public class AmstrongNum {
	public static void main(String[] args) {
		int num=371;
		int num1=num;
		int ld;
		int sum=0;
		int count=countNum(num);
		int p;
		while(num!=0) {
			ld=num%10;
			p=power(ld,count);
			sum=sum+p;
			num=num/10;
		}
		if(sum==num1) {
			System.out.println(num1+"Amstrong num");
		}else {
			System.out.println(num1+"not Amstrong num");
		}
	}
		public static int countNum(int num) {
			int count=0;
			while(num!=0) {
				num=num/10;
				count++;
			}
			return count;
		}
		public static int power(int x,int n) {
			int power=1;
			for(int i=1;i<=n;i++) {
				power=power*x;
			}
			return power;
				
	}
		
	}

