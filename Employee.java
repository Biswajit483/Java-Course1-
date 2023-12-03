
public class Employee {
	private String name;
	private int eid;
	private Double salary;
	private String Designation;
	
	public String getname()
	{
	return name;
	}
	public void set(String name)
	{
		this.name=name;
	}
	public int geteid()
	{
		return eid;
	}
	public void set(int eid)
	{
		this.eid=eid;
	}
	public Double  getsalarye()
	{
		return salary;
	}
	public void set(Double salary)
	{
		this.salary=salary;
	}
	public String getDesignation()
	{
	return Designation;
	}
	public void set(String Designation)
	{
		this.Designation=Designation;
	}
		
		public void working()
	
	{
		System.out.println(name+"is working as"+Designation);
	}
	Employee(String name,int eid,Double salary,String Designation)
	{
		this.name=name;
		this.eid=eid;
		this.salary=salary;
		this.Designation=Designation;
		
	}
}

