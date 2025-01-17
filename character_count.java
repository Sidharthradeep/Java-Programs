package practise_problem;

import java.util.Scanner;

public class character_count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int charlen=0;
		System.out.println("Enter the String");
		String str=sc.nextLine();
		int len=str.length();
		for(int i=0;i<len;i++) {
			if(str.charAt(i)!=' ') 
			{
				charlen++;
			}
		}
		System.out.println("The total number of characters in string "+str+" is "+charlen);

	}

}
