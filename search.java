package practise_problem;

import java.util.Scanner;

public class search {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] num=new int[50];
		int pos=0;
		System.out.println("Enter how many numbers");
		int n=sc.nextInt();
		System.out.println("Enter the numbers");
		for(int i=0;i<n;i++)
		{
			num[i]=sc.nextInt();
		}
		System.out.println("Enter the specific value needed");
		int s=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(num[i]==s)
			{
				pos=i+1;
				System.out.println("The specific value is found and its in position "+pos);
			}
			}
		if(pos==0)
		{
		System.out.println("Not found");
		}
		}
	}
