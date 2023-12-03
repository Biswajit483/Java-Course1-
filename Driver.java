
public class Driver {

	public static void main(String[] args) {
		Bike b1=new Bike("ninja",35,250000.0);
		Bike b2=new Bike("bmw",40,250000.0);
		Bike[]b= {b1,b2};
		int maxMileage=0;
		int maxMilindex=0;
		for(int i=0;i<b.length;i++)
		{
			if(b[i].mileage>maxMileage)
			{
				maxMileage=b[i].mileage;
				maxMilindex=i;
			}
		}
		
			System.out.println("name:"+b[maxMilindex].name);
			System.out.println("mileage:"+b[maxMilindex].mileage);
			System.out.println("price:"+b[maxMilindex].price);
			
		
				
	}

}
