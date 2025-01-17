package controlstatements;
import java.util.Scanner;

public class Stringreverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String sr="",in="";
		char ch;
		System.out.println("Enter the character");
		sr=sc.next();
		int len=sr.length();
		for(int i=0;i<len;i++)
		{	
			ch=sr.charAt(i);
			in=ch+in;
		}
		System.out.println("reversed is "+in);
	if(sr.equals(in)) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not Palindrome");
	}
	}

}
