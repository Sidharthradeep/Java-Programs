package controlstatements;
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int rem=0,sum=0,b;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a 3 digit number");
		int a=scan.nextInt();
		int ognum=a;
		while(a!=0)
		{
			rem=a%10;
			b=rem*rem*rem;
			sum=sum+b;
			a=a/10;
		}
		if(ognum==sum)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}

}
