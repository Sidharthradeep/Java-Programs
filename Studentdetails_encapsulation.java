package oops;
class student{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private int id;
}
public class Studentdetails_encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s=new student();
		s.setId(5);
		s.setName("sidharth");
		System.out.println(s.getId());
		System.out.println(s.getName());
	}

}
