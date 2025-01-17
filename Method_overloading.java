package oops;

public class Method_overloading {
	public static void main(String[] args) {
		Method_overloading ob=new Method_overloading();
		ob.add();
		ob.add(5,5);
		ob.add(5,5.5);
		ob.add(5.5,5);
		
		
	}
	public void add()
	{
		int a=5,b=6;
		int c=a+b;
		System.out.println("sum is "+c);
	}
	public void add(int a,int b) {
		int c=a+b;
		System.out.println("Sum is "+c);
	}
	public void add(int a,double b) {
		double c=a+b;
		System.out.println("sum is "+c);
	}
	public void add(double a,int b) {
		double c=a+b;
		System.out.println("sum is "+c);
	}
}
