package controlstatements;

public class constructors_Important {
	int empId;
	String empName;
	
	public  constructors_Important(int i,String empName)
	{
		this.empId=i;
		this.empName=empName;
	}
	public void display()
	{
		System.out.println(empId);
		System.out.println(empName);
	}
	public static void main(String[] args) {
		 constructors_Important ob=new  constructors_Important(25,"Hello");
		 ob.display();
	}

}
