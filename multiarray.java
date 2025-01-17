package controlstatements;

import java.util.Scanner;

public class multiarray {

	public static void main(String[] args) {
		int a[][]=new int[4][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Entered numbers");
		for(int[] v:a)
		{
			for(int s:v)
			{
				System.out.print(s+" ");
			}	
			System.out.println();
		}
		

	}

}
