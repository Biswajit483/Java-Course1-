
public class Driver2 {

	public static void main(String[] args) {
		Employee e1=new Employee("bisu",123,30000.00,"QA");
		Employee e2=new Employee("AJIT",124,250000.0,"Qc");
		Employee e3=new Employee("smruti",125,30000.0,"Ql");
		displayDetails(e1);
		displayDetails(e2);
		displayDetails(e3);
	}

		
		
		public static void displayDetails(Employee e)
		{
		
			System.out.println("name:"+e.name);
			System.out.println("eid:"+e.eid);
			System.out.println("salary:"+e.salary);
			System.out.println("Designation:"+e.Designation);
		}
	

	
	}

	
