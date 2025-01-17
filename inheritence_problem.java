package oops;
class Member{
	String Name="";
	int age;
	double PhoneNo;
	String address="";
	int salary;
	public void printDetails(){
		System.out.println(Name);
		System.out.println(age);
		System.out.println(PhoneNo);
		System.out.println(address);
		System.out.println(salary);
	}
}
class Employee extends Member{
	String specialization="";
	String Department="";
	public void print() {
		System.out.println(specialization);
		System.out.println(Department);
	}
}
class Manager extends Member{
	String specialization="";
	String Department="";
	public void print() {
	System.out.println(specialization);
	System.out.println(Department);
	}
}
public class inheritence_problem {

	public static void main(String[] args) {
		Employee ob=new Employee();
		ob.Name="Rohit";
		ob.age=23;
		ob.PhoneNo=234242342;
		ob.address="house";
		ob.salary=30000;
		ob.specialization="EC";
		ob.Department="science";
		ob.printDetails();
		ob.print();
		System.out.println();
		Manager n=new Manager();
		n.Name="Kiran";
		n.age=25;
		n.PhoneNo=23984598;
		n.address="gosds";
		n.salary=24345;
		n.specialization="CS";
		n.Department="EC";
		n.printDetails();
		n.print();
	}

}
