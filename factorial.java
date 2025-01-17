package controlstatements;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int fact=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=scan.nextInt();
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of number "+a+" is "+fact);
	}

}
