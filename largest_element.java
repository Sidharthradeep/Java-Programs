package controlstatements;

import java.util.Scanner;

public class largest_element {

	public static void main(String[] args) {
		int largest=0;
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		System.out.println("Enter the Elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		System.out.println("The largest element is "+largest);
	}

}
