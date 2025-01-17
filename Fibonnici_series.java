package practise_problem;

import java.util.Scanner;

public class Fibonnici_series {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.print(0+" ");
		System.out.print(1+" ");
		int num1=0;
		int num2=1;
		for(int i=2;i<n;i++)
		{
			int num3=num1+num2;
			System.out.print(num3+" ");
			num1=num2;
			num2=num3;
			
		}
	}

}
