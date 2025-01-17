package controlstatements;
import java.util.Scanner;

public class arraypgm {

	public static void main(String[] args) {
		int[] ar=new int[4];
		int sum=0;
		System.out.println("Enter numbers");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			ar[i]=sc.nextInt();
			sum+=ar[i];
		}
		System.out.println("Entered numbers");
		for(int i=0;i<4;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("Total sum is "+sum);

	}

}
