package controlstatements;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		int rem=0,val=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		while(num!=0)
		{
			rem=num%10;
			val=val*10+rem;
			num=num/10;
		}
		System.out.println("The reverse number is "+val);

	}

}
