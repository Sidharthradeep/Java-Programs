package controlstatements;

import java.util.Scanner;

public class even_odd_array {

	public static void main(String[] args) {
		int even=0,odd=0;
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("The number of even numbers are "+even+" and The number of odd numbers are "+odd);
	}

}
