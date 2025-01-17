package controlstatements;

import java.util.Scanner;

public class vowelcount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		vowelcount v=new vowelcount();
		System.out.println("Enter the String");
		String s=sc.next();
		v.count(s);
	}
	public void count(String s) {
		int len=s.length();
		s=s.toLowerCase();
		int count=0;
		for(int i=0;i<len;i++)
		{
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
		}
		System.out.println("The number of vowels are "+count);
	}

}
