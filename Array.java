
public class Array {
   public static void main(String[] args) {
//	int []a= {10,20,30,40};
//	int largest=a[0];
//	for(int i=0;i<a.length;i++)
//	{
//		if(a[i]>largest)
//		{
//			largest=a[i];
//		}
//	}
//	System.out.println("largest num is:"+largest);
	int []a= {17,12,15,27};
	int count=0;
	int b;
	for(int i=0;i<a.length;i++)
	{
		while(a[i]>0)
		{
			b=a[i]%10;
			if(b==7)
			{
				count++;
			}
			a[i]=a[i]/10;
		}
		
	}
	if(count>0)
	{
		System.out.println("7 is present");
	}
	else
	{
		System.out.println("7 is not present");
	}
	
}
}
