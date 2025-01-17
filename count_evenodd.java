package controlstatements;

import java.util.Scanner;

public class count_evenodd {

	public static void main(String[] args) {
		int even=0,odd=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("The number of odd numbers are "+odd+" and the number of even number are "+even);
	}

}
