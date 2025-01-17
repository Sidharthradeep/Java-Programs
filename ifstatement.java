package controlstatements;

public class ifstatement {

	public static void main(String[] args) {
		int a=50,b=60,c=80;
		if(a>b && a>c)
		{
			System.out.println("A with value " + a + " is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("B with value " + b + " is greater");
		}
		else
		{
			System.out.println("C with value " + c + " is greater");
		}

	}

}
