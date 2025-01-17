package controlstatements;
import java.util.Scanner;

public class calculatorscan {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char out;
		do {
		System.out.println("Enter the type of calculation to do");
		String calc=scan.next();
		System.out.println("Enter the two numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		switch(calc) {
		case "add":System.out.println("Result is "+(a+b));
					break;
		case "sub":System.out.println("Result is "+(a-b));
					break;
		case "mul":System.out.println("Result is "+(a*b));
					break;
		case "div":System.out.println("Result is "+(a/b));
					break;
		default:System.out.println("Invalid input"); 
		}
		System.out.println("Do you want to continue");
		out=scan.next().charAt(0);
		}while(out=='y' || out=='Y');	
	}

}
