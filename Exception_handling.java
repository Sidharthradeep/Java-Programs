package oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception_handling {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream f=new FileInputStream("C:downloads");
		
		
		try {
			int a=8,b=0,c;
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Arithemtic exception");
			System.out.println(e.getMessage());
		}
		try {
		String s=null;
		System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("Nullpointerexception");
			System.out.println(e.getMessage());
		}
	}

}
