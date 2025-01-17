package controlstatements;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a grade");
		String grade=sc.next();
		grade=grade.toUpperCase();
		switch(grade)
		{
		case "A":System.out.println("Excellent");
		         break;
		case "B":System.out.println("Good");
		         break;
		case "C":System.out.println("Average");
		         break;
		case "D":System.out.println("Need Improvement");
		         break;
		default:System.out.println("Invalid");
		}

	}

}
