
public class CollectionUnboxing {

	public static void main(String[] args) {
		Integer obj1=new Integer(10);
		int a=obj1;//autounboxing
		//int a=obj1.intValue();//unboxing
		System.out.println(a);
		Double obj2=new Double(20.3);
		double b=obj2;
		
		//double b=obj2.doubleValue();//unboxing
		System.out.println(b);
	}

}
