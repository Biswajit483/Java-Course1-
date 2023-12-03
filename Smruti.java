import java.util.ArrayList;

public class Smruti {

	public static void main(String[] args) {
		ArrayList<Object> a1=new ArrayList<>() ;
		System.out.println(a1.isEmpty());
		a1.add(10);
		a1.add(10.5);
		a1.add(true);
		a1.add("hello");
		System.out.println(a1);
          System.out.println(a1.size());
          System.out.println(a1.isEmpty());
          a1.add(20);
          a1.add(10);
          System.out.println(a1);
          System.out.println(a1.size());
	}

}
