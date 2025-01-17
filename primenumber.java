package practise_problem;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive number");
		int n=sc.nextInt();
		boolean a=false;
		if(n==0 || n==1)
		{
			System.out.println("Not prime number");
		}
		else
		{
			for(int i=2;i<n/2;i++)
			{
				if(n%i==0)
				{
					System.out.println("Not prime number");
					a=true;
					break;
				}
			}	
		}
		if(a==false)
		{
		System.out.println("prime number");
		}
	}

}
