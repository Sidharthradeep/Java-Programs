package oops;

class Parent{
	int p;
	public void parent()
	{
		System.out.println("parent method");
	}
}
class child extends Parent{
	public void child()
	{
		System.out.println("child method");
	}
}

class sub extends child{
	int s;
	
}

public class singleinheritence {

	public static void main(String[] args) {
		sub ob=new sub();
		ob.p=101;
		ob.parent();
		ob.child();
		ob.s=50;
		System.out.println(ob.p+" "+ob.s);
	}

}
