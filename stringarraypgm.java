package controlstatements;

import java.util.Scanner;

public class stringarraypgm {

	public static void main(String[] args) {
		char[] ar=new char[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the characters");
		for(int i=0;i<4;i++)
		{
			ar[i]=sc.next().charAt(0);	
		}
		System.out.println("The characters are");
		for(char v:ar)
		{
			System.out.println(v);
		}
	
	}

}
