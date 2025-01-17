package practise_problem;

import java.util.Scanner;

public class String_compare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String");
		String str1=sc.next();
		System.out.println("Enter the second String");
		String str2=sc.next();
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
		

	}

}
