package controlstatements;

import java.util.Scanner;

public class areapgm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		areapgm ob=new areapgm();
		System.out.println("What area needed");
		String need=sc.next();
		switch(need) {
		case "triangle":System.out.println("Enter the values for area of triangle");
						int c=sc.nextInt();
						int d=sc.nextInt();
						ob.triangle(c,d);
						break;
		case "circle":System.out.println("Enter the radius of circle");
						int r=sc.nextInt();
						ob.circle(r);
						break;
		case "rectangle": System.out.println("Enter the length and breadth of rectangle");
							int l=sc.nextInt();
							int b=sc.nextInt();
							double ret=ob.rectangle(l, b);
							System.out.println("Area of rectangle is "+ret);
							break;
		case "square":System.out.println("Enter the side of the square");
		                    int d1=sc.nextInt();
		                    double retu=ob.square(d1);
		                    System.out.println("Area of Square is "+retu);
		                    break;
		default:System.out.println("Invalid");
		                    
		}
	}
	public void triangle(int a,int b) {
		double area=0.5*a*b;
		System.out.println("Area of triangle is "+area);
	}
	public void circle(int r)
	{
		double area=3.14*r*r;
		System.out.println("Area of circle is "+area);
	}
	public double rectangle(int l,int b)
	{
		double area=l*b;
		return area;
	}
	public double square(int a)
	{
		double area=a*a;
		return area;
	}
}
