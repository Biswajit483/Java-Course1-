import java.util.ArrayList;

public class Smruti1 {

	public static void main(String[] args) {
		ArrayList<Object> a1=new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add("hello");
		a1.add(false);
		System.out.println(a1);
		a1.add(1,500);
		System.out.println(a1);
		a1.remove("hello");
		System.out.println(a1);
		a1.remove(new Integer(20));
		System.out.println(a1);
		System.out.println(a1.get(0));
		for(int i=0;i<=a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		
	}

}
