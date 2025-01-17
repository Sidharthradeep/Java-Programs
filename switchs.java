package controlstatements;

public class switchs {

	public static void main(String[] args) {
		int a=10,b=5;
		String calculate="div";		
		switch(calculate)
		{
		case "add":System.out.println("Addition of a and b  is " + (a+b));
					break;
		case "sub":System.out.println("Substraction of a and b is " + (a-b));
					break;
		case "mul":System.out.println("Multiplication of a and b is " + (a*b));
					break;
		case "div":System.out.println("Division of a and b is " + (a/b));
					break;
		default:System.out.println("Invalid output");
		}

	}

}
