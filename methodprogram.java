package controlstatements;

public class methodprogram {

	public static void main(String[] args) {
		methodprogram ob=new methodprogram();
		ob.add();	
		ob.sub(5, 4);
		int m=ob.mul();
		System.out.println(m);
		double c=ob.div(5,5);
		System.out.println(c);
	}
	
//without returntype and without parameters
public void add()
{
	int a=5,b=6,c;
	c=a+b;
	System.out.println("Sum is "+c);	
}

//without returntype and with parameters
public void sub(int a,int b)
{
	int c=a-b;
	System.out.println("substration is "+c);
}

//with returntype and without parameters
public int mul()
{
	int a=5,b=5;
	int c=a*b;
	return c;
}

//with returntype and with parameters
public double div(int a,int b)
{
	double c=a/b;
	return c;
}
}