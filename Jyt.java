import java.util.ArrayList;


public class Jyt {

	public static void main(String[] args) {		int sum=0;
		
		ArrayList<Integer>a1=new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		
		for(int i=0;i<a1.size();i++)
		{
			
			sum=sum+a1.get(i);
			
		}
		System.out.println(sum);
		

	}

}
