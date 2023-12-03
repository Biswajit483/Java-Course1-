package advancejavapg;

public class PerfectNum {
	public static void main(String[] args) {
		int num=6;
		int a=1;
		int sum=0;
		while(num>a) {
			if(num%a==0) {
				       
				sum=sum+a;
			}
			a++;
		}
		if(sum==num) {
			System.out.println(num+"perfect num");
		}else {
			System.out.println(num+" is not a perfect num");

		}
	}

}
