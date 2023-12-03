
public class Bisu1 {

	public static void main(String[] args) {
	   String s1="abdc123@7";
	   int sum=0;
	   char[]ch=s1.toCharArray();
	   for(int i=0;i<ch.length;i++)
	   {
		   if(ch[i]>='0'&& ch[i]<='9')
		   {
			   sum=sum+ch[i];
		   }
	   }
	   System.out.println("sum of digits is:"+sum);
			   
	
	
	}

}



