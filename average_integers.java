package practise_problem;

import java.util.Scanner;

public class average_integers {

	public static void main(String[] args) {
		int sum=0;
		float avg=0;
		Scanner sc=new Scanner(System.in);
		int[] num=new int[10];
		System.out.println("Enter 10 numbers");
		for(int i=0;i<10;i++)
		{
			num[i]=sc.nextInt();
			sum+=num[i];
		}
		avg=sum/10;
		System.out.println("Average is "+avg);
	}

}
