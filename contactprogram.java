package controlstatements;

public class contactprogram {

	public static void main(String[] args) {
		String s="hello";
		String s1="welcome to Luminar";
		String s2="Hello       ";
		//concat
		System.out.println(s.concat(s1));
		System.out.println(1+2+s+3+4+s1);//3hello34welcome
		//equals
		System.out.println(s.equals(s2));
		//equalsIgnoreCase
		System.out.println(s.equalsIgnoreCase(s2));
		//contains
		System.out.println(s.contains("w"));
		//toUpperCase
		System.out.println(s.toUpperCase());
		//toLowerCase
		System.out.println(s2.toLowerCase());
		//startsWith
		System.out.println(s.startsWith(s2));
		//endsWith
		System.out.println(s.endsWith(s2));
		//length
		System.out.println(s.length());
		//charAt
		System.out.println(s.charAt(1));
		//subString
		System.out.println(s.substring(2,4));
		//trim
		System.out.println(s2.trim());
		//replace
		System.out.println(s1.replace("welcome","good"));
		//toCharArray
		char[] c=s.toCharArray();
		for(char v:c)
		{
		System.out.println(v);
		}
		//split
		String[] str=s1.split(" ");
		for(String st:str)
		{
		System.out.println(st);
		}
		
	}

}
